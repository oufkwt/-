package practiceOperation;

public class ForTaskSolder {
    static void main(String[] args) {
        //проверка таблицы умножения

        multiplyTable(1);

        // Проверка суммы всех чисел для числа
        System.out.println(sumOfAllNumber(10));

        // проверка простого числа
        System.out.println(checkNumberIsSimple(4));

        //проверка метода по распечатке всех простых чисел до 100
        printAllSimpleNumbersBefore100();

    }
    //создаю цикл фор
    public static void multiplyTable(int number){
        for (int i = 1; i < 11; i++) {
            System.out.println(number + " x " + i + " = " + number * i);
        }
    }
    public static int sumOfAllNumber (int n){
        int sum = 0;

        // Шаг 1: sum = 0; i = 1 -> sum = 1;
        // Шаг 2: sum = 1; i = 2 -> sum = 3;
        // Шаг 3: sum = 3; i = 3 -> sum = 6;
        // Шаг 4: sum = 6; i = 4 -> sum = 10;
        // Шаг 5: sum = 10; i = 5 -> sum = 15;

        for (int i = 1; i <= n; i++) {
            sum = sum + i;
        }
        return sum;
    }
    public static boolean checkNumberIsSimple(int number) {
        boolean isSimple = true;
        for(int i = 2; i <=number -1; i++){
             if (number % i == 0){
                 isSimple = false;
                 break;
             }
        }
        return isSimple;
    }
    public static void printAllSimpleNumbersBefore100(){
        for (int i = 2; i <= 100; i++){
            if (checkNumberIsSimple(i) == true) {
                System.out.println(i);
            }
        }
    }
}

