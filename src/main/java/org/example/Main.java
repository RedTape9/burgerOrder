import org.example.OrderSystem;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        OrderSystem orderSystem = new OrderSystem();

        // Menüs hinzufügen
        orderSystem.addMenu(1, new Menu("Cheeseburger Menü", 8.99, "Cheeseburger", "Pommes", "Cola"));
        orderSystem.addMenu(2, new Menu("Fishburger Menü", 9.49, "Fishburger", "Süßkartoffel-Pommes", "Sprite"));
        orderSystem.addMenu(3, new Menu("Chickenburger Menü", 8.99, "Chickenburger", "Wedges", "Fanta"));
        orderSystem.addMenu(4, new Menu("XXL Chickenburger Menü", 10.99, "XXL Chickenburger", "Große Pommes", "Bier"));
        orderSystem.addMenu(5, new Menu("Maxbeef Burger Menü", 11.49, "Maxbeef Burger", "Pommes", "Pepsi"));
        orderSystem.addMenu(6, new Menu("Chilli Cheese Burger Menü", 9.99, "Chilli Cheese Burger", "Chilli Pommes", "7Up"));

        // Menüs anzeigen
        System.out.println("Verfügbare Menüs:");
        orderSystem.displayMenus();

        // Bestellprozess
        boolean ordering = true;
        Scanner scanner = new Scanner(System.in);
        while (ordering) {
            orderSystem.placeOrder();

            System.out.println("Möchten Sie eine weitere Bestellung aufgeben? (ja/nein)");
            String response = scanner.nextLine();
            if (!response.equalsIgnoreCase("ja")) {
                ordering = false;
            }
        }

        System.out.println("Vielen Dank für Ihre Bestellung!");
    }
}
