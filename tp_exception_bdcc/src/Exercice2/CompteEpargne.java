package Exercice2;

public class CompteEpargne extends CompteBancaire {
    private double tauxInteret;

    public CompteEpargne(String numeroCompte, double solde, String nomTitulaire, double tauxInteret) {
        super(numeroCompte, solde, nomTitulaire);
        this.tauxInteret = tauxInteret;
    }

    public void calculerInterets() {
        double interets = getSolde() * tauxInteret;
        deposerArgent(interets);
        System.out.println("Intérêts ajoutés au compte " + getNumeroCompte() + ": " + interets);
    }
}
