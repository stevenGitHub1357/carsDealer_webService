package com.example.voiture.controllers;

import java.util.List;
import java.util.ArrayList;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.example.voiture.model.Users;
import com.example.voiture.model.Personne;
import com.example.voiture.repository.UsersRepository;

@RestController
public class UsersController {

    @Autowired
    private UsersRepository mp;

    @GetMapping("/listUsers")
    @CrossOrigin(origins = "http://localhost:3000")
    /*public List<Users> listUsers() {
        return mp.findAll();
    }*/
    public List<Users> listUsersWithPersonne() {
        List<Object[]> resultList = mp.listUsersWithPersonne();

        List<Users> userList = new ArrayList<>();
        for (Object[] result : resultList) {
            Users user = new Users();
            user.setId((Integer) result[0]);
            user.setemail((String) result[1]);
            user.setmdp((String) result[2]);

            Personne personne = new Personne();
            personne.setId((Integer) result[3]);
            personne.setNom((String) result[4]);
            personne.setPrenom((String) result[5]);
            personne.setNaissance((Date) result[6]);
            personne.setGenre((Integer) result[7]);

            user.setPersonne(personne);

            userList.add(user);
        }

        return userList;
    }
} 
