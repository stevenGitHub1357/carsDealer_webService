package com.example.voiture.Front.Postgres.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.voiture.Front.Postgres.modele.Voiture;
import com.example.voiture.Front.Postgres.repository.VoitureRepository;

@RestController
@RequestMapping("/Voiture")
public class VoitureController {

    @Autowired
    private VoitureRepository service;

    @GetMapping("/list")
    public List<Voiture> getAll() {
        return service.findAll();
    }

    @GetMapping("/{id}")
    public Voiture getById(@PathVariable int id) {
        return service.findById(id);
    }

    @PostMapping("/add")
    public String ajouterObjet(@RequestBody Voiture newObject) {
        service.save(newObject);
        return "redirect:/Voiture/list";
    }
    @PostMapping("/update")
    public String updateObjet(@RequestBody Voiture newObject) {
        service.save(newObject);
        return "redirect:/Voiture/list";
    }
    
}

