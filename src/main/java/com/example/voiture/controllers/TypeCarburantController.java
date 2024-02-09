package com.example.voiture.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.example.voiture.model.TypeCarburant;
import com.example.voiture.repository.TypeCarburantRepository;

@RestController
public class TypeCarburantController {

    @Autowired
    private TypeCarburantRepository mp;

    @GetMapping("/listCarburant")
    @CrossOrigin(origins = "http://localhost:3000")
    public List<TypeCarburant> listTypeCarburant() {
        return mp.findAll();
    }
}
