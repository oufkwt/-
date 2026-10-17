package Homework_3;

import java.util.Scanner;

public class While {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //ЗАДАЧА 1.
//       System.out.println("введите число: ");
//        int n = scanner.nextInt();
//        factorial(n);

        //ЗАДАЧА 2.
//        System.out.println("Введите число: ");
//        int a = scanner.nextInt();
//        positivityNumber(a);

        //ЗАДАЧА 3.
        System.out.println("Введите число: ");
        int h = scanner.nextInt();
        reciprocaNumbers(h);
    }
    //ЗАДАЧА 1. ВЫЧИСЛЕНИЕ ФАКТОРИАЛА
    public static void factorial(int n){
        int i = 1;
        int result = 1;
        while(i <= n){
            result = result * i;
            i++;
        }
        System.out.println(result);
    }

    //ЗАДАЧА 2. ВЫВОД ВСЕХ ЧЕТНЫХ ЧИСЕЛ ДО ЗАДАННОГО
    public static void positivityNumber(int a){
        int i = 1;
        while(i <= a){
            if (i % 2 == 0){
                System.out.println(i);
            }
            i++;
        }
    }

    //ЗАДАЧА 3. ОБРАТНЫЙ ОТЧЕТ
    public static void reciprocaNumbers(int h){
        while(h >= 1) {
            System.out.println(h);
            h--;
        }
    }
}
