package com.example.voiture.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.voiture.model.Marque;
import com.example.voiture.repository.MarqueRepository;

@RestController
@CrossOrigin(origins="*", allowedHeaders = "*")
public class MarqueController {

    @Autowired
    private MarqueRepository mp;

    @GetMapping("/listMarque")
    @CrossOrigin(origins = "http://localhost:3000")
    public List<Marque> listMarque() {
        return mp.findAll();
    }

    @PostMapping("/insertMarque")
    @CrossOrigin(origins = "http://localhost:3000")
    public Marque insertMarque(@RequestBody Marque nouvelle) {
        return mp.save(nouvelle);
    }
    /*@PostMapping("/insertMarque")
    @CrossOrigin(origins = "http://localhost:3000")
    public ResponseEntity<Object> insertMarque(@RequestBody Marque nouvelle) {
        try {
            Marque savedMarque = mp.save(nouvelle);
            return new ResponseEntity<>(savedMarque, HttpStatus.OK);
        } catch (Exception e) {
            // Gérer l'erreur et renvoyer une réponse appropriée
            return new ResponseEntity<>("Erreur lors de l'insertion de la marque : " + e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }*/
}
