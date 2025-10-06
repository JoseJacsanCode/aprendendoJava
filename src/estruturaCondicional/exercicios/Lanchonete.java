package estruturaCondicional.exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Lanchonete {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int codigoItem;
        int qtdItem;
        codigoItem = sc.nextInt();
        qtdItem = sc.nextInt();
        

        if(codigoItem == 1) {
            double preco = qtdItem * 4.00;
            System.out.println("Código: " + codigoItem);
            System.out.println("Especificação: Cachorro quente");
            System.out.printf("Preço: R$ %.2f%n, ", preco);
        }
        else if(codigoItem == 2) {
            double preco = qtdItem * 4.50;
            System.out.println("Código: " + codigoItem);
            System.out.println("Especificação: X-Salada");
            System.out.printf("Preço: R$ %.2f%n, ", preco);
        }
        else if(codigoItem == 3) {
            double preco = qtdItem * 5.00;
            System.out.println("Código: " + codigoItem);
            System.out.println("Especificação: X-Bacon");
            System.out.printf("Preço: R$ %.2f%n, ", preco);
        }
        else if(codigoItem == 4) {
            double preco = qtdItem * 2.00;
            System.out.println("Código: " + codigoItem);
            System.out.println("Especificação: Torrada simples");
            System.out.printf("Preço: R$ %.2f%n, ", preco);
        }
        else {
            double preco = qtdItem * 1.50;
            System.out.println("Código: " + codigoItem);
            System.out.println("Especificação: Refrigerante");
            System.out.printf("Preço: R$ %.2f%n, ", preco);
        }

        sc.close();
    }
}

/*
Com base na tabela abaixo, escreva um programa 
que leia o código de um item e a quantidade deste item. 
A seguir, calcule e mostre o valor da conta a pagar. 
 
Código: 1
Especificação: Cachorro quente
Preço: R$ 4.00

Código: 2
Especificação: X-Salada
Preço: R$ 4.50

Código: 3
Especificação: X-Bacon
Preço: R$ 5.00

Código: 4
Especificação: Torrada simples
Preço: R$ 2.00

Código: 5
Especificação: Refrigerante
Preço: R$ 1.50
________________________________________

Entrada:
3 2 
Saída:
Total: R$ 10.00

Entrada:
2 3
Saída: Total: R$ 13.50

 */