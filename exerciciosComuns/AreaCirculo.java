package exerciciosComuns;

import java.util.Locale;
import java.util.Scanner;

public class AreaCirculo {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double pi = 3.14159;
        System.out.print("Raio: ");
        double raio = sc.nextDouble();

        double area = pi * Math.pow(raio, 2);
        System.out.printf("A = %.4f%n", area);

        sc.close();
    }
}

/*
Faça um programa para ler o valor do raio de um círculo, 
e depois mostrar o valor da área deste círculo com quatro 
casas decimais conforme exemplos. 
 
Fórmula da área: area = pi . raio²
 
 
Considere o valor de pi = 3.14159 

Entrada:
2.00  
Saída:
A=12.5664 

----------------------------------------
Entrada:
100.64
Saída:
A=31819.3103
----------------------------------------

Entrada:
150.00 
Saída:
A=70685.7750
*/