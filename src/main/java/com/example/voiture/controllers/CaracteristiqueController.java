package com.example.voiture.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.example.voiture.model.Caracteristique;
import com.example.voiture.repository.CaracteristiqueRepository;

@RestController
public class CaracteristiqueController {

    @Autowired
    private CaracteristiqueRepository mp;

    @GetMapping("/listCaracteristique")
    @CrossOrigin(origins = "http://localhost:3000")
    public List<Caracteristique> listCaracteristique() {
        return mp.findAll();
    }
}
 