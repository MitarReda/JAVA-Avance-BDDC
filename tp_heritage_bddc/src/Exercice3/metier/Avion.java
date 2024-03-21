package Exercice3.metier;

public class Avion extends Vehicule{
    private String compagnie;
    private int vitesseMax;

    public Avion() {
    }

    public Avion(String nom, double prix, String compagnie, int vitesseMax) {
        super(nom, prix);
        this.compagnie = compagnie;
        this.vitesseMax = vitesseMax;
    }

    @Override
    public void emettreSon() {
        System.out.println("L'avion fait un bruit de moteur puissant");
    }

    @Override
    public void afficherInformation() {
            super.afficherInformation();
            System.out.println("Compagnie: "+compagnie+" Vitesse Max"+vitesseMax);
    }
}
