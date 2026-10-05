package Homework_1.practice_2;

public class Main {
    public static void main(String[] args) {
        //создаю объект
        Rectangle rect = new Rectangle(5,10);

        //изменить ширину сеттером
        System.out.println("До изменения: " + rect.calculateArea());
        rect.setWidth(2);
        System.out.println("После изменений: " + rect.calculateArea());
    }
}
