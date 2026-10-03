package Homework_1.practice_3;

public class Main {
    public static void main(String[] args){
    Book info = new Book("Онегин", "Пушкин");
    System.out.println("До изменения");
    info.printInfo();
    info.setAuthor("Гоголь");
    System.out.println("После изменения");
    info.printInfo();



    }

}
