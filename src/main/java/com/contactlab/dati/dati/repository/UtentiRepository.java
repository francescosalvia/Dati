package com.contactlab.dati.dati.repository;

import com.contactlab.dati.dati.data.UtenteDb;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface UtentiRepository extends PagingAndSortingRepository<UtenteDb, Integer> {

    //List<UtenteDb> findAllByProcessed(int processed, Pageable pageable);

   // List<UtenteDb> findTop100ByProcessed(int processed);

}

