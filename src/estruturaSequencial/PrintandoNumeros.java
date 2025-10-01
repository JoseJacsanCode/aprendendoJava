package estruturaSequencial;

import java.util.Locale;

public class PrintandoNumeros {
    public static void main(String[] args) {
        double y = 10.35784;
        System.out.println(y);
        System.out.printf("%.2f%n", y);
        System.out.printf("%.4f%n", y);
        Locale.setDefault(Locale.US);
        System.out.printf("%.4f%n", y);
    }
}
