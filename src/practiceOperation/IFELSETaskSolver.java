package practiceOperation;

public class IFELSETaskSolver {
    static void main(String[] args) {
        //Проверка макс числа
        System.out.println(maxNumber(10, 11, 66));
        //проверка метода опредеделения возраста

        System.out.println(checkAge(6));
        System.out.println(checkAge(18));
        System.out.println(checkAge(61));

        //проверка метода четности
        System.out.println(checkParity(8));
        System.out.println(checkParity(9));

    }
    /**
     * Метод для проверки четности числа number
     * @param number
     * @return
     */
    //сначала создала метод, состоящий из модификатора доступа, типа данных (которые хотим получить в выводе)
    //названия метода
    //в круглых скобках указала параметр,который принимает метод (инт)
    public static String checkParity(int number){
        String parity = "Нечетное";

        if (number % 2 == 0) {
            return "Четное";
        }
        return parity;

    }

    public static String checkAge(int age) {
        String age1 = " ";
        if (age < 18) {
            age1 = "Несовершеннолетний";
        }
        if (age >= 18 && age <= 60) {
            age1 = "Взрослый";
        }
        if (age > 60 ) {
            age1 = "Пожилой";
        }
        return age1;
    }

    //Максимальное число

    public static int maxNumber(int a, int b, int c) {
        int maxABC = b;
        if (a > b) {
            maxABC = a;
        }
        if (c > maxABC) {
            maxABC = c;
        }
        return maxABC;
    }
}
