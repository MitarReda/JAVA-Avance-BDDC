package Exercice2;

import java.util.HashMap;
import java.util.Map;

public class App {
    public static void main(String[] args) {
        Map<String,Double> notes=new HashMap<>();
        //Q2
        notes.put("Ahmed",17.0);
        notes.put("Said",19.0);
        notes.put("Hajar",13.0);
        notes.put("Rachid",15.6);
        notes.put("Sarah",10.0);
        notes.forEach((nom, note) -> System.out.println(nom + " : " + note));
        //Q3
        notes.replace("Ahmed",notes.get("Ahmed")+1);
        System.out.println(notes.get("Ahmed"));
        notes.forEach((nom, note) -> System.out.println(nom + " : " + note));
        //Q4
        notes.remove("Ahmed");
        notes.forEach((nom, note) -> System.out.println(nom + " : " + note));
        //Q5
        System.out.println(notes.size());
        notes.forEach((nom, note) -> System.out.println(nom + " : " + note));
        //Q6
        double somme = 0;
        double min = Double.MAX_VALUE;
        double max = Double.MIN_VALUE;

        for (double note : notes.values()) {
            somme += note;
            min = Math.min(min, note);
            max = Math.max(max, note);
        }

        double moyenne = somme / notes.size();
        System.out.println("Note moyenne : " + moyenne);
        System.out.println("Note minimale : " + min);
        System.out.println("Note maximale : " + max);
        //Q7
        System.out.println("Note égale à 20 ? " + (notes.containsValue(20.0)?"Oui":"Non"));
        //Q8
    }
}
