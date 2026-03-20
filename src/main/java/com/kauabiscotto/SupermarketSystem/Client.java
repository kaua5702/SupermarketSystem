package com.kauabiscotto.SupermarketSystem;

import java.util.ArrayList;
import java.util.List;

public class Client {

    private String name;
    private List<Product> products;


    public Client(String name) {
        this.name = name;
        this.products = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public List<Product> getProducts() {
        return products;
    }

    public double calcularTotal() {
        double total = 0;
        for (Product product : products) {
            total += product.getPrice();
        }
        return total;
    }

    public void adicionarProduto(Product product) {
        products.add(product);
    }

    @Override
    public String toString() {
        return "Client: " + name + " | Items in the cart: " + products.size();
    }


}
