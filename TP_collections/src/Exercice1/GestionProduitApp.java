package Exercice1;
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;
public class GestionProduitApp {
    public static void main(String[] args) {
        List<Produit> produits = new ArrayList();
        //Q1
        produits.add(new Produit(1,"HP",18000));
        produits.add(new Produit(2,"MAC",28000));
        produits.add(new Produit(3,"DELL",38000));
        //Q2
        produits.remove(0);
        //Q3
        for(Produit p:produits){
            System.out.println(p);
        }
        //Q4
        produits.get(0).setPrix(25000);
        for(Produit p:produits){
            System.out.println(p);
        }
        //Q5
        Scanner scanner=new Scanner(System.in);
        System.out.println("Entrez un mot clé");
        String keyWord=scanner.next();

        for(Produit p:produits){
            if(p.getNom().contains(keyWord)){
                System.out.println(p);
            }
        }
    }
}
