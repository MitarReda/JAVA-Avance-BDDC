package Exercice1;

public class Produit {
    private long id;
    private String nom;
    private double prix;

    public Produit() {
    }

    public Produit(long id, java.lang.String nom, double prix) {
        this.id = id;
        this.nom = nom;
        this.prix = prix;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public java.lang.String getNom() {
        return nom;
    }

    public void setNom(java.lang.String nom) {
        this.nom = nom;
    }

    public double getPrix() {
        return prix;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "Produit{" +
                "id=" + id +
                ", nom=" + nom +
                ", prix=" + prix +
                '}';
    }
}
