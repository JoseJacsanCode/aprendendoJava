package construtoresThisOverrideEncapsulamento;

import java.util.Locale;
import java.util.Scanner;

import construtoresThisOverrideEncapsulamento.entidades.Conta;

public class BancoApplication {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Conta conta;

        System.out.print("Enter account number: ");
        int numero = sc.nextInt();

        System.out.print("Enter account holder: ");
        sc.nextLine();
        String titular = sc.nextLine();

        System.out.print("Is there na initial deposit (y/n)? ");
        char resposta = sc.next().charAt(0);
        if(resposta == 'y') {
            System.out.print("Enter initial deposit value: ");
            double depositoInicial = sc.nextDouble();
            conta = new Conta(numero, titular, depositoInicial);
        }
        else {
            conta = new Conta(numero, titular);
        }

        System.out.println();
        System.out.println("Account data: ");
        System.out.print(conta.toString());

        System.out.println();
        System.out.print("Enter a deposit value: ");
        double valorDoDeposito = sc.nextDouble();
        conta.deposito(valorDoDeposito);
        System.out.println("Updated account data: ");
        System.out.print(conta.toString());

        System.out.println();
        System.out.print("Enter a withdraw value: ");
        double valorDoSaque = sc.nextDouble();
        conta.saque(valorDoSaque);
        System.out.println("Updated account data: ");
        System.out.println(conta.toString());

        sc.close();
    }
}