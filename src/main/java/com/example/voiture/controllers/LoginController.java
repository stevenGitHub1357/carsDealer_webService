package com.example.voiture.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;

import com.example.voiture.model.Users;
import com.example.voiture.repository.UsersRepository;

@RestController
public class LoginController {
    @Autowired
    private UsersRepository mp;

    @PostMapping("/login")
    @CrossOrigin(origins = "http://localhost:3000")
    public ResponseEntity<String> login(@RequestBody Users loginRequest) {
        try {
            System.out.println("tonga");
            Users user = mp.findByEmail(loginRequest.getemail());
            if (user != null && user.getmdp().equals(loginRequest.getmdp())) {
                System.out.println("reussie");
                return ResponseEntity.ok("Connexion réussie !");
            } else {
                System.out.println("error");
                return ResponseEntity.status(401).body("Échec de l'authentification. Nom d'utilisateur ou mot de passe incorrect.");
            }
        } catch (Exception e) {
            e.printStackTrace();
            return ResponseEntity.status(500).body("Erreur interne du serveur.");
    
        }
    }
}
