package estruturaSequencial.exercicios;

import java.util.Locale;
import java.util.Scanner;

public class ValorDasPecas {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        //Peças 1
        int codePeca1 = sc.nextInt();
        int numPecas1 = sc.nextInt();
        double valorUniPecas1 = sc.nextDouble();

        //Peças 2
        int codePeca2 = sc.nextInt();
        int numPecas2 = sc.nextInt();
        double valorUniPecas2 = sc.nextDouble();

        double valorPago = (numPecas1 * valorUniPecas1) + (numPecas2 * valorUniPecas2);

        System.out.println("Código das peças 1: " + codePeca1);
        System.out.println("Código das peças 2: " + codePeca2);
        System.out.printf("VALOR A PAGAR: R$ %.2f%n", valorPago);

        sc.close();
    }
}

/*
 *  
Fazer um programa para ler o código de uma peça 1, o número de peças 1, o valor unitário de cada peça 1, o 
código de uma peça 2, o número de peças 2 e o valor unitário de cada peça 2. Calcule e mostre o valor a ser pago. 

Entrada:
12 1 5.30 
16 2 5.10 
Saída:
VALOR A PAGAR: R$ 15.50 

      
 
Entrada:   
13 2 15.30 
161 4 5.20 
Saída:
VALOR A PAGAR: R$ 51.40

Entrada:
1 1 15.10 
2 1 15.10 
Saída:
VALOR A PAGAR: R$ 30.20 
 */