package Exercice3;

import Exercice3.metier.Avion;
import Exercice3.metier.Moto;
import Exercice3.metier.Voiture;

public class Main {
    public static void main(String[] args) {
        Voiture voiture1=new Voiture("BMW",500000,"m1","2023");
        voiture1.emettreSon();
        voiture1.afficherInformation();

        Moto moto1=new Moto("X-ADV",12000,"Honda",1200);
        moto1.emettreSon();
        moto1.afficherInformation();

        Avion avion1=new Avion("d-596",200000,"Boeing",1200);
        avion1.emettreSon();
        avion1.afficherInformation();
    }
}
