package poo.utilitarios;

public class CurrencyConverter {
    public static final double IOF = 0.06;

    public static double dollarToReal(double amount, double dollarPrice) {
        double calcDollarToReal = amount * dollarPrice * (1.0 + IOF);
        return calcDollarToReal;
    }

}