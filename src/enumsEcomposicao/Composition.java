package enumsEcomposicao;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import enumsEcomposicao.entities.Client;
import enumsEcomposicao.entities.Order2;
import enumsEcomposicao.entities.OrderItem;
import enumsEcomposicao.entities.Product;
import enumsEcomposicao.entities_enums.OrderStatus2;

public class Composition {
    public static void main(String[] args) throws ParseException {

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter client data: ");
        System.out.print("Name: ");
        String name = sc.nextLine();
        System.out.print("E-mail: ");
        String email = sc.next();
        System.out.print("Birth date (DD/MM/YYYY): ");
        Date birthDate = sdf.parse(sc.next());

        Client client = new Client(name, email, birthDate);
        System.out.print("Enter order data: ");
        System.out.print("Status: ");
        OrderStatus2 status = OrderStatus2.valueOf(sc.next());
        Order2 order = new Order2(new Date(), status, client);

        System.out.print("How many items to this order? ");
        int N = sc.nextInt();
        for(int i = 0; i < N; i++) {
            System.out.println("Enter #" + (i+1) + " item data:");
            sc.nextLine();
            System.out.print("Product name: ");
            String productName = sc.nextLine();
            System.out.print("Product price: ");
            double prodcutPrice = sc.nextDouble();
            System.out.print("Quantity: ");
            int quantity = sc.nextInt();

            Product product = new Product(productName, prodcutPrice);
            OrderItem it = new OrderItem(quantity, prodcutPrice, product);
            order.addItem(it);
        }
        System.out.println();
        System.out.println(order);

        sc.close();
    }
}
