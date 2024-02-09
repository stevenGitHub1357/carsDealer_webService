package com.example.voiture.Mobile.Postgres.modele;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;


@Entity
public class Histoetat {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;
    int idvoiture;
    int etat;
    Date ajout;

    public Histoetat() {
    }
    public Histoetat(int id, int idvoiture, int etat, Date ajout) {
        this.id = id;
        this.idvoiture = idvoiture;
        this.etat = etat;
        this.ajout = ajout;

    }

    public int getId() {
        return id;
    }
    public int getIdvoiture() {
        return idvoiture;
    }
    public int getEtat(){
        return etat;
    }
    public Date getAjout() {
        return ajout;
    }



    public void setId(int id) {
        this.id = id;
    }
    public void setIdvoiture(int idvoiture) {
        this.idvoiture = idvoiture;
    }
    public void setEtat(int etat) {
        this.etat = etat;
    }
    public void setAjout(Date ajout) {
        this.ajout = ajout;
    }
        
    

    

}
