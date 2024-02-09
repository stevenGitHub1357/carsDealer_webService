package com.example.voiture.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Caracteristique {

    @Id
    private int id;
    private String nom;

    // Constructeur par défaut
    public Caracteristique() {
    }

    // Constructeur avec paramètres
    public Caracteristique(int id, String nom) {
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
