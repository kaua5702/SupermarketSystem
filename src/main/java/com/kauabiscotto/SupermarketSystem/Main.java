package com.kauabiscotto.SupermarketSystem;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);

        // Create a client
        System.out.print("Enter customer name: ");
        String customerName = scanner.nextLine();
        Client client = new Client(customerName);

        // Add products to the cart
        System.out.println("Add products to the cart (type 'done' to finish):");
        while (true) {
            System.out.print("Product name: ");
            String productName = scanner.nextLine();
            if (productName.equalsIgnoreCase("done")) {
                System.out.println("");
                break;
            }

            System.out.print("Product price: ");
            double productPrice = scanner.nextDouble();
            scanner.nextLine(); // consume newline

            Product product = new Product(productName, productPrice);
            client.adicionarProduto(product);
        }

        // Create a Box (cashier)
        Box box = new Box(client);

        // Emit invoice
        box.emitirNotaFiscal();

        // Payment and change
        System.out.print("Enter amount paid: ");
        double amountPaid = scanner.nextDouble();
        double change = box.calcularTroco(amountPaid);

        System.out.println("Change to return: $" + String.format("%.2f", change));


        scanner.close();
    }
}