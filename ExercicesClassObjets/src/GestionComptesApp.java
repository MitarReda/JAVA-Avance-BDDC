
public class GestionComptesApp {
    public static void main(String[] args) {

        Compte c1 =new Compte(1111,"Ahmed",20000.00);
        Compte c2 =new Compte(2222,"HAJAR",30000.00);
        c1.retirer(19000);
        //System.out.println("solde c1:"+c1.getSolde());
        c2.retirer(45000);
        //System.out.println("solde c2:"+c2.getSolde());
        c1.deposer(15000);
        //System.out.println("solde c1:"+c1.getSolde());
    }
}