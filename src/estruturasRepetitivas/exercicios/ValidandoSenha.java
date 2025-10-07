package estruturasRepetitivas.exercicios;

import java.util.Scanner;

public class ValidandoSenha {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int senha = 0;
        while (senha != 2002) {
            senha = sc.nextInt();
            if(senha == 2002) {
                System.out.println("Acesso permitido");
            }
            else {
                System.out.println("Senha inválida");
            }
        }
        sc.close();
    }
}

/*
Escreva um programa que repita a leitura de uma senha até 
que ela seja válida. Para cada leitura de senha 
incorreta informada, escrever a mensagem "Senha Invalida". 
Quando a senha for informada corretamente deve ser 
impressa a mensagem "Acesso Permitido" e o algoritmo encerrado. 
Considere que a senha correta é o valor 2002

Entrada:
2200 
1020 
2022 
2002 

Saída:
Senha Invalida 
Senha Invalida 
Senha Invalida 
Acesso Permitido 
*/