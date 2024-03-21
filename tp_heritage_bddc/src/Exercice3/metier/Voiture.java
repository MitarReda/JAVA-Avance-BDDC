package Exercice3.metier;

public class Voiture extends Vehicule{
    private String modele;
    private String annee;

    public Voiture() {
    }

    public Voiture(String nom, double prix, String modele, String annee) {
        super(nom, prix);
        this.modele = modele;
        this.annee = annee;
    }

    @Override
    public void afficherInformation() {
        super.afficherInformation();
        System.out.println(" Modele: "+modele+" annee:"+annee);
    }

    @Override
    public void emettreSon() {
        System.out.println("La voiture vrombit.");
    }
}
