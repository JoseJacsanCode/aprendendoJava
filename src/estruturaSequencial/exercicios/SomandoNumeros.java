package estruturaSequencial.exercicios;

import java.util.Scanner;

public class SomandoNumeros {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        int SOMA = num1 + num2;
        System.out.println("SOMA = " + SOMA);

        sc.close();
    }
}

/*
 * Faça um programa para ler dois valores inteiros, e depois mostrar na tela a soma desses números com uma 
mensagem explicativa, conforme exemplos. 

Entrada:
10 
30 
Saída:
SOMA = 40 

Entrada: 
-30 
10
Saída:
SOMA = -20

Entrada: 
0
0
Saída:
SOMA = 0

 */