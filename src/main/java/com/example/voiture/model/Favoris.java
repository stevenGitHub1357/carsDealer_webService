package com.example.voiture.model;

import jakarta.persistence.Id;
import jakarta.persistence.Entity;

@Entity
public class Favoris {
    @Id
    private int id;
    private int idvoiture;
    private int iduser;

    // Constructeurs, getters, setters...

    public Favoris() {
        // Constructeur par défaut nécessaire pour JPA
    }

    public Favoris(int id, int idvoiture, int iduser) {
        this.id = id;
        this.idvoiture = idvoiture;
        this.iduser = iduser;
    }

    // Getters et setters

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdvoiture() {
        return idvoiture;
    }

    public void setIdvoiture(int personne) {
        this.idvoiture = personne;
    }

    public int getiduser() {
        return iduser;
    }

    public void setiduser(int email) {
        this.iduser = email;
    }

}
