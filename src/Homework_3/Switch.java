package Homework_3;

import java.util.Scanner;

public class Switch {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        //Задание 1. Вывод дня недели по номеру
//        System.out.print("Введите номер дня недели: ");
//        int a = scanner.nextInt();
//        System.out.println(dayOfTheWeek(a));

        //ЗАДАНИЕ 2. Стоимость билета по дню недели
//        System.out.println("Выберите день для покупки билета: ");
//        int b = scanner.nextInt();
//        System.out.println(ticketPrice(b));

        //ЗАДАНИЕ 3. Перевод числовых оценок в буквенные
//        System.out.print("Введите оценку: ");
//        int f = scanner.nextInt();
//        System.out.print(numericalEstimates(f));

        //Задание 3. Второй вариант
//        System.out.print("Введите оценку: ");
//        int t = scanner.nextInt();
//        System.out.print(numericalEstimatesVar2(t));

        //ЗАДАНИЕ 4. Обработка текстовых команд
//        System.out.print("Введите команду: ");
//        String status = scanner.nextLine();
//        System.out.print(textCommand(status));

        //ЗАДАНИЕ 5. Простой калькулятор

        System.out.print("Введите первое число: ");
        int e = scanner.nextInt();

        System.out.print("Введите математический оператор: ");
        String operator = scanner.next();

        System.out.print("Введите второе число: ");
        int r = scanner.nextInt();

        System.out.print(calculator(e, operator, r));

    }

    //ЗАДАНИЕ 1. ВЫВОД ДНЯ НЕДЕЛИ ПО НОМЕРУ
    public static String dayOfTheWeek(int a){
        String day = "";
        switch (a){
            case 1:
                day = "Понедельник";
                break;
            case 2:
                day = "Вторник";
                break;
            case 3:
                day = "Среда";
                break;
            case 4:
                day = "Четверг";
                break;
            case 5:
                day = "Пятница";
                break;
            case 6:
                day = "Суббота";
                break;
            case 7:
                day = "Воскресенье";
                break;
            default:
                day = "Несуществующий день";
        }
        return day;
    }

    //ЗАДАНИЕ 2. СТОИМОСТЬ БИЛЕТА ПО ДНЮ НЕДЕЛИ
    public static String ticketPrice(int b){
        String price = "";
        switch (b){
            case 1, 2, 3, 4, 5:
                price = "300 рублей";
                break;
            case 6, 7:
                price = "450 рублей";
                break;
            default:
                price = "Билетов нет на этот день";
        }
        return price;
    }
    //ЗАДАНИЕ 3. ПЕРЕВОД ЧИСЛОВЫХ ОЦЕНОК В БУКВЕННЫЕ
    public static String numericalEstimates(int f){
        String score = "";
        if (f >= 90 && f <= 100){
            score = "A";
        }
        else if (f <= 89 && f >= 80){
            score = "B";
        }
        else if (f <= 79 && f >= 70){
            score = "C";
        }
        else if (f <= 69 && f >= 60){
            score = "D";
        }
        else if (f < 60){
            score = "F";
        }
        else {
            score = "Несуществующая оценка";
        }
        return score;
    }
    //ЗАДАНИЕ 3. Вариант 2 со switch
    public static String numericalEstimatesVar2(int t){
        int tens = (t / 10);
        String score_ = "";
        switch(tens){
            case 10, 9:
                score_ = "A";
                break;
            case 8:
                score_ = "B";
                break;
            case 7:
                score_ = "C";
                break;
            case 6:
                score_ = "D";
                break;
            default:
                score_ = "F";
        }
        return score_;
    }
    //ЗАДАНИЕ 4. ОБРАБОТКА ТЕКСТОВЫХ КОМАНД
    public static String textCommand (String status){
        String messages = "";
        switch(status){
            case "Start":
                messages = "Система запущена";
                break;
            case "Stop":
                messages = "Система остановлена";
                break;
            case "Restart":
                messages = "Система перезапущена";
                break;
            case "Status":
                messages = "Информация о системе";
                break;
            default:
                messages = "Неверная команда";
        }
        return messages;
    }
    //ЗАДАНИЕ 5. ПРОСТОЙ КАЛЬКУЛЯТОР С ИМПОЛЬЗОВАНИЕМ switch
    public static int calculator (int e, String operator, int r) {
        int example = 0;
        switch (operator){
            case "+":
                example = e + r;
                break;
            case "-":
                example = e - r;
                break;
            case "*":
                example = e * r;
                break;
            case "/":
                if (r == 0){
                    System.out.println("На ноль делить нельзя");
                }
                else {
                    example = e / r;
                }
                break;
            default:
                System.out.println("Такого математического оператора нет");
                break;
        }
        return example;
    }

}
