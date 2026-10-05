package Homework_1.practice_9;

public class Product {
    private String name;
    private double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }
    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void applyDiscount(double discount) {
        price = price - price * discount / 100.0;
    }
    public void printInfo() {
        System.out.println("Product name: " + name + "\nPrice " + name + ": " + price);
    }
}
