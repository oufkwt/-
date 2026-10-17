package practiceOperation;

public class Main {
    public static void main(String[] args){
        IFELSETaskSolver ifelseTaskSolver = new IFELSETaskSolver();
        //проверка метода четности
        System.out.println(ifelseTaskSolver.checkParity(8));
        System.out.println(ifelseTaskSolver.checkParity(9));


        //проверка метода опредеделения возраста

        System.out.println(ifelseTaskSolver.checkAge(6));
        System.out.println(ifelseTaskSolver.checkAge(18));
        System.out.println(ifelseTaskSolver.checkAge(61));


        //Проверка макс числа
        System.out.println(ifelseTaskSolver.maxNumber(10, 11, 66));

        // проверка дня недели
        SwitchTaskSolder switchLesson = new SwitchTaskSolder();
        System.out.println(switchLesson.dayOfWeek(6));

        //Проверка сезона

        System.out.println(switchLesson.Week(Season.WINTER));
        System.out.println(switchLesson.Week(Season.SUMMER));

        //проверка таблицы умножения
        ForTaskSolder forMultiply = new ForTaskSolder();
        forMultiply.multiplyTable(1);
    }
}
