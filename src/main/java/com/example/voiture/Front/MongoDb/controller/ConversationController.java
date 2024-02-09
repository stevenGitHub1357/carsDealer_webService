package com.example.voiture.Front.MongoDb.controller;

import java.util.Date;
import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.voiture.Front.MongoDb.modele.*;
import com.example.voiture.Front.MongoDb.repository.*;

@RestController
@RequestMapping("/Conversation")
public class ConversationController {

    @Autowired
    public ConversationRepository service;

    @GetMapping("/list")
    public List<Conversation> getAll() {
        System.out.println(service.findAll());
        return service.findAll();
    }

    @PostMapping("/search")
    public List<Conversation> getBySenderOrReceiver(@RequestBody Conversation object) {
        return service.findByReceiverAndSenderOrReceiverAndSenderOrderByAjout(object.getReceiver(), object.getSender(), object.getSender(), object.getReceiver());
    }

    @PostMapping("/add")
    public String ajouterObjet(@RequestBody Conversation newObject) {
        newObject.setAjout(new Date());
        service.save(newObject);
        return "redirect:/Conversation/list";
    }
}


