package com.example.voiture.Mobile.Postgres.controller;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.voiture.Mobile.Postgres.modele.Histoetat;
import com.example.voiture.Mobile.Postgres.repository.HistoEtatRepository;

@RestController
@RequestMapping("/HistoEtat")
public class HistoEtatController {

    @Autowired
    private HistoEtatRepository service;

    @GetMapping("/list")
    public List<Histoetat> getAll() {
        return service.findAll();
    }

    @GetMapping("/{id}")
    public List<Histoetat> getById(@PathVariable int id) {
        return service.findByIdvoiture(id);
    }

    @PostMapping("/add")
    public String ajouterObjet(@RequestBody Histoetat newObject) {
        newObject.setAjout(new Date());
        service.save(newObject);
        return "redirect:/Objets/liste";
    }
    
}

