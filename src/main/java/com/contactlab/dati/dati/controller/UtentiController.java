package com.contactlab.dati.dati.controller;

import com.contactlab.dati.dati.service.UtenteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@ComponentScan(basePackages = "com.contactlab.iscritti.service")
public class UtentiController {


    @Autowired(required=true)
    UtenteService service;


/*@PostMapping("/leggi")
    public void leggiFile() {
    service.readUtenteFromCSV1();
}*/

    @PostMapping("/leggi")
    public void leggiFile() {
        service.readAll();
    }

    @PostMapping("/scrivi")
    public void scrivi() {
        service.out();
    }

    @PostMapping("/test")
    public void test() {
        service.modificaDati();
    }

    @PostMapping("/upload")
    public void upload() {
        service.uploadFile();
    }

    @PostMapping("/prova")
    public void prova() {
        service.prova();
    }


}
