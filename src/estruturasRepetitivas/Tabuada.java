package estruturasRepetitivas;

import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        for(int i = 1; i <= 10; i++) {
            int multiplicacao = n * i;
            System.out.println(n + " x " + i + " = " + multiplicacao);
        }

        sc.close();
    }
}
