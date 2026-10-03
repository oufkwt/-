package Homework_2.Lesson2_1;

public class Company{
    static String companyName = "Oriel";
    final int employeeID;
    String employeeName;

    public Company(String employeeName, int employeeID){
        this.employeeName = employeeName;
        this.employeeID = employeeID;
    }
    public String getEmployeeName(){
        return employeeName;
    }
    public void setEmployeeName(String employeeName){
        this.employeeName = employeeName;
    }

    //статический метод
    static void printCompanyName(){
        System.out.println("Работает в: " + companyName);
    }
}