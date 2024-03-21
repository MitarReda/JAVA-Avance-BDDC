package Exercice1;

public class Main {
    public static void main(String[] args) {

        StorageGenerique<Integer> c=new StorageGenerique<>();
        c.addElement(10);
        c.addElement(259);
        c.addElement(389);
        c.addElement(414);
        System.out.println("nombre des elements: "+c.getSize());
        System.out.println("récupéré element: "+c.getElement(2));
        c.removeElement(2);
        System.out.println("nombre des elements: "+c.getSize());

        for(Integer val:c.getElements()){
            System.out.println("afficher element: "+val);
        }
    }
}