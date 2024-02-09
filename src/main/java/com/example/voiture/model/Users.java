package com.example.voiture.model;

import jakarta.persistence.Id;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.JoinColumn;

@Entity
public class Users {
    @Id
    private int id;

    @ManyToOne
    @JoinColumn(name = "idpersonne")
    private Personne personne;

    private String email;
    private String mdp;

    // Constructeurs, getters, setters...

    public Users() {
        // Constructeur par défaut nécessaire pour JPA
    }

    public Users(int id, String email, String mdp) {
        this.id = id;
        this.email = email;
        this.mdp = mdp;
    }

    // Getters et setters

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Personne getPersonne() {
        return personne;
    }

    public void setPersonne(Personne personne) {
        this.personne = personne;
    }

    public String getemail() {
        return email;
    }

    public void setemail(String email) {
        this.email = email;
    }

    public String getmdp() {
        return mdp;
    }

    public void setmdp(String mdp) {
        this.mdp = mdp;
    }

}
