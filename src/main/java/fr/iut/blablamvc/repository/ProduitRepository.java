package fr.iut.blablamvc.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.iut.blablamvc.model.Produit;

public interface ProduitRepository extends JpaRepository<Produit, Integer> {

    
}
