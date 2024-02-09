package com.example.voiture.model;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Personne {

    @Id
    private int id;

    private String nom;

    private String prenom;

    private Date naissance;

    private int genre;

    // Constructeurs, getters, setters...

    public Personne() {
        // Constructeur par défaut nécessaire pour JPA
    }

    public Personne(int id, String nom, String prenom, Date naissance, int genre) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.naissance = naissance;
        this.genre = genre;
    }

    // Getters et setters pour chaque attribut

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public Date getNaissance() {
        return naissance;
    }

    public void setNaissance(Date naissance) {
        this.naissance = naissance;
    }

    public int getGenre() {
        return genre;
    }

    public void setGenre(int genre) {
        this.genre = genre;
    }
}
