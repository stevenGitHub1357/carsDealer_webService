package com.example.voiture.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.example.voiture.model.Personne;
import com.example.voiture.repository.PersonneRepository;

@RestController
public class PersonneController {

    @Autowired
    private PersonneRepository mp;

    @GetMapping("/listPersonne")
    @CrossOrigin(origins = "http://localhost:3000")
    public List<Personne> listPersonne() {
        return mp.findAll();
    }
}
