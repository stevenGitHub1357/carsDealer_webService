package com.example.voiture.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.voiture.model.CaracteristiqueVoiture;
import com.example.voiture.repository.CaracteristiqueVoitureRepository;

@RestController
public class CaracteristiqueVoitureController {

    @Autowired
    private CaracteristiqueVoitureRepository mp;

    @GetMapping("/listCaracteristiqueVoiture")
    public List<CaracteristiqueVoiture> listCaracteristiqueVoiture() {
        return mp.findAll();
    }
}
