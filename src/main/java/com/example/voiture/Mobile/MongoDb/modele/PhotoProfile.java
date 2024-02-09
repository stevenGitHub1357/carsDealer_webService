package com.example.voiture.Mobile.MongoDb.modele;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

@Document(collection = "photoProfile")
public class PhotoProfile {

    @Id
    private String id;
    private int idUser;
    private byte[] photo;
    private String path;

    // Getters et setters

    public String getId() {
        return id;
    }
    public int getIdUser() {
        return idUser;
    }
    public byte[] getPhoto() throws Exception{
        return photo;
    }
    public String getPath() {
        return path;
    }

    public void setId(String id) {
        this.id = id;
    }
    public void setIdUser(int idUser) {
        this.idUser = idUser;
    }
    public void setPhoto(byte[] photo) {
        this.photo = photo;
    }
    public void setPath(String path) {
        this.path = path;
    }



    // Constructeurs
    public PhotoProfile(){}

    public PhotoProfile(int idUser, byte[] photo){
        this.idUser = idUser;
        this.photo = photo;
    }

    public PhotoProfile(String id, int idUser, byte[] photo, String path){
        this.id = id;
        this.idUser = idUser;
        this.photo = photo;
        this.path = path;
    }

    public PhotoProfile(int idUser, String path) throws Exception{
        this.idUser = idUser;
        this.path = path;
        this.photo = this.convertFileToByteArray(path);
    }

    public byte[] convertFileToByteArray(String pathToFile) throws IOException {
        Path path = Paths.get(pathToFile);
        return Files.readAllBytes(path);
    }
}
