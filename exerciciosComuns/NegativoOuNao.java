package exerciciosComuns;

import java.util.Scanner;

public class NegativoOuNao {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if(num >= 0) {
            System.out.println("NAO NEGATIVO");
        }
        else {
            System.out.println("NEGATIVO");
        }


        sc.close();
    }
}

/*

Fazer um programa para ler um número inteiro, 
e depois dizer se este número é negativo ou não. 

Entrada:
-10

Saída:
NEGATIVO

-------------------------------
Entrada:
8

Saída:
NAO NEGATIVO
-------------------------------

Entrada:
0

Saída:
NAO NEGATIVO

*/