package Exercice2;

public class CompteBancaire {
    private String numeroCompte;
    private double solde;
    private String nomTitulaire;

    public CompteBancaire(String numeroCompte, double solde, String nomTitulaire) {
        this.numeroCompte = numeroCompte;
        this.solde = solde;
        this.nomTitulaire = nomTitulaire;
    }

    public String getNumeroCompte() {
        return numeroCompte;
    }

    public void setNumeroCompte(String numeroCompte) {
        this.numeroCompte = numeroCompte;
    }

    public double getSolde() {
        return solde;
    }

    public void setSolde(double solde) {
        this.solde = solde;
    }

    public String getNomTitulaire() {
        return nomTitulaire;
    }

    public void setNomTitulaire(String nomTitulaire) {
        this.nomTitulaire = nomTitulaire;
    }

    public void deposerArgent(double montant) {
        solde += montant;
    }

    public void retirerArgent(double montant) throws FondsInsuffisantsException {
        if (montant > solde) {
            throw new FondsInsuffisantsException("Fonds insuffisants pour effectuer le retrait.");
        }
        solde -= montant;
    }

    public void afficherSolde() {
        System.out.println("Solde du compte " + numeroCompte + ": " + solde);
    }

    public void transfererArgent(CompteBancaire compteDestinataire, double montant)
            throws FondsInsuffisantsException, CompteInexistantException {
        if (montant > solde) {
            throw new FondsInsuffisantsException("Fonds insuffisants pour effectuer le transfert.");
        }
        if (compteDestinataire == null) {
            throw new CompteInexistantException("Le compte destinataire n'existe pas.");
        }
        retirerArgent(montant);
        compteDestinataire.deposerArgent(montant);
    }
}
