package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Warehouse warehouse = new Warehouse("abd", "shdsd", 12);
        System.out.println(warehouse.toString());
        Worker worker = new Worker("Andrew", "basic", 121212);
        System.out.println(worker.toString());
        Product product = new Product("Apple", 12.12, 8745);
        System.out.println(product.toString());

    }
}