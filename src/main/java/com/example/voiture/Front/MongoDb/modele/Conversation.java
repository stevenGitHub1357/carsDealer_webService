package com.example.voiture.Front.MongoDb.modele;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Date;

@Document(collection = "conversation")
public class Conversation {

    @Id
    private String id;
    private int sender;
    private int receiver;
    private String texte;
    private Date ajout;

    public String getId() {
        return id;
    }
    public int getSender() {
        return sender;
    }
    public int getReceiver() {
        return receiver;
    }
    public String getTexte() {
        return texte;
    }
    public Date getAjout() {
        return ajout;
    }

    public void setId(String id) {
        this.id = id;
    }
    public void setSender(int sender) {
        this.sender = sender;
    }
    public void setReceiver(int receiver) {
        this.receiver = receiver;
    }
    public void setTexte(String texte) {
        this.texte = texte;
    }
    public void setAjout(Date ajout) {
        this.ajout = ajout;
    }
    public Date ajout(String ajoutS) {
        Date sqlDate = new Date(System.currentTimeMillis());
        try{
            // Créer un objet SimpleDateFormat pour analyser la chaîne
            
            if(ajoutS.equalsIgnoreCase("")!=true){
                SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

                // Parser la chaîne en tant qu'objet java.util.Date
                java.util.Date utilDate = dateFormat.parse(ajoutS);

                // Convertir l'objet java.util.Date en java.sql.Timestamp
                Timestamp timestamp = new Timestamp(utilDate.getTime());
                sqlDate = new Date(timestamp.getTime());
            }
            
        }catch(Exception e){
               e.printStackTrace();
        }
        return sqlDate;
    }

    public Conversation(){}

    public Conversation(int sender, int receiver) {
        this.sender = sender;
        this.receiver = receiver;
    }

    public Conversation(String id, int sender, int receiver, String texte, Date ajout) {
        this.id = id;
        this.sender = sender;
        this.receiver = receiver;
        this.texte = texte;
        this.ajout = ajout;
    }



}
