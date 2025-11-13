package construtoresThisOverrideEncapsulamento.entidades;

public class Conta {
    private int numero;
    private String titular;
    private double saldo;

    public Conta(int numero, String titular) {
        this.numero = numero;
        this.titular = titular;
    }

    public Conta(int numero, String titular, double depositoInicial) {
        this.numero = numero;
        this.titular = titular;
        deposito(depositoInicial);
    }

    public int getNumero() {
        return numero;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }
    
    public void deposito(double quantia) {
        saldo += quantia;
    }

    public void saque(double quantia) {
        saldo -= quantia + 5.00;
    }

    public String toString() {
        return 
        "Account " 
        + numero 
        + ", " 
        + "Holder: " 
        + titular 
        + ", " 
        + "Balance $ " 
        + String.format("%.2f%n", saldo);
    }

}