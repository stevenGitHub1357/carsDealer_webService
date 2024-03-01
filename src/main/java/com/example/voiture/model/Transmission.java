package com.example.voiture.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;

@Entity
public class Transmission {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nom;

    // Constructeur par défaut
    public Transmission() {
    }

    // Constructeur avec paramètres
    public Transmission(int id, String nom) {
        this.id = id;
        this.nom = nom;
    }

    // Getter pour l'attribut id
    public int getId() {
        return id;
    }

    // Setter pour l'attribut id
    public void setId(int id) {
        this.id = id;
    }

    // Getter pour l'attribut nom
    public String getNom() {
        return nom;
    }

    // Setter pour l'attribut nom
    public void setNom(String nom) {
        this.nom = nom;
    }
}
