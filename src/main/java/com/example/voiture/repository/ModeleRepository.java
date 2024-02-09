package com.example.voiture.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.Query;
import java.util.List;
import com.example.voiture.model.Modele;

@Repository
public interface ModeleRepository extends JpaRepository<Modele, Integer> {
    @Query("SELECT m.nom AS modele_nom, ma.nom AS marque_nom FROM Modele m JOIN m.marque ma")
    List<Object[]> listModeleWithMarque();
}
