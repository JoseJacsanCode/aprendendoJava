package exerciciosComuns;

import java.util.Locale;
import java.util.Scanner;

public class ProblemasDePecas {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        int codigoPeca1 = sc.nextInt();
        int qtdPecas1 = sc.nextInt();
        double valorUnitPecas1 = sc.nextDouble();

        int codigoPeca2 = sc.nextInt();
        int qtdPecas2 = sc.nextInt();
        double valorUnitPecas2 = sc.nextDouble();
        double valorPago = (qtdPecas1 * valorUnitPecas1) + (qtdPecas2 * valorUnitPecas2);
        
        System.out.println();
        System.out.print("Código das peças 1: " + codigoPeca1 + "\n");
        System.out.print("Código das peças 2: " + codigoPeca2 + "\n");
        System.out.printf("VALOR A PAGAR: R$ %.2f%n", valorPago);

        sc.close();
    }
}

/*
Fazer um programa para ler o código de uma peça 1, 
o número de peças 1, o valor unitário de cada peça 1, o 
código de uma peça 2, o número de peças 2 
e o valor unitário de cada peça 2. Calcule e mostre o valor a ser pago.

Entrada:
12 1 5.30 
16 2 5.10

Saída:
VALOR A PAGAR: R$ 15.50 

------------------------------------
Entrada:
13 2 15.30 
161 4 5.20

Saída:
VALOR A PAGAR: R$ 51.40
-------------------------------------

Entrada:
1 1 15.10 
2 1 15.10

Saída:
VALOR A PAGAR: R$ 30.20 
*/