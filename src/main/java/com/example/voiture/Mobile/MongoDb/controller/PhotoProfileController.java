package com.example.voiture.Mobile.MongoDb.controller;

import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.voiture.Mobile.MongoDb.modele.*;
import com.example.voiture.Mobile.MongoDb.repository.*;

@RestController
@RequestMapping("/PhotoProfile")
public class PhotoProfileController {

    @Autowired
    private PhotoProfileRepository service;

    @GetMapping("/list")
    public List<PhotoProfile> getAll() {
        return service.findAll();
    }

    @GetMapping("/{id}")
    public PhotoProfile getById(@PathVariable int id) {
        return service.findByIdUserOrderByIdDesc(id);
    }

    @PostMapping("/add")
    public String ajouterObjet(@RequestBody PhotoProfile newObject) {
        service.save(newObject);
        return "redirect:/PhotoProfile/list";
    }
}


