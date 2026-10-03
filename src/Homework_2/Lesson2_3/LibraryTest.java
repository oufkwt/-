package Homework_2.Lesson2_3;

public class LibraryTest{
    public static void main(String[] args){
        Library info = new Library("Voina i mir", "Tolstoy", 200, "drama");

        info.category = "love";
        info.year = 203;
        info.author = "Pushkin";
      //  info.bookTitle = "Onegin"; - ошибка, нельзя изменить, так как модификатор private

        System.out.println(info.author);
        System.out.println(info.year);
        System.out.println(info.category);
      //  System.out.println(info.bookTitle); - ошибка, так как модификатор private

        //меняю значение с использованием сеттера
        info.setBookTitle("Onegin");
        //вывожу в консоль геттером то, что имеет модификатор private
        System.out.println(info.getBookTitle());

    }
}