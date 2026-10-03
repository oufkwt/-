package Homework_2.Lesson2_1;

public class Main {
    public static void main(String[] args){
        Company employee1 = new Company("Alexandr", 1);
        Company employee2 = new Company("Maria", 2);

        Company.companyName = "Philips";

        //проверка изменений
        System.out.println("Имя сотрудника: " + employee1.employeeName + ".\nЕго ID: " + employee1.employeeID + ".\nРаботает в: " + employee1.companyName);

        System.out.println("Имя сотрудника: " + employee2.employeeName + ".\nЕго ID: " + employee2.employeeID + ".\nРаботает в: " + employee1.companyName);
        //по сути статики не рекомендуется писать через объекты, как сделала это я. Но я написала это с целью
        //проверки, что companyName изменилась у всех сотрудников.
       // employee1.employeeID = 5;
       // employee2.employeeID = 3; - проверила, ошибка, так как final поле
    }
}
