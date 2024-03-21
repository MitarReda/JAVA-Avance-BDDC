package Exercice2;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
public class Application {
    public static void main(String[] args) {
        MetierProduitImpl metierProduit = new MetierProduitImpl();

        Scanner scanner = new Scanner(System.in);
        int choix;

        do {
            System.out.println("Menu :");
            System.out.println("1. Afficher la liste des produits.");
            System.out.println("2. Rechercher un produit par son id.");
            System.out.println("3. Ajouter un nouveau produit dans la liste.");
            System.out.println("4. Supprimer un produit par id.");
            System.out.println("5. Quitter le programme.");
            System.out.print("Choix : ");
            choix = scanner.nextInt();
            scanner.nextLine();

            switch (choix) {
                case 1:
                    afficherListeProduits(metierProduit);
                    break;
                case 2:
                    rechercherProduitParId(scanner, metierProduit);
                    break;
                case 3:
                    ajouterNouveauProduit(scanner, metierProduit);
                    break;
                case 4:
                    supprimerProduitParId(scanner, metierProduit);
                    break;
                case 5:
                    System.out.println("Programme terminé.");
                    break;
                default:
                    System.out.println("Choix invalide.");
            }
        } while (choix != 5);

        scanner.close();
    }

    private static void afficherListeProduits(MetierProduitImpl metierProduit) {
        List<Produit> listeProduits = metierProduit.getAll();
        System.out.println("Liste des produits :");
        for (Produit produit : listeProduits) {
            System.out.println(produit.getId() + " - " + produit.getNom() + " - " + produit.getPrix());
        }
    }

    private static void rechercherProduitParId(Scanner scanner, MetierProduitImpl metierProduit) {
        System.out.print("Entrez l'id du produit : ");
        long id = scanner.nextLong();
        Produit produit = metierProduit.findById(id);
        if (produit != null) {
            System.out.println("Produit trouvé : " + produit.getId() + " - " + produit.getNom() + " - " + produit.getPrix());
        } else {
            System.out.println("Aucun produit trouvé avec cet id.");
        }
    }

    private static void ajouterNouveauProduit(Scanner scanner, MetierProduitImpl metierProduit) {
        System.out.print("Entrez l'id du produit : ");
        long id = scanner.nextLong();
        scanner.nextLine(); // Consommer la nouvelle ligne
        System.out.print("Entrez le nom du produit : ");
        String nom = scanner.nextLine();
        System.out.print("Entrez la marque du produit : ");
        String marque = scanner.nextLine();
        System.out.print("Entrez le prix du produit : ");
        double prix = scanner.nextDouble();
        scanner.nextLine(); // Consommer la nouvelle ligne
        System.out.print("Entrez la description du produit : ");
        String description = scanner.nextLine();
        System.out.print("Entrez le nombre en stock du produit : ");
        int nombreEnStock = scanner.nextInt();

        Produit nouveauProduit = new Produit(id, nom, marque, prix, description, nombreEnStock);
        metierProduit.add(nouveauProduit);
        System.out.println("Nouveau produit ajouté.");
    }

    private static void supprimerProduitParId(Scanner scanner, MetierProduitImpl metierProduit) {
        System.out.print("Entrez l'id du produit à supprimer : ");
        long id = scanner.nextLong();
        metierProduit.delete(id);
        System.out.println("Produit supprimé.");
    }
}
