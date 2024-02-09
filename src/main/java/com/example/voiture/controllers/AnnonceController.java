package com.example.voiture.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.example.voiture.model.Annonce;
import com.example.voiture.repository.AnnonceRepository;

@RestController
public class AnnonceController {

    @Autowired
    private AnnonceRepository mp;

    @GetMapping("/listAnnonce")
    @CrossOrigin(origins = "http://localhost:3000")
    public List<Annonce> listAnnonce() {
        return mp.findAll();
    }
}
