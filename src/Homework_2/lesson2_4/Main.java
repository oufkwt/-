package Homework_2.lesson2_4;

public class Main {
    public static void main(String[] args){
        //создаю трех студентов
        University student1 = new University(1, "Jensen");
        University student2 = new University(2, "Maria");
        University student3 = new University(3, "Mihael");

        University.changeUniversityName("KFU");

        student1.printStudentInfo();
        student2.printStudentInfo();
        student3.printStudentInfo();

        //проверка, что final не меняется:
      //  student1.studentID = 9; - ошибка
    }
}
