package Exercice2;

public class Livre {
    private String titre;
    private Auteur auteur;

    public Livre() {
    }

    public Livre(String titre, Auteur auteur) {
        this.titre = titre;
        this.auteur = auteur;
    }

    @Override
    public String toString() {
        return "titre='" + titre + '\'' +
                ", auteur=" + auteur.toString() ;
    }
}
