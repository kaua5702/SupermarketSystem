package com.kauabiscotto.SupermarketSystem;
import java.text.DecimalFormat;

public class Box {

    private Client client;

    public Box(Client client) {
        this.client = client;
    }

    public double registrarCompra() {
        double total = client.calcularTotal();
        if (total > 100) {
            total = total * 0.9;
        }
        return total;
    }

    public double calcularTroco(double amount) {
        double total = registrarCompra();
        return amount - total;
    }

    public void emitirNotaFiscal() {
        double subtotal = client.calcularTotal();
        double totalWithDiscount = registrarCompra();

        System.out.println("Invoice - Customer: " + client.getName());
        System.out.println("Items purchased:");
        for (Product p : client.getProducts()) {
            System.out.println(" - " + p.getName() + " - $" + String.format("%.2f", p.getPrice()));
        }

        System.out.println("Subtotal: $" + String.format("%.2f", subtotal));

        if (subtotal != totalWithDiscount) {
            System.out.println("Promotion applied: 10% off");
        }

        System.out.println("Total to pay: $" + String.format("%.2f", totalWithDiscount));
    }
}
