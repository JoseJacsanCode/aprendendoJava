package estruturaCondicional.exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Lanchonete {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int codigo = sc.nextInt();
		int quantidade = sc.nextInt();
		
		double total;
		if (codigo == 1) {
			total = quantidade * 4.0;
		}
		else if (codigo == 2) {
			total = quantidade * 4.5;
		}
		else if (codigo == 3) {
			total = quantidade * 5.0;
		}
		else if (codigo == 4) {
			total = quantidade * 2.0;
		}
		else {
			total = quantidade * 1.5;
		}

		System.out.printf("Total: R$ %.2f%n", total);
		
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