package com.example.voiture.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.JoinColumn;


@Entity
public class Modele {
    @Id
    private int id;
    //private int idmarque;
    private String nom;
    
    @ManyToOne
    @JoinColumn(name = "idmarque")
    private Marque marque;
    
    public Modele() {
        // Constructeur par défaut nécessaire pour JPA
    }

    public Modele(int id, String nom) {
        this.id = id;
        this.nom = nom;
    }

    // Getters et setters

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Marque getMarque() {
        return marque;
    }

    public void setMarque(Marque marque) {
        this.marque = marque;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String email) {
        this.nom = email;
    }

}
