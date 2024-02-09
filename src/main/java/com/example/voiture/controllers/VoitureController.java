package com.example.voiture.controllers;

import java.util.List;
import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.example.voiture.model.Voiture;
import com.example.voiture.model.TypeCarburant;
import com.example.voiture.model.Modele;
import com.example.voiture.model.Users;
import com.example.voiture.repository.VoitureRepository;

@RestController
public class VoitureController {

    @Autowired
    private VoitureRepository mp;

    @GetMapping("/listVoiture")
    @CrossOrigin(origins = "http://localhost:3000")
    public List<Voiture> listVoiture() {
        return mp.findAll();
    }

    @GetMapping("/{id}")
    public Voiture getById(@PathVariable int id) {
        return mp.findById(id);
    }

    @PostMapping("/add")
    public String ajouterObjet(@RequestBody Voiture newObject) {
        mp.save(newObject);
        return "redirect:/Voiture/list";
    }

    @PostMapping("/update")
    public String updateObjet(@RequestBody Voiture newObject) {
        mp.save(newObject);
        return "redirect:/Voiture/list";
    }

    /*
     * public List<Voiture> listVoitureDetails() {
     * List<Object[]> resultList = mp.listVoitureDetails();
     * 
     * List<Voiture> voitureList = new ArrayList<>();
     * for (Object[] result : resultList) {
     * Voiture voiture = new Voiture();
     * voiture.setId((Integer) result[0]);
     * voiture.setKilometrage((Integer) result[4]);
     * voiture.setCouleur((String) result[5]);
     * voiture.setPrix((Double) result[6]);
     * 
     * Users user = new Users();
     * user.setId((Integer) result[1]);
     * 
     * Modele modele = new Modele();
     * modele.setNom((String) result[2]);
     * 
     * TypeCarburant carb = new TypeCarburant();
     * carb.setNom((String) result[3]);
     * 
     * voiture.setUser(user);
     * voiture.setModele(modele);
     * voiture.setTypeCarburant(carb);
     * 
     * voitureList.add(voiture);
     * }
     * 
     * return voitureList;
     * }
     */
}
