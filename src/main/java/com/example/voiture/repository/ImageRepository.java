package com.example.voiture.repository;


import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.voiture.model.Image;

public interface ImageRepository extends MongoRepository<Image, String> {
    

}
