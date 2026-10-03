package Homework_1.practice_7;

public class Main {
    public static void main(String[] args) {
        Circle info = new Circle(5.5);

        System.out.println("Area: " + info.calculateArea() + "\nCircumference: " + info.calculateCircumference());
        info.setRadius(10);
        System.out.println("Area: " + info.calculateArea() + "\nCircumference: " + info.calculateCircumference());
    }
}
