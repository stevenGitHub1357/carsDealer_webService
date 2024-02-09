package com.example.voiture.Front.Postgres.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.voiture.Front.Postgres.modele.Voiture;
import com.example.voiture.Front.Postgres.repository.*;

@RestController
@RequestMapping("/Voiture")
public class VoitureRechercheController {

    @Autowired
    private VoitureRechercheRepository service;

    @PostMapping("/search")
    public List<Voiture> getSearch(@RequestBody Voiture newObject) {
        Specification<Voiture> specification = VoitureRechercheRepository.withCritere(newObject);
        return service.findAll(specification);
    }

    @PostMapping("/searchEntre")
    public List<Voiture> getSearchP(@RequestBody Map<String, Object> requestBody) {
        Voiture object = new Voiture();
        if(requestBody.containsKey("iduser")){
            object.setIduser((int) requestBody.get("iduser"));
        }
        if(requestBody.containsKey("idmodele")){
            object.setIdmodele((int) requestBody.get("idmodele"));
        }
        if(requestBody.containsKey("idtypecarburant")){ 
            object.setIdtypecarburant((int) requestBody.get("idtypecarburant"));
        }
        if(requestBody.containsKey("kilometrage")){ 
            object.setKilometrage((double) requestBody.get("kilometrage"));
        }
        if(requestBody.containsKey("prix")){ 
            object.setPrix((double) requestBody.get("prix"));
        }
        if(requestBody.containsKey("annee")){
            object.setAnnee((int) requestBody.get("annee"));
        }
        if(requestBody.containsKey("couleur")){
            object.setCouleur((String) requestBody.get("couleur"));
        }
        if(requestBody.containsKey("prixMin")){
            object.setPrixMin((double) requestBody.get("prixMin"));
        }
        if(requestBody.containsKey("anneeMin")){
            object.setAnneeMin((int) requestBody.get("anneeMin"));
        }
        if(requestBody.containsKey("kilometrageMin")){
            object.setKilometrageMin((double) requestBody.get("kilometrageMin"));
        }
        Specification<Voiture> specification = VoitureRechercheRepository.withCritere(object);
        return service.findAll(specification);
    }
    
}

