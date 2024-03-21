public class Auteur extends Personne{

    private int numAuteur;
    public Auteur(String nom, String prenom, String email, String tel, int age) {
        super(nom, prenom, email, tel, age);
    }

    public void setNumAuteur(int numAuteur) {
        this.numAuteur = numAuteur;
    }
}
