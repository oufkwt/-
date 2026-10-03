package Homework_2.lesson2_6;

public class Main {
    public static void main(String[] args){
        //объект создаю
        Person human1 = new Person("Ivan", "Ivanov", "123-45-6789");
        Person human2 = new Person("Leonid", "Ivanov", "123-45-5555");

        //меняю имя сеттером
        human1.setFirstName("Vlad");
        //вывожу в консоль объекты
        human1.printPersonInfo();
        human2.printPersonInfo();
    }
}
