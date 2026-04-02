package exerciciosComuns;

import java.util.Scanner;

public class MultiplosOuNao {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        if(num1 % num2 == 0 || num2 % num1 == 0) {
            System.out.println("São múltiplos");
        }
        else {
            System.out.println("Não são múltiplos");
        }

        sc.close();
    }
}

/*
Leia 2 valores inteiros (A e B). 
Após, o programa deve mostrar uma mensagem "Sao Multiplos" ou "Nao sao 
Multiplos", indicando se os valores 
lidos são múltiplos entre si. 
Atenção: os números devem poder ser digitados em 
ordem crescente ou decrescente.

Entrada:
6 24

Saída:
São múltiplos

------------------------
Entrada:
6 25

Saída:
Não são múltiplos
------------------------

Entrada:
24 6

Saída:
São múltiplos

*/