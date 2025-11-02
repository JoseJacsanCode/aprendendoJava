package poo.exercicios;

import java.util.Locale;
import java.util.Scanner;

import poo.exercicios.entidadesExercicios.Employee;

public class Funcionario {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Employee employee = new Employee();

        System.out.print("Name: ");
        employee.name = sc.nextLine();

        System.out.print("Gross salary: ");
        employee.grossSalary = sc.nextDouble();

        System.out.print("Tax: ");
        employee.tax = sc.nextDouble();

        System.out.println();
        System.out.println(employee.toString());

        System.out.print("Which percentage to increase salary? ");
        double percentage = sc.nextDouble();
        employee.increaseSalary(percentage);

        System.out.println();
        System.out.println("Update data: " + employee.toString());

        sc.close();

    }
}

/*
 * Fazer um programa para ler os dados de um funcionário (nome, salário bruto e imposto). Em 
seguida, mostrar os dados do funcionário (nome e salário líquido). Em seguida, aumentar o 
salário do funcionário com base em uma porcentagem dada (somente o salário bruto é 
afetado pela porcentagem) e mostrar novamente os dados do funcionário. Use a classe 
projetada abaixo.


Exemplo:

Name: João Silva
Gross salary: 6000.00
Tax: 1000.00
Employee: João Silva, $5000.00
Which percentage to increase salary? 10.0
Updated data: João Silva, $ 5600.00

 */