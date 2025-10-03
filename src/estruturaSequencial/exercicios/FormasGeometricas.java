package estruturaSequencial.exercicios;

import java.util.Locale;
import java.util.Scanner;

public class FormasGeometricas {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        double A = sc.nextDouble();
        double B = sc.nextDouble();
        double C = sc.nextDouble();
        double pi = 3.14159;

        //Triângulo retângulo
        double areaAtrianguloRetangulo = (A * C) / 2;
        System.out.printf("TRIANGULO: %.3f%n", areaAtrianguloRetangulo);

        //Círculo
        double areaCirculo = pi * Math.pow(C, 2);
        System.out.printf("CIRCULO: %.3f%n", areaCirculo);

        //Trapézio
        double areaTrapezio = (A + B) * C / 2;
        System.out.printf("TRAPEZIO: %.3f%n", areaTrapezio);

        //Quadrado
        double areaQuadrado = B * B;
        System.out.printf("QUADRADO: %.3f%n", areaQuadrado);

        //Retângulo
        double areaRetangulo = A * B;
        System.out.printf("RETANGULO: %.3f%n", areaRetangulo);

        sc.close();
    }
}

/*
 *  
Fazer um programa que leia três valores com ponto flutuante de dupla precisão: A, B e C. Em seguida, calcule e 
mostre:  
a) a área do triângulo retângulo que tem A por base e C por altura.
b) a área do círculo de raio C. (pi = 3.14159)  
c) a área do trapézio que tem A e B por bases e C por altura.  
d) a área do quadrado que tem lado B.  
e) a área do retângulo que tem lados A e B. 


Entrada:
3.0 4.0 5.2 

Saída:
TRIANGULO: 7.800 
CIRCULO: 84.949 
TRAPEZIO: 18.200 
QUADRADO: 16.000 
RETANGULO: 12.000

Entrada:
12.7 10.4 15.2 

Saída:
TRIANGULO: 96.520 
CIRCULO: 725.833 
TRAPEZIO: 175.560 
QUADRADO: 108.160 
RETANGULO: 132.080 
 */