package Homework_1.practice_9;

public class Product {
    private String name;
    private int price;

    public Product(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }
    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void applyDiscount(int discount) {
        price = price - discount;
    }
    public void printInfo() {
        System.out.println("Product name: " + name + "\nPrice " + name + ": " + price);
    }
}
