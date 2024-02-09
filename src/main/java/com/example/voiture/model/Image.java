package com.example.voiture.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@Document(collection = "image")
public class Image {

    @Id
    private String id;
    private String url;

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }


    public String getUrl() {
        return url;
    }
    public void setUrl(String url) {
        this.url = url;
    }
   

}