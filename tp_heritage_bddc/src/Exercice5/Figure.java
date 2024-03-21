package Exercice5;

public abstract class Figure {
    protected String nom;
    public abstract double calculerAire();
    public abstract double calculerPerimetre();

    public Figure() {
    }

    public Figure(String nom) {
        this.nom = nom;
    }

    public String afficherDetails(){
        return "Nom: "+nom+" Aire: "+calculerAire()+" Perimetre: "+calculerPerimetre();
   }
}
