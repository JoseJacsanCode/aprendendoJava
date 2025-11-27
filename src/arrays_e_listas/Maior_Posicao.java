package arrays_e_listas;

import java.util.Locale;
import java.util.Scanner;

public class Maior_Posicao {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos números você vai digitar? ");
        int n = sc.nextInt();
        int[] vect = new int[n];
        for(int i = 0; i < vect.length; i++) {
            System.out.print("Digite um número: ");
            vect[i] = sc.nextInt();
        }

        
        int maior = vect[0];
        int posMaior = 0;
        for(int i = 0; i < vect.length; i++) {
            if(vect[i] > maior) {
                maior = vect[i];
                posMaior = i;
            }
        }
        System.out.print("MAIOR VALOR: " + maior + "\n");
        System.out.print("POSICAO DO MAIOR VALOR = " + posMaior);

        sc.close();
    }
}

/*
Faça um programa que leia N números reais e armazene-os em um vetor. 
Em seguida, mostrar na tela 
o maior número do vetor (supor não haver empates). 
Mostrar também a posição do maior elemento, 
considerando a primeira posição como 0 (zero).

Exemplo: 
Quantos numeros voce vai digitar? 6 
Digite um numero: 8.0 
Digite um numero: 4.0 
Digite um numero: 10.0 
Digite um numero: 14.0 
Digite um numero: 13.0 
Digite um numero: 7.0 
 
MAIOR VALOR = 14.0 
POSICAO DO MAIOR VALOR = 3 

 */