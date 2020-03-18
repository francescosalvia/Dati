package com.contactlab.dati.dati.dao;

import com.contactlab.dati.dati.properties.UtenteProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

@Component
public class DaoGeneral {

    @Autowired
    UtenteProperties utenteProperties;

    @PersistenceContext
    private EntityManager em;

    @Transactional
    public void importAll(){

        Query query = em.createNativeQuery(utenteProperties.getUrl());
        query.executeUpdate();
    }

    @Transactional
    public void outAll(String url){

        Query query = em.createNativeQuery(url);

        query.getResultList();


    }


}
