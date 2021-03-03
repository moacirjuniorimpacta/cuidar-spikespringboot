package com.cuidar.app.controllers;

import com.cuidar.app.repository.Cuidar;
import com.cuidar.app.repository.CuidarRepository;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CuidarController {

    CuidarRepository cuidarRepo;

    public CuidarController(CuidarRepository cuidarRepo) {

        this.cuidarRepo = cuidarRepo;
    }

    @GetMapping("/cuidar/")
    public Iterable<Cuidar> get() {
        return cuidarRepo.findAll();
    }

    
}
