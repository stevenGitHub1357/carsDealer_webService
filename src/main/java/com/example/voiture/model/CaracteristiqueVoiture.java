package com.example.voiture.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "caracteristiquevoiture")
public class CaracteristiqueVoiture {

    @Id
    private String id;
 
    private String idvoiture;

    private String idcaracteristique;

    private int valeur;

    // Constructeurs, getters, setters...

    // Constructeur par défaut
    public CaracteristiqueVoiture() {
    }

    // Constructeur avec paramètres
    public CaracteristiqueVoiture(String id, String idvoiture, String idcaracteristique, int valeur) {
        this.id = id;
        this.idvoiture = idvoiture;
        this.idcaracteristique = idcaracteristique;
        this.valeur = valeur;
    }

    // Getters et setters
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getVoiture() {
        return idvoiture;
    }

    public void setVoiture(String voiture) {
        this.idvoiture = voiture;
    }

    public String getCaracteristique() {
        return idcaracteristique;
    }

    public void setCaracteristique(String caracteristique) {
        this.idcaracteristique = caracteristique;
    }

    public int getValeur() {
        return valeur;
    }

    public void setValeur(int valeur) {
        this.valeur = valeur;
    }
}
