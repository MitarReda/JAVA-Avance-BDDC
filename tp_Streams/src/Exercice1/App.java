package Exercice1;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class App {
    public static void main(String[] args) {
       List<String> mots =Arrays.asList("chat", "chien", "lapin", "oiseau", "elephant", "tigre", "lion");
       // Q1
        System.out.println("**** Q1 *****");
        mots.stream()
                .filter(mot -> mot.contains("a"))
                .collect(Collectors.toList())
                .forEach(System.out::println);

        //Q2
        System.out.println("**** Q2 *****");
        mots.stream().filter(mot->mot.length()>3)
                .map(mot->new StringBuilder(mot).reverse())
                .forEach(System.out::println);

        //Q3
        System.out.println("**** Q3 *****");
        /*mots.stream().filter(mot -> mot.contains("e"))
                .flatMap(mot-> Stream.of(mot.toCharArray()))
                .forEach(System.out::println);*/

        mots.stream()
                .filter(mot -> mot.contains("e"))
                .flatMap(mot -> mot.chars().mapToObj(c -> (char) c))
                .collect(Collectors.toList())
                .forEach(System.out::println);

        //Q4
        System.out.println("**** Q4 *****");
        mots.stream()
                //.map(String::toUpperCase)
                .map(String::toUpperCase)
                .forEach(System.out::println);

        //Q5
        System.out.println("**** Q5 *****");
        mots.stream()
                .mapToInt(String::length)
                .forEach(System.out::println);

        //Q6
        System.out.println("**** Q6 *****");
        mots.stream()
                .flatMap(mot -> mot.chars().mapToObj(c -> (char) c))
                .forEach(System.out::println);

        //Q7
        System.out.println("**** Q7 *****");
       /*mots.stream()
                .map((mot, index) -> mots.get(index)+ " - " +index)
                .collect(Collectors.toList());*/

     IntStream.range(0, mots.size())
             .mapToObj(index -> mots.get(index) + " - " + index)
             .collect(Collectors.toList())
             .forEach(System.out::println);

    }
}
