package com.example.voiture.repository;

import java.util.List;

import org.springframework.data.jpa.domain.Specification;
import org.springframework.data.jpa.repository.JpaRepository;

import com.example.voiture.model.Voiture;

public interface VoitureRechercheRepository extends JpaRepository<Voiture, Integer> {
    // Vous pouvez ajouter des méthodes spécifiques de requête ici si nécessaire
    Voiture findById(int id);

    List<Voiture> findAll(Specification<Voiture> specification);

    /*
     * public static Specification<Voiture> withCritere(Voiture voiture) {
     * return (root, query, criteriaBuilder) -> {
     * // Créez une liste de prédicats pour les conditions spécifiées
     * // Ignorer les conditions si les variables sont nulles
     * 
     * return criteriaBuilder.and(
     * voiture.getId() != 0 ? criteriaBuilder.equal(root.get("iduser"),
     * voiture.getId())
     * : criteriaBuilder.conjunction(),
     * voiture.getIdmodele() != 0 ? criteriaBuilder.equal(root.get("idmodele"),
     * voiture.getIdmodele())
     * : criteriaBuilder.conjunction(),
     * voiture.getIdtypecarburant() != 0
     * ? criteriaBuilder.equal(root.get("idtypecarburant"),
     * voiture.getIdtypecarburant())
     * : criteriaBuilder.conjunction(),
     * voiture.getIdtransmission() != 0
     * ? criteriaBuilder.equal(root.get("idtransmission"),
     * voiture.getIdtransmission())
     * : criteriaBuilder.conjunction(),
     * voiture.getCouleur() != null ? criteriaBuilder.equal(root.get("couleur"),
     * voiture.getCouleur())
     * : criteriaBuilder.conjunction(),
     * voiture.getPrix() > voiture.getPrixMin()
     * ? criteriaBuilder.between(root.get("prix"), voiture.getPrixMin(),
     * voiture.getPrix())
     * : criteriaBuilder.conjunction(),
     * voiture.getAnnee() > voiture.getAnneeMin()
     * ? criteriaBuilder.between(root.get("annee"), voiture.getAnneeMin(),
     * voiture.getAnnee())
     * : criteriaBuilder.conjunction(),
     * voiture.getKilometrage() > voiture.getKilometrageMin()
     * ? criteriaBuilder.between(root.get("kilometrage"),
     * voiture.getKilometrageMin(),
     * voiture.getKilometrage())
     * : criteriaBuilder.conjunction(),
     * voiture.getEtat() != 0 ? criteriaBuilder.equal(root.get("etat"),
     * voiture.getEtat())
     * : criteriaBuilder.conjunction(),
     * voiture.getNiveauannonce() != 0
     * ? criteriaBuilder.equal(root.get("niveauannonce"),
     * voiture.getNiveauannonce())
     * : criteriaBuilder.conjunction());
     * };
     * }
     */
}
