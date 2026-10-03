package Homework_1.practice_1;

public class Main {
    public static void main(String[] args) {
        //создаем объект
        Car impala = new Car("Шевроле", 1956);

        //изменить сеттером год
        System.out.println("До изменения:");
        impala.print();
        impala.setYear(2020);

        System.out.println("После изменения:");
        impala.print();
    }



}