package poo.exercicios.entidadesExercicios;

public class Employee {
    public String name;
    public double grossSalary;
    public double tax;

    public double netSalary() {
        double calcNetSalary = grossSalary - tax;
        return calcNetSalary;
    }

    public void increaseSalary(double percentage) {
        grossSalary += grossSalary * percentage / 100;
    }

    public String toString() {
        return "Employee: "
        + name + ", "
        + String.format("$ %.2f%n", netSalary());
    }

}

/*
Name: João Silva
Gross salary: 6000.00
Tax: 1000.00
Employee: João Silva, $ 5000.00
Which percentage to increase salary? 10.0
Updated data: João Silva, $ 5600.00
*/