package Exercice2;

public class Main {
    public static void main(String[] args) {
        Auteur auteur1=new Auteur("n1","p1","em1","tel1",40,125698);
        System.out.println(auteur1.toString());

        Adherent adherent1=new Adherent("n2","p2","em2","tel2",20,300548);
        System.out.println(adherent1.toString());

        Livre livre1=new Livre("Titre 1",auteur1);
        System.out.println(livre1.toString());
    }
}