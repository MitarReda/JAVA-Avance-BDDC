package Exercice3;
import java.util.HashSet;
import java.util.Set;

public class App {
    public static void main(String[] args) {
        Set<String> groupeA = new HashSet<>();
        Set<String> groupeB = new HashSet<>();

        groupeA.add("Mohammed");
        groupeA.add("Ali");
        groupeA.add("Ayoub");

        groupeB.add("Ayoub");
        groupeB.add("Reda");
        groupeB.add("Ali");

        System.out.println("Noms des étudiants dans le groupe A : " + groupeA);
        System.out.println("Noms des étudiants dans le groupe B : " + groupeB);

        Set<String> intersection = new HashSet<>(groupeA);
        intersection.retainAll(groupeB);
        System.out.println("Intersection des deux groupes : " + intersection);

        Set<String> union = new HashSet<>(groupeA);
        union.addAll(groupeB);
        System.out.println("Union des deux groupes : " + union);
    }
}
