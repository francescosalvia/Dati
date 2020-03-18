package com.contactlab.dati.dati.repository;

import com.contactlab.dati.dati.data.UtenteDb;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface UtentiPageRepository  extends PagingAndSortingRepository<UtenteDb, Integer>  {

//    List<UtenteDb> findAllByProcessed(int processed, Pageable pageable);

    Page<UtenteDb> findAllByProcessed(int processed, Pageable pageable);
}
