package Homework_1.practice_10;

public class Laptop {
    private String brand;
    private int price;

    public Laptop(String brand, int price) {
        this.brand = brand;
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }
    public int getPrice() {
        return price;
    }
    public void setBrand(String brand) {
        this.brand = brand;
    }
    public void setPrice(int price) {
        this.price = price;
    }
    public void printInfo() {
        System.out.println("Laptop: " + brand + "\nPrice: " + price);
    }
}
