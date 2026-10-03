package Homework_1.practice_2;

public class Rectangle {
    private int width;
    private int height;

    //создаю конструктор
    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }
    //геттеры
    public int getWidth() {
        return width;
    }
    public int getHeight() {
        return height;
    }
    //сеттер дляя ширины
    public void setWidth(int width) {
        this.width = width;
    }
    public int calculateArea() {
        return width * height;
    }
}
