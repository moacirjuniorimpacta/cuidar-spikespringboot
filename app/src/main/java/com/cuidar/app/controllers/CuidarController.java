package com.cuidar.app.controllers;

import com.cuidar.app.repository.Cuidar;
import com.cuidar.app.repository.CuidarRepository;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CuidarController {

    CuidarRepository bookRepository;

    public CuidarController(CuidarRepository bookRepository) {

        this.bookRepository = bookRepository;
    }

    @GetMapping("/cuidar/")
    public Iterable<Cuidar> getBooks() {
        return bookRepository.findAll();
    }

    
}
