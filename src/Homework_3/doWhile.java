package Homework_3;

import java.util.Scanner;

public class doWhile {
    public static void main(String[] args) {
        //Задание 1.
//        positivityNumber();
//            verification();
//        outputNumbers();
//        exit();
        countNumbers();

    }
    //ЗАДАНИЕ 1.
    public static void positivityNumber(){
        Scanner scanner = new Scanner(System.in);
        int n;
        do{
            System.out.println("Введите число: ");
            n = scanner.nextInt();

        }
        while(n <= 0);
        System.out.println(n);
    }

    //ЗАДАНИЕ 2.
    public static void verification(){
        String password;
        String login;
        Scanner scanner = new Scanner(System.in);
        do{
            System.out.println("Введите логин: ");
            login = scanner.nextLine();

            System.out.println("Введите пароль: ");
            password = scanner.nextLine();

        }
        while(!password.equals("123") || !login.equals("admin"));
        System.out.println("Done!");
    }

    //ЗАДАНИЕ 3
    public static void outputNumbers(){
        int i = 1;
        do{
            System.out.println(i);
            i++;
        }
        while(i <= 10);
    }
    public static void exit(){
        String finish;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Введите слово: ");
            finish = scanner.nextLine();
        }
        while(!finish.equals("exit"));
        System.out.println("Done!");
    }
    //ЗАДАНИЕ 5
    public static void countNumbers(){
        int count = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число: ");
        int n = scanner.nextInt();
        do {
            n = n / 10;
            count++;
        }
        while(n != 0);
        System.out.println(count);
    }

}
