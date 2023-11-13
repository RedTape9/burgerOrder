package org.example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class OrderSystem {
    private Map<Integer, Menu> menus;
    private List<Menu> orders; // Liste, um die Bestellungen zu speichern

    public OrderSystem() {
        menus = new HashMap<>();
        orders = new ArrayList<>();
    }

    public void addMenu(int id, Menu menu) {
        menus.put(id, menu);
    }

    public Menu getOrderById(int id) {
        return menus.get(id);
    }

    public void makeOrder() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bitte geben Sie die Menünummer ein: ");
        int menuId = scanner.nextInt();

        Menu menu = getOrderById(menuId);
        if (menu == null) {
            System.out.println("Menünummer nicht gefunden. Bitte versuchen Sie es erneut.");
        } else {
            orders.add(menu); // Füge die Bestellung zur Liste hinzu
            System.out.println("Sie haben bestellt: " + menu);
        }
    }

    public void displayOrdersAndTotal() {
        System.out.println("Ihre Bestellungen:");
        for (Menu order : orders) {
            System.out.println(order);
        }
        double total = calculateTotal();
        System.out.println("Gesamtsumme: " + total + " Euro");
    }

    public void displayMenus() {
        menus.forEach((id, menu) -> System.out.println("Menü " + id + ": " + menu));
    }

    public double calculateTotal() {
        double total = 0;
        for (Menu order : orders) {
            total += order.getPrice();
        }
        return total;
    }
}
