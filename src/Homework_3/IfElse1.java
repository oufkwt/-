package Homework_3;

import java.util.Scanner;

public class IfElse1 {
    public static void main(String[] args) {

        //ЗАДАНИЕ 1. Определение знака числа
        //Создаю сканнер (как объект)
        Scanner scanner = new Scanner(System.in);
        //Создаю изначально вывод в консоль для введения числа
//        System.out.print("Введите число: ");
        //Создаю переменную? для введения числа в консоли пользователем
//        int a = scanner.nextInt();
        //Вывожу всё в консоль
//        System.out.println(positivityNumber(a));

        //Задание 2. Поиск наибольшего из двух чисел
        //здесь надо два ввода в консоль и две переменные
//        System.out.print("Введите первое число: ");
//        int b = scanner.nextInt();

//        System.out.print("Введите второе число: ");
//        int c = scanner.nextInt();

//        System.out.println(maxNumber(b, c));

        //Задание 2. Вариант второй
//        System.out.println("Введите первое число: ");
//        int s = scanner.nextInt();
//        System.out.println("Введите второе число: ");
//        int d = scanner.nextInt();
//        System.out.println(maxNumberOption2(s, d));

        //ЗАДАНИЕ 3. Вывод оценки по шкале 1-5
//        System.out.println("Поставьте оценку: ");
//        int v = scanner.nextInt();
//        System.out.println(schoolEstimation(v));

        //Задание 4. Проверка на четность
//        System.out.println("Введите число: ");
//        int h = scanner.nextInt();
//        System.out.println(parity(h));

        //Задание 5. Определение размера скидки по возрасту
//        System.out.println("Введите свой возраст: ");
//        int j = scanner.nextInt();
//        System.out.println(discount(j));

        //Задание 6. Оценка результата теста по баллам
        System.out.print("Введите свою оценку: ");
        int o = scanner.nextInt();
        System.out.println(assessmentResult(o));


    }

    //ЗАДАНИЕ 1. ОПРЕДЕЛЕНИЕ ЗНАКА ЧИСЛА
    public static String positivityNumber(int a){
        String positivity = "";
        if (a > 0){
            positivity = "Число положительное";
        }
        else if (a < 0){
            positivity = "Число отрицательное";
        }
        else {
            positivity = "Число равно нулю";
        }
        return positivity;
    }
    //ЗАДАНИЕ 2. ПОИСК НАИБОЛЬШЕГО ИЗ ДВУХ ЧИСЕЛ
    public static int maxNumber(int b, int c){
        int maxBC = b;
        if (b < c){
            maxBC = c;
        }
        return maxBC;
    }
    public static int maxNumberOption2 (int s, int d){
        return Math.max(s, d);
    }

    //ЗАДАНИЕ 3. ВЫВОД ОЦЕНКИ ПО ШКОЛЕ 1-5
    public static String schoolEstimation (int v){
        String estimation = "";
        if (v == 5) {
            estimation = "Отлично";
        }
        else if (v == 4){
            estimation = "Хорошо";
        }
        else if (v == 3){
            estimation = "Удовлетворительно";
        }
        else if (v == 2 || v == 1){
            estimation = "Неудовлетворительно";
        }
        else {
            estimation = "Неверная оценка";
        }
        return estimation;
    }

    //ЗАДАНИЕ 4. ПРОВЕРКА НА ЧЕТНОСТЬ
    public static String parity(int h){
        //Создание тернарного оператора ИФ ЭСЛ
        return (h % 2 == 0) ? "Четное" : "Нечетное";
    }

    //ЗАДАНИЕ 5. ОПРЕДЕЛЕНИЕ РАЗМЕРА СКИДКИ ПО ВОЗРАСТУ
    public static String discount(int j){
        String ageDiscount = "Без скидки";
        if (j < 18){
            ageDiscount = "Скидка 25%";
        }
        else if (j >= 65){
            ageDiscount = "Скидка 30%";
        }
        return ageDiscount;
    }

    //ЗАДАНИЕ 6. ОЦЕНКА РЕЗУЛЬТАТА ТЕСТА ПО БАЛЛАМ
    public static String assessmentResult (int o){
        String result = "Неверная оценка";
        if (o >= 90 && o <= 100){
            result = "Отлично";
        }
        else if (o >= 75 && o <= 89) {
            result = "Хорошо";
        }
        else if (o <= 74 && o >=60){
            result = "Удовлетворительно";
        }
        else if (o < 60){
            result = "Неудовлетворительно";
        }
        return result;
    }
}
