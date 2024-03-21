package Exercice5;

public class Cercle extends Figure{

    public static final double Pi=3.14;
    private double rayon;

    public Cercle(String nom, double rayon) {
        super(nom);
        this.rayon = rayon;
    }

    @Override
    public double calculerAire() {
        return Math.PI*Math.pow(rayon,2);
    }

    @Override
    public double calculerPerimetre() {
        return 2*Math.PI*rayon;
    }
}
