public class Compte {
    private long num; // {get; set;}
    private String nomClient; // {get; set;}
    private Double solde ;// {get; set;}

    public Compte(){

    }
    public Compte(long num,String nomClient,Double solde){
        this.num=num;
        this.nomClient=nomClient;
        this.solde=solde;
    }

    public long getNum(){
        return this.num;
    }
    public void setNum(long num){
        this.num=num;
    }
    public String getNomClient(){
        return this.nomClient;
    }
    public void setNomClient(String nomClient){
        this.nomClient=nomClient;
    }
    public double getSolde(){
        return this.solde;
    }
    public void setSolde(double solde){
        this.solde=solde;
    }
    public void afficherCompteInfo(){
        System.out.println("le numero de Compte: "+num+" le nom de client: "+nomClient+"le Solde : "+solde);
    }
    void retirer(double montant) {
        if(this.solde>=montant){
            this.solde-=montant;
        }
    }
    void deposer(double montant){
        this.solde+=montant;
    }

}
