package Exercice3.metier;

public class Vehicule {
    private String nom;
    private double prix;

    public Vehicule() {
    }

    public Vehicule(String nom, double prix) {
        this.nom = nom;
        this.prix = prix;
    }

    public void emettreSon(){
        System.out.println(" Le véhicule émet un son inconnu");
    }

    public void afficherInformation(){
        System.out.print ("Nom:"+nom+", Prix:"+prix);
    }
}
