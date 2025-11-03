package poo.exercicios.entidadesExercicios;

public class Student {
    public String name;
    public double grade1;
    public double grade2;
    public double grade3;

    public double finalGrade() {
        double finalGradeCalc = grade1 + grade2 + grade3;
        return finalGradeCalc;
    }

    public void finalCalc() {
        double average = 60;
        double missing = average - finalGrade();

        if (finalGrade() >= 60) {
            System.out.print("STUDENT = " + name);
            System.out.println();
            System.out.printf("FINAL GRADE = %.2f%n", finalGrade());
            System.out.println("PASS");
        }
        else {
            System.out.print("STUDENT = " + name);
            System.out.println();
            System.out.printf("FINAL GRADE = %.2f%n", finalGrade());
            System.out.print("FAILED");
            System.out.println();
            System.out.printf("MISSING = %.2f POINTS%n", missing);
        }
    }

}

/*
 * Fazer um programa para ler o nome de um aluno e as três notas que 
ele obteve nos três trimestres do ano 
(primeiro trimestre vale 30 e o segundo e terceiro valem 35 cada). 
Ao final, mostrar qual a nota final do aluno no 
ano. Dizer também se o aluno está aprovado (PASS) ou não (FAILED) 
e, em caso negativo, quantos pontos faltam 
para o aluno obter o mínimo para ser aprovado (que é 60% da nota). 
Você deve criar uma classe Student para 
resolver este problema.


Saída 1:
STUDENT = Alex Green
FINAL GRADE = 90.00
PASS

Saída 2:
STUDENT = Alex Green
FINAL GRADE = 52.00
FAILED
MISSING = 8.00 POINTS

 */