package codigojose;
import java.util.Locale;

public class DesafioIMC {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        String name = "Marcos";
        double weight = 80.5;
        double height = 1.80;
        double imc = weight / (height * height);
        System.out.printf("O IMC do %s é: %.2f%n", name, imc);
    }
}

/*
Exercício 3: Cálculo de IMC 
(Índice de Massa Corporal) Objetivo: Praticar operações 
matemáticas com diferentes tipos. 
Crie um programa que calcule o IMC de uma pessoa. 
Use String para o nome.Use double para o peso (ex: 80.5) e para a altura (ex: 1.80).
A fórmula do 
IMC é: = IMC = peso / altura² Imprima o resultado formatado.
 */