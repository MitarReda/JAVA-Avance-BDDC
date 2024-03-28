package Exercice2;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class App {
    public static void main(String[] args) {

        List<Employe> employees = new ArrayList<>();
        employees.add(new Employe("Ali", "Finance", 5000));
        employees.add(new Employe("Mohammed", "IT", 6000));
        employees.add(new Employe("Yassin", "HR", 4500));
        employees.add(new Employe("Reda", "Finance", 5500));

        // Q1
        double totalSalary = employees.stream()
                .mapToDouble(Employe::getSalary)
                .sum();
        System.out.println("Somme totale des salaires : " + totalSalary);

        // Q2
        List<Employe> sortedEmployees = employees.stream()
                .sorted((e1, e2) -> e1.getName().compareTo(e2.getName()))
                .collect(Collectors.toList());
        System.out.println("Liste des employés triés par nom : " + sortedEmployees);

        // Q3
        Optional<Employe> minSalaryEmployee = employees.stream()
                .min((e1, e2) -> Double.compare(e1.getSalary(), e2.getSalary()));
        minSalaryEmployee.ifPresent(employee -> System.out.println("Employé avec le salaire le plus bas : " + employee.getName() + " - " + employee.getSalary()));

        // Q4
        double thresholdSalary = 5000;
        List<Employe> highSalaryEmployees = employees.stream()
                .filter(employee -> employee.getSalary() > thresholdSalary)
                .collect(Collectors.toList());
        System.out.println("Liste des employés avec un salaire supérieur à " + thresholdSalary + " : " + highSalaryEmployees);

        //Q5
        Optional<Employe> maxSalaryEmployee = employees.stream()
                .reduce((e1, e2) -> e1.getSalary() > e2.getSalary() ? e1 : e2);
        maxSalaryEmployee.ifPresent(employee -> System.out.println("Employé avec le salaire le plus élevé : " + employee.getName() + " - " + employee.getSalary()));

        // Q6
        String concatenatedNames = employees.stream()
                .map(Employe::getName)
                .reduce((name1, name2) -> name1 + ", " + name2)
                .orElse("");
        System.out.println("Noms concaténés des employés : " + concatenatedNames);
    }
}
