package Exercice3.metier;

public class Moto extends Vehicule{
    private String marque;
    private int puissance;

    @Override
    public void emettreSon() {
        System.out.println("La moto rugit.");
    }

    public Moto() {
    }

    public Moto(String nom, double prix, String marque, int puissance) {
        super(nom, prix);
        this.marque = marque;
        this.puissance = puissance;
    }

    @Override
    public void afficherInformation() {
        super.afficherInformation();
        System.out.println("Marque:"+marque+" Puissance:"+puissance);
    }
}
