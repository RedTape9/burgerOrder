package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        OrderSystem orderSystem = new OrderSystem();

        // Menüs hinzufügen
        orderSystem.addMenu(1, new Menu("Cheeseburger Menü", 8.99, "Cheeseburger", "Pommes", "Cola"));
        orderSystem.addMenu(2, new Menu("Fishburger Menü", 9.49, "Fishburger", "Süßkartoffel-Pommes", "Sprite"));
        orderSystem.addMenu(3, new Menu("Chickenburger Menü", 8.99, "Chickenburger", "Chicken Nuggets", "Fanta"));
        orderSystem.addMenu(4, new Menu("XXL Chickenburger Menü", 10.99, "XXL Chickenburger", "Große Pommes", "Fanta"));
        orderSystem.addMenu(5, new Menu("Maxbeef Burger Menü", 11.49, "Maxbeef Burger", "Große Pommes", "Cola"));
        orderSystem.addMenu(6, new Menu("Chilli Cheese Burger Menü", 9.99, "Chilli Cheese Burger", "Chilli Pommes", "Fanta"));

        // Menüs anzeigen
        System.out.println("Unsere Menüs:");
        orderSystem.displayMenus();

        // Bestellungen aufgeben
        boolean ordering = true;
        Scanner scanner = new Scanner(System.in);
        while (ordering) {
            orderSystem.makeOrder();
            System.out.println("Möchten Sie eine weitere Bestellung aufgeben? (ja/nein)");
            String response = scanner.nextLine();
            if (response.toLowerCase().equals("nein")) {
                ordering = false;
            }
        }
        scanner.close();

        // alle Bestellungen und Summe anzeigen
        orderSystem.displayOrdersAndTotal();
        System.out.println("Vielen Dank für Ihre Bestellung!\nWir freuen uns auf Ihren nächsten Besuch!");
    }
}