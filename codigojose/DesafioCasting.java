package codigojose;

public class DesafioCasting {
    public static void main(String[] args) {
        double variable = 1500.99;
        int makeCasting = (int) variable;
        System.out.println(makeCasting);
    }
}

/*
Exercício 2: O Desafio do Casting (Perda de Dados)
Objetivo: Entender como o Java "corta" 
informações ao forçar um tipo maior em um menor.

Crie uma classe chamada DesafioCasting.

Declare uma variável do tipo double com o valor 1500.99.

Tente atribuir esse valor a uma variável do tipo int usando casting explícito: (int).

Imprima os dois valores.
*/