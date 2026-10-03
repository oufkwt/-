package Homework_1.practice_1;

public class Car {
    //Создание переменных
    private String brand;
    private int year;

    //создание конструктора
    public Car(String brand, int year) {
        this.brand = brand;
        this.year = year;
    }
     //геттеры
    public String getBrand(){
        return brand;
    }
    public int getYear() {
        return year;
    }
    //сеттеры
    public void setBrand(String brand) {
        this.brand = brand;
    }
    public void setYear(int year) {
        this.year = year;
    }

    //Вывод
    public void print() {
        System.out.println("Марка авто: " + brand + ".\nГод выпуска: " + year);
    }
}