package com.example.voiture.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import java.util.List;
import com.example.voiture.model.Voiture;

@Repository
public interface VoitureRepository extends JpaRepository<Voiture, Integer> {
    /*
     * @Query("SELECT voiture.id AS voiture_id, users.id AS users_id, modele.nom AS modele, typecarburant.nom AS carburant, voiture.kilometrage AS kilometrage, voiture.couleur AS couleur, voiture.prix AS prix FROM voiture JOIN users ON voiture.iduser = users.id JOIN modele ON voiture.idmodele = modele.id JOIN typecarburant ON voiture.idtypecarburant = typecarburant.id"
     * )
     * List<Object[]> listVoitureDetails();
     */
    Voiture findById(int id);

}
