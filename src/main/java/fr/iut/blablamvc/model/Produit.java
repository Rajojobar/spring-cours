package fr.iut.blablamvc.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Produit {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String designation;

    private double prix;

    private int quantite;

    // Integration of the CRUD methods

    public Produit() {
    }

    public Produit(String designation, double prix, int quantite) {
        this.designation = designation;
        this.prix = prix;
        this.quantite = quantite;
    }

    public Integer getId() {
        return id;
    }

    public String getDesignation() {
        return designation;
    }

    public double getPrix() {
        return prix;
    }

    public int getQuantite() {
        return quantite;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }

    public void setQuantite(int quantite) {
        this.quantite = quantite;
    }

    @Override
    public String toString() {
        return "Produit [designation=" + designation + ", id=" + id + ", prix=" + prix + ", quantite=" + quantite + "]";
    }
}
