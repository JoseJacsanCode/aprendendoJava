package estruturaCondicional;

import java.util.Scanner;

public class EscolhaCaso {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        String dia;

        // if(x == 1) {
        //     dia = "Domingo";
        // }
        // else if(x == 2) {
        //     dia = "Segunda-feira";
        // }
        // else if(x == 3) {
        //     dia = "Terça-feira";
        // }
        // else if(x == 4) {
        //     dia = "Quarta-feira";
        // }
        // else if(x == 5) {
        //     dia = "Quinta-feira";
        // }
        // else if(x == 6) {
        //     dia = "Domingo";
        // }
        // else if(x == 7) {
        //     dia = "Sábado";
        // }
        // else {
        //     dia = "Valor inválido";
        // }
        // System.out.println("Dia da semana: " + dia);
        switch(x) {
            case 1:
                dia = "Domingo";
                break;
            case 2:
                dia = "Segunda-feira";
                break;
            case 3:
                dia = "Terça-feira";
                break;
            case 4:
                dia = "Quarta-feira";
                break;
            case 5:
                dia = "Quinta-feira";
                break;
            case 6:
                dia = "Quinta-feira";
                break;
            case 7:
                dia = "Sábado";
                break;
            default:
                dia = "Valor inválido";
                break;
        }
        System.out.println("Dia da semana: " + dia);

        sc.close();
    }
}

/*
 * Fazer um programa para ler um valor inteiro de 1 a 7 representando um 
dia da semana (sendo 1=domingo, 2=segunda, e assim por diante). 
Escrever na tela o dia da semana correspondente, conforme exemplos.

Entrada:
1
Saída:
Dia da semana: Domingo

Entrada:
4
Saída
Dia da semana: Quarta

Entrada:
9
Saída:
Dia da semana: Valor inválido

 */