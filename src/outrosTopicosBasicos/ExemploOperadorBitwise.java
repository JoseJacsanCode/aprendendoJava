package outrosTopicosBasicos;

import java.util.Scanner;

public class ExemploOperadorBitwise {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int mask = 0b100000;
        int n = sc.nextInt();

        if((n & mask) != 0) {
            System.out.println("O 6º bit é verdadeiro");
        }
        else {
            System.out.println("O 6º bit é falso");
        }


        sc.close();
    }
}
