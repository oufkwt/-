package practiceOperation;

import java.util.Scanner;

public class IfElse {
    public static void main(String[] args) {

        //Создаю сканнер (по типу нового объекта)
        Scanner scanner = new Scanner(System.in);
        //Вывожу в консоль просьбу о введнии числа
       // System.out.println("Введите число: ");
        //команда для введения числа в консоль, создаю переменную, в которой будет лежать
        //введенное из консоли число
      //  int number = scanner.nextInt();
        //Вызываю метод IF для определения положительности числа (задание 1)
       // System.out.println(positivityNumber(number));

//        int b = scanner.nextInt();

//        System.out.println("Введите второе число: ");
//        int c = scanner.nextInt();

//        System.out.println(maxNumber(b, c));

        //Задание 3. Вывожу оценки
//        System.out.print("Введите оценку от 1 до 5: ");
//        int f = scanner.nextInt();

//        System.out.println(evaluations(f));

        //ЗАДАНИЕ 4. ПРОВЕРКА НА четность
//        System.out.println("Введите число: ");
//        int q = scanner.nextInt();

//        System.out.println(evenNumber(q));

        //ЗАДАНИЕ 5. ОПРЕДЕЛЕНИЕ размера скидки по возрасту
//        System.out.print("Введите ваш возраст: ");
//        int age = scanner.nextInt();

//        System.out.println(discount(age));

        //ЗАДАНИЕ 6. ОЦЕНКА результата теста по баллам
        System.out.println("Введите свой балл: ");
        int g = scanner.nextInt();

        System.out.println(assessmentResult(g));

        //закрываю сканнер
        scanner.close();
    }

    //ЗАДАНИЕ 1. Определение знака числа на положительность
    //Создаю метод static
    public static String positivityNumber(int a){
        //создаю переменную для обозначения чисел (что выведется)
        String designation = "";
        //Создаю ИФ ЕЛС
        if (a > 0){
            designation = "Число положительное";
        }
        else if (a < 0){
            designation = "Число отрицательное";
        }
        else {
            designation = "Число равно нулю";
        }
        return designation;
    }

    //ЗАДАНИЕ 2. ПОИСК наибольшего из двух чисел
    //Создаю метод ля поиска большего числа
    public static int maxNumber(int b, int c){
        int maxBC = b;
        //Создаю ИФ ЭЛС для поиска наибольшего
        if (b < c){
            maxBC = c;
        }
        return maxBC;
    }
    // ЗАДАНИЕ 3. ВЫВОД ОЦЕНКИ ПО ШКАЛЕ 1-5
    //Создаю метод ИФ ЭЛС
    public static String evaluations(int f){
        String score = "";
        if (f == 5){
            score = "Отлично";
        }
        else if (f == 4){
            score = "Хорошо";
        }
        else if (f == 3){
            score = "Удовлетворительно";
        }
        else if (f == 2 || f == 1){
            score = "Неудовлетворительно";
        }
        else {
            score = "Неверная оценка";
        }
        return score;
    }
    //ЗАДАНИЕ 4. ПРОВЕРКА НА ЧЕТНОСТЬ
    //создаю метод статик
    public static String evenNumber(int q){
        //Создаю тернальный (короткий) оператор ИФ ЭЛС
        String even = (q % 2 == 0) ? ("Четное") : ("Нечетное");
        return even;
    }

    //ЗАДАЧА 5. ОПРЕДЕЛЕНИЕ РАЗМЕРА СКИДКИ ПО ВОЗРАСТУ
    public static String discount(int age){
        String ageDiscount = "";
        if (age < 18) {
            ageDiscount = "Скидка: 25%";
        }
        else if (age >= 65){
            ageDiscount = "Скидка: 30%";
        }
        else{
            ageDiscount = "Без скидки";
        }
        return ageDiscount;
    }

    //ЗАДАЧА 6. ОЦЕНКА РЕЗУЛЬТАТА ТЕСТА ПО БАЛЛАМ
    public static String assessmentResult(int g){
        String ball = "";
        if  (g < 60){
            ball = "Неудовлетворительно";
        }
        else if (g <= 74 && g >= 60){
            ball = "Удовлетворительно";
        }
        else if (g <= 89 && g >= 75){
            ball = "Хорошо";
        }
        else if (g >= 90 && g <= 100){
            ball = "Отлично";
        }
        else {
            ball = "Неверная оценка";
        }
        return ball;
    }
}
