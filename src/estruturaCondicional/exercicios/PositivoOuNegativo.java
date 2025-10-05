package estruturaCondicional.exercicios;

import java.util.Scanner;

public class PositivoOuNegativo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        num = sc.nextInt();

        if(num > 0) {
            System.out.println("POSITIVO");
        }
        else if (num < 0) {
            System.out.println("NEGATIVO");
        }
        else {
            System.out.println("Não negativo");
        }

        sc.close();
    }
}

/*
 * Fazer um programa para ler um número inteiro, 
e depois dizer se este número é negativo ou não. 

Entrada: 
-10
Saída:
NEGATIVO

Entrada:
8
Saída
Positivo

Entrada:
0
Saída:
Não negativo
 */