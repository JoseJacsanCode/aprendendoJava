package arrays_e_listas.exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Soma_Vetor {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos números você vai digitar? ");
        int n = sc.nextInt();
        double[] vect = new double[n];

        for(int i = 0; i < vect.length; i++) {
            System.out.print("Digite um número: ");
            vect[i] = sc.nextDouble();
        }

        double sum = 0.0;
        for(int i = 0; i < vect.length; i++) {
            sum += vect[i];
        }
        double avg = sum / vect.length;

        System.out.println();
        System.out.print("Valores = ");
        for(int i = 0; i < vect.length; i++) {
            System.out.printf("%.1f ", vect[i], " ");
        }
        
        System.out.println();
        System.out.printf("SOMA = %.2f%n", sum);
        System.out.printf("MEDIA = %.2f%n", avg);

        sc.close();
    }
}

/*
Faça um programa que leia N números reais e armazene-os em um vetor. 
Em seguida: 
- Imprimir todos os elementos do vetor 
- Mostrar na tela a soma e a média dos elementos do vetor

Exemplo: 
Quantos numeros voce vai digitar? 4 
Digite um numero: 8.0 
Digite um numero: 4.0 
Digite um numero: 10.0 
Digite um numero: 14.0 
 
VALORES = 8.0  4.0  10.0  14.0   
SOMA = 36.00 
MEDIA = 9.00 
 */