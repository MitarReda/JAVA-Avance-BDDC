package Exercice2;

public class Employe {
    private String name;
    private String department;
    private double salary;

    public java.lang.String getName() {
        return name;
    }

    public void setName(java.lang.String name) {
        this.name = name;
    }

    public java.lang.String getDepartment() {
        return department;
    }

    public void setDepartment(java.lang.String department) {
        this.department = department;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public Employe() {
    }

    public Employe(java.lang.String name, java.lang.String department, double salary) {
        this.name = name;
        this.department = department;
        this.salary = salary;
    }
}
