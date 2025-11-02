package poo.exercicios;

import java.util.Locale;
import java.util.Scanner;

import poo.exercicios.entidadesExercicios.Rectangle;

public class MedidasDoRetangulo {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter rectangle width and height: ");
        
        Rectangle rectangle = new Rectangle();
        rectangle.width = sc.nextDouble();
        rectangle.height = sc.nextDouble();

        System.out.println(rectangle.toString());


        sc.close();
    }
}

/*
 * Fazer um programa para ler os valores da largura e altura 
de um retângulo. Em seguida, mostrar na tela o valor de 
sua área, perímetro e diagonal. Usar uma classe como 
mostrado no projeto ao lado.

Exemplo:
Enter rectangle width and height:
3.00
4.00
AREA = 12.00
PERIMETER = 14.00
DIAGONAL = 5.00

 */