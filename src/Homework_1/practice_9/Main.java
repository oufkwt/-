package Homework_1.practice_9;

public class Main {
    public static void main(String[] args) {
        Product info = new Product("Glasses", 3000);

        info.printInfo();
        info.applyDiscount(200);
        info.printInfo();
    }
}
