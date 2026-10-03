package Homework_2.lesson2_4;

public class University {
    static String universityName = "MGU";
    final int studentID;
    String studentName;

    //конструктор
    public University(int studentID, String studentName){
        this.studentID = studentID;
        this.studentName = studentName;
    }

    //статический метод изменения имени университета
    public static void changeUniversityName(String newName){
        University.universityName = newName;
    }

    //геттер для имени студента
    public String getStudentName(){
        return studentName;
    }

    //метод вывода в консоль
    public void printStudentInfo(){
        System.out.println("Name: " + studentName + ". ID: " + studentID + ". University: " + universityName);
    }

}
