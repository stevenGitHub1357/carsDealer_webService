package com.example.voiture.Front.Postgres.modele;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Transient;


@Entity
public class Voiture {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id ;
    int iduser ;
    int idmodele ;
    int idtypecarburant ;
    int idtransmission;
    double kilometrage ;
    String couleur ;
    double prix;
    double annee;
    int etat;
    int niveauannonce;
    String descriptions;

    @Transient
    double prixMin;
    @Transient
    double anneeMin;
    @Transient
    double kilometrageMin;

    public Voiture() {
    }
    public Voiture(int id , int iduser , int idmodele , int idtypecarburant , int idtransmission, double kilometrage , String couleur , double prix , int annee) {
        this.id = id;
        this.iduser = iduser;
        this.idmodele = idmodele;
        this.idtypecarburant = idtypecarburant;
        this.idtransmission = idtransmission;
        this.kilometrage = kilometrage;
        this.couleur = couleur;
        this.prix = prix;
        this.setAnnee(annee);
    }
    public Voiture(int id , int iduser , int idmodele , int idtypecarburant , double kilometrage , String couleur , double prix , int annee, int etat, int niveauannonce, String descriptions) {
        this.id = id;
        this.iduser = iduser;
        this.idmodele = idmodele;
        this.idtypecarburant = idtypecarburant;
        this.kilometrage = kilometrage;
        this.couleur = couleur;
        this.prix = prix;
        this.setAnnee(annee);
        this.etat = etat;
        this.niveauannonce = niveauannonce;
        this.descriptions = descriptions;
    }

    public int getId() {
        return id;
    }
    public int getIduser() {
        return iduser;
    }
    public int getIdmodele() {
        return idmodele;
    }
    public int getIdtypecarburant() {
        return idtypecarburant;
    }
    public String getCouleur() {
        return couleur;
    }
    public double getKilometrage() {
        return kilometrage;
    }
    public double getPrix() {
        return prix;
    }
    public double getAnnee() {
        return annee;
    }
    public double getAnneeMin() {
        return anneeMin;
    }
    public double getKilometrageMin() {
        return kilometrageMin;
    }
    public double getPrixMin() {
        return prixMin;
    }
    public String getDescriptions() {
        return descriptions;
    }
    public int getEtat() {
        return etat;
    }
    public int getIdtransmission() {
        return idtransmission;
    }
    public int getNiveauannonce() {
        return niveauannonce;
    }



    public void setId(int id) {
        this.id = id;
    }
    public void setIdmodele(int idmodele) {
        this.idmodele = idmodele;
    }
    public void setIdtypecarburant(int idTypecarburant) {
        this.idtypecarburant = idTypecarburant;
    }
    public void setIduser(int iduser) {
        this.iduser = iduser;
    }
    public void setCouleur(String couleur) {
        this.couleur = couleur;
    }
    public void setKilometrage(double kilometrage) {
        this.kilometrage = kilometrage;
    }
    public void setPrix(double prix) {
        this.prix = prix;
    }
    public void setAnnee(int annee) {
        this.annee = annee;
    }
    public void setAnneeMin(double anneeMin) {
        this.anneeMin = anneeMin;
    }
    public void setKilometrageMin(double kilometrageMin) {
        this.kilometrageMin = kilometrageMin;
    }
    public void setPrixMin(double prixMin) {
        this.prixMin = prixMin;
    }
    public void setDescriptions(String descriptions) {
        this.descriptions = descriptions;
    }
    public void setEtat(int etat) {
        this.etat = etat;
    }
    public void setIdtransmission(int idtransmission) {
        this.idtransmission = idtransmission;
    }
    public void setNiveauannonce(int niveauannonce) {
        this.niveauannonce = niveauannonce;
    }
    
    
        
    

    

}
