package Exercice4;

public class Manager extends Employe{
    private String service;

    public Manager() {
    }

    public Manager(String nom, String prenom, String email, String telephone, double salaire, String service) {
        super(nom, prenom, email, telephone, salaire);
        this.service = service;
    }

    @Override
    public double calculerSalire() {
        return salaire*1.2;
    }

    @Override
    public String toString() {
        return super.toString() + ", service='" + service ;
    }
}
