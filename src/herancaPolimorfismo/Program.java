package herancaPolimorfismo;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import herancaPolimorfismo.model.entities.Account;
import herancaPolimorfismo.model.entities.BusinessAccount;
import herancaPolimorfismo.model.entities.SavingsAccount;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        List<Account> list = new ArrayList<>();

        Account acc1 = new SavingsAccount(1001, "Alex", 1000.0, 0.01);
        Account acc2 = new BusinessAccount(1002, "Maria", 1000.0, 400.0);
        Account acc3 = new SavingsAccount(1004, "Bob", 300.0, 0.01);
        Account acc4 = new BusinessAccount(1005, "Anna", 500.0, 500.0);

        list.add(acc1);
        list.add(acc2);
        list.add(acc3);
        list.add(acc4);

        double sum = 0.0;
        for(Account acc : list) {
            sum += acc.getBalance();
        }

        System.out.printf("Total Balance: %.2f%n", sum);

        for(Account acc : list) {
            acc.deposit(10.0);
        }
        for(Account acc : list) {
            System.out.printf("Updated balance %d: %.2f%n", acc.getNumber(), acc.getBalance());
        }


    }
}
