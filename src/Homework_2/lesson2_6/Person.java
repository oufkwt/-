package Homework_2.lesson2_6;

public class Person {
    private String firstName;
    private String lastName;
    private final String ssn;

    //конструктор для трех полей
    public Person(String firstName, String lastName, String ssn){
        this.firstName = firstName;
        this.lastName = lastName;
        this.ssn = ssn;
    }
    //геттеры для всех полей
    public String getFirstName(){
        return firstName;
    }
    public String getLastName(){
        return lastName;
    }
    public String getSsn(){
        return ssn;
    }
    //сеттеры для имен
    public void setFirstName(String firstName){
        this.firstName = firstName;
    }
    public void setLastName(String lastName){
        this.lastName = lastName;
    }

    //метод вывода
    public void printPersonInfo(){
        System.out.println("Name: " + firstName + ". Last Name: " + lastName + ". SSN: " + ssn);
    }
}
