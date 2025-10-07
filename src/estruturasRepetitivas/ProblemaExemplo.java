package estruturasRepetitivas;

import java.util.Scanner;

public class ProblemaExemplo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int soma = 0;
        while (x != 0) {
            soma += x;
            x = sc.nextInt();
        }
        System.out.println("Soma: " + soma);

        sc.close();
    }
}

/*
Fazer um programa que lê números
inteiros até que um zero seja lido. Ao
final mostra a soma dos números lidos.

Entrada:
5
2
4
0
Saída:
11

 */