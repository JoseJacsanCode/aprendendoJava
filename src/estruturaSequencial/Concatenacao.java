package estruturaSequencial;

import java.util.Locale;

public class Concatenacao {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        double x = 10.35784;
        System.out.println("Resultado: " + x + " Metros");
        System.out.printf("Resultado: %.2f Metros%n", x);
    }
}
