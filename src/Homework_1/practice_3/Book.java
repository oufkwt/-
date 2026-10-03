package Homework_1.practice_3;

public class Book {
    public String title;
    public String author;

    public Book(String title, String author) {
        this.author = author;
        this.title = title;
    }

    public String getTitle() {
        return title;
    }
    public String getAuthor() {
        return author;
    }

    public void setTitle(String title) {
        this.title = title;
    }
    public  void setAuthor(String author) {
        this.author = author;
    }
    //Вывод
    public void printInfo() {
        System.out.println("Название книги: " + title + ".\nАвтор: " + author);
    }
}
