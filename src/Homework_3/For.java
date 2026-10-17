package Homework_3;

import java.util.Scanner;

public class For {
    public static void main(String[] args) {
        //ЗАДАНИЕ 1.
//        outputNumbers();

        //ЗАДАНИЕ 2.
        Scanner scanner = new Scanner(System.in);
//        System.out.print("Введите число: ");
//        int n = scanner.nextInt();
//        System.out.println(sumNumbers(n));

        //ЗАДАНИЕ 3.
//        System.out.print("Введите число для умножения: ");
//        int p = scanner.nextInt();
//        calculator(p);

        //Задание 4
//        System.out.print("Введите число: ");
//        int y = scanner.nextInt();
//        System.out.println(simpleNumber(y));

        //ЗАДАНИЕ 5
        numbers();

    }

    //ЗАДАНИЕ 1.
    public static void outputNumbers(){
        for (int i = 1; i <= 100; i++){
            if (i % 3 == 0){
                System.out.println(i);
            }
        }
    }
    //ЗАДАНИЕ 2.
    public static int sumNumbers(int n){
        int sum = 0;
        for (int i = 1; i <= n; i++){
            sum = sum + i;
        }
        return sum;
    }
    //ЗАДАНИЕ 3.
    public static void calculator(int p){
        for (int i = 1; i <= 10; i++){
            System.out.println(p + " x " + i + " = " + p * i);
        }
    }
    //ЗАДАНИЕ 4.
    public static boolean simpleNumber(int y){
        boolean isPrime = true;
        for (int i = 2; i <= y - 1; i++){
            if (y % i == 0){
                isPrime = false;
                break;
            }
        }
        return isPrime;
    }
    //ЗАДАНИЕ 5.
    public static void numbers(){
        for (int i = 1; i <= 10; i++){
            System.out.println(i);
        }
    }


}

