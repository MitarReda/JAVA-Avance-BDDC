package Exercice5;

public class Main {
    public static void main(String[] args) {
        Cercle cercle=new Cercle("Cercle",2.5);
        System.out.println(cercle.afficherDetails());

        Rectangle rectangle=new Rectangle("Rectangle",2.5,3.6);
        System.out.println(rectangle.afficherDetails());


    }
}
