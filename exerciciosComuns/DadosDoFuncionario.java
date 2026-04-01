package exerciciosComuns;

import java.util.Locale;
import java.util.Scanner;

public class DadosDoFuncionario {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int numFuncionario = sc.nextInt();
        int horasTrabalhadas = sc.nextInt();
        double valorRecebidoHora = sc.nextDouble();
        double salary = valorRecebidoHora * horasTrabalhadas;

        System.out.println();
        System.out.println("NUMBER = " + numFuncionario);
        System.out.printf("SALARY = U$ %.2f%n", salary);


        sc.close();
    }
}

/*
 
Fazer um programa que leia o número de um funcionário, 
seu número de horas trabalhadas, o valor que recebe por 
hora e calcula o salário desse funcionário. 
A seguir, mostre o número e o salário do funcionário, com duas casas 
decimais.

Entrada: 
25 
100 
5.50

Saída:
NUMBER = 25 
SALARY = U$ 550.00

------------------------------------
Entrada:
1
200
20.50

Saída:
NUMBER = 1 
SALARY = U$ 4100.00 
------------------------------------

Entrada:
6 
145 
15.55

Saída:
NUMBER = 6 
SALARY = U$ 2254.75 
*/