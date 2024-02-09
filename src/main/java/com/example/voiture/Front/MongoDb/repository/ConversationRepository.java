package com.example.voiture.Front.MongoDb.repository;


import com.example.voiture.Front.MongoDb.modele.*;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface ConversationRepository extends MongoRepository<Conversation, String> {

    List<Conversation> findByReceiverAndSenderOrReceiverAndSenderOrderByAjout(int receiver1, int sender1, int receiver2, int sender2);
    

}
