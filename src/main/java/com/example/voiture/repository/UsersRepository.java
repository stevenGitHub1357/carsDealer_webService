package com.example.voiture.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import com.example.voiture.model.Users;

@Repository
public interface UsersRepository extends JpaRepository<Users, Integer> {
    Users findByEmail(String email);

    @Query("SELECT m.id AS user_id, m.email AS user_email, m.mdp AS user_mdp, ma.id AS personne_id, ma.nom AS personne_nom, ma.prenom AS personne_prenom, ma.naissance AS personne_naissance, ma.genre AS personne_genre FROM Users m JOIN m.personne ma")
    List<Object[]> listUsersWithPersonne();
}
