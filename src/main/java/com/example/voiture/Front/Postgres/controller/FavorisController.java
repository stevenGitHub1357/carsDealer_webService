package com.example.voiture.Front.Postgres.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.voiture.Front.Postgres.modele.Favoris;
import com.example.voiture.Front.Postgres.repository.FavorisRepository;

@RestController
@RequestMapping("/Favoris")
public class FavorisController {

    @Autowired
    private FavorisRepository service;

    @GetMapping("/list")
    public List<Favoris> getAll() {
        return service.findAll();
    }

    @GetMapping("/user/{id}")
    public List<Favoris> getByIduser(@PathVariable int id) {
        return service.findByIduser(id);
    }

    @GetMapping("/voiture/{id}")
    public List<Favoris> getByIdvoiture(@PathVariable int id) {
        return service.findByIdvoiture(id);
    }

    @PostMapping("/add")
    public String ajouterObjet(@RequestBody Favoris newObject) {
        service.save(newObject);
        return "redirect:/Objets/liste";
    }
    
}

