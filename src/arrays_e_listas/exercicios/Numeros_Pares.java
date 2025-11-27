package arrays_e_listas.exercicios;

import java.util.Scanner;

public class Numeros_Pares {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos números você vai digitar? ");
        int n = sc.nextInt();
        int[] vect = new int[n];
        for(int i = 0; i < vect.length; i++) {
            System.out.print("Digite um número: ");
            vect[i] = sc.nextInt();
        }

        System.out.println();
        System.out.println("NÚMEROS PARES: ");
        for(int i = 0; i < vect.length; i++) {
            if(vect[i] % 2 == 0) {
                System.out.print(vect[i] + " ");
            }
        }

        System.out.println();
        
        int quantidadePares = 0;
        for(int i = 0; i < vect.length; i++) {
            if(vect[i] % 2 == 0) {
                quantidadePares++;
            }
        }
        System.out.println();
        System.out.print("QUANTIDADE DE PARES: ");
        System.out.println(quantidadePares);


        sc.close();
    }
}

/*
Faça um programa que leia N números inteiros e armazene-os em um vetor. 
Em seguida, mostre na tela todos os números pares, 
e também a quantidade de números pares. 

Exemplo: 
Quantos numeros voce vai digitar? 6 
Digite um numero: 8 
Digite um numero: 2 
Digite um numero: 11 
Digite um numero: 14 
Digite um numero: 13 
Digite um numero: 20 
 
NUMEROS PARES: 
8  2  14  20 
 
QUANTIDADE DE PARES = 4
 */