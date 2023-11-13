package org.example;

public class Menu {
    private String name;
    private double price;
    private String mainDish;
    private String sideDish;
    private String beverage;

    public Menu(String name, double price, String mainDish, String sideDish, String beverage) {
        this.name = name;
        this.price = price;
        this.mainDish = mainDish;
        this.sideDish = sideDish;
        this.beverage = beverage;
    }

    // GETTER

    public double getPrice() {
        return price;
    }

    public String toString() {
        return name + " - " + mainDish + ", " + sideDish + ", " + beverage + " - " + price + "Euro";
    }
}
