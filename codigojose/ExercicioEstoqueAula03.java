package codigojose;

import java.util.Locale;

public class ExercicioEstoqueAula03 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        String productName = "Teclado Mecânico";
        int qttInStock = 5;
        double unitPrice = 55.0;
        boolean imediateSale = true;
        System.out.printf("O produto %s custa R$ %.2f. Temos %d unidades em estoque. Disponível: %b%n", productName, unitPrice, qttInStock, imediateSale);
    }
}

/*
Exercício 1: O Relatório de Estoque
Objetivo: Praticar a declaração de variáveis e concatenação de Strings.

Crie uma classe chamada ExercicioEstoque que armazene as seguintes informações sobre um produto:

O nome do produto (Ex: "Teclado Mecânico")

A quantidade em estoque (um número inteiro)

O preço unitário (um número decimal)

Se o produto está disponível para venda imediata (um valor booleano)

Saída esperada: Imprima uma frase organizada no console, como:

"O produto [NOME] custa R$ [PRECO]. Temos [QUANTIDADE] unidades em estoque. Disponível: [BOOLEAN].
 */