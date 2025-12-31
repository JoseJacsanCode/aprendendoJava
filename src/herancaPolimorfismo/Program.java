package herancaPolimorfismo;

import herancaPolimorfismo.model.entities.Account;
import herancaPolimorfismo.model.entities.BusinessAccount;
import herancaPolimorfismo.model.entities.SavingsAccount;

public class Program {
    public static void main(String[] args) {
        Account acc = new Account(1001, "Alex", 0.0);
        BusinessAccount bacc = new BusinessAccount(1002, "Maria", 0.0, 500.0);

        //UPCASTING
        Account acc1 = bacc;
        Account acc2 = new BusinessAccount(1002, "Bob", 0.0, 200.0);
        Account acc3 = new SavingsAccount(1004, "Anna", 0.0, 0.01);
        

    }
}
