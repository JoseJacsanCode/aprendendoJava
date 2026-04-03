package estudos;

import java.util.Scanner;

public class EstruturaEnquanto {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int soma = 0;
        while (num != 0) {
            soma += num;
            num = sc.nextInt();
        }

        System.out.println(soma);
        sc.close();
    }
}

/*
Fazer um programa que lê números
inteiros até que um zero seja lido. Ao
final mostra a soma dos números lidos.

Entrada
5
2
4
0

Saída
11

*/