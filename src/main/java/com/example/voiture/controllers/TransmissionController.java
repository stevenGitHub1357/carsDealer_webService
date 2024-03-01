package com.example.voiture.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.voiture.model.Transmission;
import com.example.voiture.repository.TransmissionRepository;

@RestController
@CrossOrigin(origins="*", allowedHeaders = "*")
public class TransmissionController {

    @Autowired
    private TransmissionRepository mp;

    @GetMapping("/listTransmission")
    @CrossOrigin(origins = "http://localhost:3000")
    public List<Transmission> listTransmission() {
        return mp.findAll();
    }

    @PostMapping("/insertTransmission")
    @CrossOrigin(origins = "http://localhost:3000")
    public Transmission insertTransmission(@RequestBody Transmission nouvelle) {
        return mp.save(nouvelle);
    }
    /*@PostMapping("/insertTransmission")
    @CrossOrigin(origins = "http://localhost:3000")
    public ResponseEntity<Object> insertTransmission(@RequestBody Transmission nouvelle) {
        try {
            Transmission savedTransmission = mp.save(nouvelle);
            return new ResponseEntity<>(savedTransmission, HttpStatus.OK);
        } catch (Exception e) {
            // Gérer l'erreur et renvoyer une réponse appropriée
            return new ResponseEntity<>("Erreur lors de l'insertion de la Transmission : " + e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }*/
}
