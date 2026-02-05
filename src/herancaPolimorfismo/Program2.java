package herancaPolimorfismo;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import herancaPolimorfismo.model.entities.Employee;
import herancaPolimorfismo.model.entities.OutSourcedEmployee;

public class Program2 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Employee> list = new ArrayList<>();

        System.out.print("Enter the number of employees: ");
        int n = sc.nextInt();

        for(int i = 1; i <= n; i++) {
            System.out.println("Employee #" + i + " data: ");
            System.out.print("Outsourced (y/n)? ");
            char ch = sc.next().charAt(0);
            System.out.print("Name: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("Hours: ");
            int hours = sc.nextInt();
            System.out.print("Value per hour: ");
            double vph = sc.nextDouble();
            if(ch == 'y') {
                System.out.print("Additional charge: ");
                double addCharge = sc.nextDouble();
                Employee emp = new OutSourcedEmployee(name, hours, vph, addCharge);
                list.add(emp);
            }
            else {
                Employee emp = new Employee(name, hours, vph);
                list.add(emp);
            }
        }
        System.out.println();

        System.out.println("PAYMENTS: ");
        for(Employee emp : list) {
            System.out.println(emp.getName() + " - $ " + String.format("%.2f", emp.payment()));
        }


        sc.close();
    }
}
