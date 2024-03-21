package Exercice4;

public class Main {
    public static void main(String[] args) {
        Employe e1=new Ingenieur("n1","p1","n1@gmail.com","0666666",20000,"dev");
        System.out.println(e1.calculerSalire());
        System.out.println(e1);

        Employe m1=new Manager("n2","p2","n2@gmail.com","0766666",20000,"dev");
        System.out.println(m1.calculerSalire());
        System.out.println(m1.toString());
    }
}
