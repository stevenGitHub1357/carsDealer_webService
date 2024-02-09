package com.example.voiture.Mobile.MongoDb.repository;

import com.example.voiture.Mobile.MongoDb.modele.*;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface PhotoProfileRepository extends MongoRepository<PhotoProfile, String> {
    // Vous pouvez ajouter des méthodes personnalisées si nécessaire
    PhotoProfile findByIdUserOrderByIdDesc(int id);
}

