package estruturaCondicional.exercicios;

import java.util.Scanner;

public class HoraDoJogo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int horaInicial;
        int horaFinal;

        horaInicial = sc.nextInt();
        horaFinal = sc.nextInt();

        int duracao;
        if(horaInicial < horaFinal) {
            duracao = horaFinal - horaInicial;
        }
        else {
            duracao = 24 - horaInicial + horaFinal;
        }
        System.out.println("O JOGO DUROU " + duracao + " HORA(S)");

        sc.close();
    }
}

/*
 * Leia a hora inicial e a hora final de um jogo. A seguir calcule a duração do jogo, sabendo que o mesmo pode 
começar em um dia e terminar em outro, tendo uma duração mínima de 1 hora e máxima de 24 horas


Entrada:
16 2
Saída: 
O JOGO DUROU 10 HORA(S)

Entrada:
0 0
Saída: 
O JOGO DUROU 24 HORA(S)

Entrada:
2 16
Saída:
O JOGO DUROU 14 HORA(S)

 */