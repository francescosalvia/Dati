package com.contactlab.dati.dati.config;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;

import java.util.concurrent.BlockingQueue;

@Configuration
public class
ThreadPoolBean {

    private final static Logger logger = LoggerFactory.getLogger(ThreadPoolBean.class);

    private static final Integer DEFAULT_CORE_POOL_SIZE = 1;
    private static final Integer DEFAULT_MAX_CORE_POOL_SIZE = 1;
    private static final Integer DEFAULT_QUEUE_CAPACITY = 0;

    public ThreadPoolTaskExecutor newTaskExecutor(boolean enable, int poolSize, int maxPoolSize, int queueCapacity,
                                                  String prefixName) {

        ThreadPoolTaskExecutor newPool = new ThreadPoolTaskExecutor();

        newPool.setWaitForTasksToCompleteOnShutdown(true);
        newPool.setThreadNamePrefix(prefixName);

        if (enable) {
            newPool.setCorePoolSize(poolSize);
            newPool.setMaxPoolSize(maxPoolSize);
            newPool.setQueueCapacity(queueCapacity);
        } else {
            newPool.setCorePoolSize(DEFAULT_CORE_POOL_SIZE);
            newPool.setMaxPoolSize(DEFAULT_MAX_CORE_POOL_SIZE);
            newPool.setQueueCapacity(DEFAULT_QUEUE_CAPACITY);
        }

        newPool.initialize();

        return newPool;
    }

    public int waitingQueueCapacity(long millisecondsToWait, ThreadPoolTaskExecutor taskExecutor,
                                    final Integer queueFreeSlotsTresholdToEndWaiting) {
        final BlockingQueue<Runnable> threadPoolBackingQueue = taskExecutor.getThreadPoolExecutor().getQueue();
        int returnValue = 0;

        while (true) {
            try {
                Thread.sleep(millisecondsToWait);
            } catch (InterruptedException e) {
                logger.error("Error: ", e);
                Thread.currentThread().interrupt();
                returnValue = -1;
                break;
            }
            final int activeThreadsInPool = taskExecutor.getActiveCount();

            if (queueFreeSlotsTresholdToEndWaiting > 0) {
                final int queueRemainingCapacity = threadPoolBackingQueue.remainingCapacity();

                if (queueRemainingCapacity >= queueFreeSlotsTresholdToEndWaiting) {
                    returnValue = queueRemainingCapacity;
                    logger.info("Returning from waiting with queue free slots: " + returnValue);
                    break;
                }
            } else {
                if (activeThreadsInPool == 0 && threadPoolBackingQueue.isEmpty()) {
                    returnValue = taskExecutor.getMaxPoolSize() + threadPoolBackingQueue.remainingCapacity();
                    logger.info("Returning from waiting with no queue and maximum pool capacity: " + returnValue);
                    break;
                }
            }
        }
        return returnValue;
    }


}
