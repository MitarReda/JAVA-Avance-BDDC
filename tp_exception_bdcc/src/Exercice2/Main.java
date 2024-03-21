package Exercice2;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<CompteBancaire> listeComptes = new ArrayList<>();


        listeComptes.add(new CompteCourant("123456", 100, "Client 1", 400));
        listeComptes.add(new CompteEpargne("789012", 16000, "Client 1", 0.05));
        listeComptes.add(new CompteCourant("8569455", 502000, "Client 2", 500));
        listeComptes.add(new CompteEpargne("736992", 256000, "Client 2", 0.05));

        listeComptes.remove(2);


        try {
            CompteBancaire compte1 = listeComptes.get(0);
            CompteBancaire compte2 = listeComptes.get(1);

            compte1.afficherSolde();
            compte2.afficherSolde();

            compte1.retirerArgent(200);
        } catch (FondsInsuffisantsException e) {
            System.out.println("Erreur: " + e.getMessage());
        }

        try {
            CompteBancaire compte2 = listeComptes.get(1);
            CompteBancaire compte3 = null;

            compte2.transfererArgent(compte3, 300);
        } catch (FondsInsuffisantsException | CompteInexistantException e) {
            System.out.println("Erreur: " + e.getMessage());
        }
    }
}
