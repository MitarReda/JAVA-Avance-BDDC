package Exercice2;
import java.util.ArrayList;
import java.util.List;

public class Produit {
    private long id;
    private String nom;
    private String marque;
    private double prix;
    private String description;
    private int nombreEnStock;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(java.lang.String nom) {
        this.nom = nom;
    }

    public java.lang.String getMarque() {
        return marque;
    }

    public void setMarque(java.lang.String marque) {
        this.marque = marque;
    }

    public double getPrix() {
        return prix;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }

    public java.lang.String getDescription() {
        return description;
    }

    public void setDescription(java.lang.String description) {
        this.description = description;
    }

    public int getNombreEnStock() {
        return nombreEnStock;
    }

    public void setNombreEnStock(int nombreEnStock) {
        this.nombreEnStock = nombreEnStock;
    }

    public Produit(long id, String nom, String marque, double prix, String description, int nombreEnStock) {
        this.id = id;
        this.nom = nom;
        this.marque = marque;
        this.prix = prix;
        this.description = description;
        this.nombreEnStock = nombreEnStock;
    }

    // Getters et setters (non montrés pour simplifier)
}