package Exercice4;

public class Ingenieur extends Employe{
    private String specialite;

    public Ingenieur() {
    }

    public Ingenieur(String nom, String prenom, String email, String telephone, double salaire, String specialite) {
        super(nom, prenom, email, telephone, salaire);
        this.specialite = specialite;
    }

    @Override
    public double calculerSalire() {
            return salaire*1.15;
    }

    @Override
    public String toString() {
        return super.toString()+ ", specialite='" + specialite ;
    }
}
