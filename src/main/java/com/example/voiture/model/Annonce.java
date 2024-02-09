package com.example.voiture.model;

import jakarta.persistence.Id;
import jakarta.persistence.Entity;

@Entity
public class Annonce {
    
    @Id
    private int id;
    private int idimagevoiture;
    private String publication;

    // Constructeurs, getters, setters...

    public Annonce() {
        // Constructeur par défaut nécessaire pour JPA
    }

    public Annonce(int id, int idImageVoiture, String publication) {
        this.id = id;
        this.idimagevoiture = idImageVoiture;
        this.publication = publication;
    }

    // Getters et setters

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdImageVoiture() {
        return idimagevoiture;
    }

    public void setIdImageVoiture(int personne) {
        this.idimagevoiture = personne;
    }

    public String getPublication() {
        return publication;
    }

    public void setPublication(String email) {
        this.publication = email;
    }

}
