package com.example.voiture.controllers;

import java.util.List;
import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.transaction.annotation.Transactional;

import com.example.voiture.model.Marque;
import com.example.voiture.model.Modele;
import com.example.voiture.repository.ModeleRepository;

@RestController
public class ModeleController {

    @Autowired
    private ModeleRepository mp;

    /*@GetMapping("/listModele")
    @CrossOrigin(origins = "http://localhost:3000")
    public List<Modele> listModele() {
        return mp.findAll();
    }*/

    @Transactional(readOnly = true)
    @GetMapping("/listModele")
    @CrossOrigin(origins = "http://localhost:3000")
    /*public List<Map<String, String>> listModeleWithMarque() {
        List<Object[]> resultList = mp.listModeleWithMarque(); // Utilisez votre propre méthode de requête native SQL ou JPQL

        List<Map<String, String>> modeleList = new ArrayList<>();
        for (Object[] result : resultList) {
            Map<String, String> modeleMap = new HashMap<>();
            modeleMap.put("modele_nom", (String) result[0]);
            modeleMap.put("marque_nom", (String) result[1]);
            modeleList.add(modeleMap);
        }

        return modeleList;
    }*/

    public List<Modele> listModeleWithMarque() {
        List<Object[]> resultList = mp.listModeleWithMarque();

        List<Modele> modeleList = new ArrayList<>();
        for (Object[] result : resultList) {
            Modele modele = new Modele();
            modele.setNom((String) result[0]);

            Marque marque = new Marque();
            marque.setNom((String) result[1]);

            modele.setMarque(marque);

            modeleList.add(modele);
        }

        return modeleList;
    }
}
