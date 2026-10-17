package Homework_3;

import java.util.Scanner;

public class breakContinue {
    public static void main(String[] args) {
        //ЗАДАНИЕ 1.
//        sumNumbers();
 //       skippingNumbers();
 //           positivityNumber();
        commandStop();
    }
    //ЗАДАНИЕ 1.
    public static void sumNumbers(){
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        while(true){
            System.out.println("Введите число: ");
            int n = scanner.nextInt();
            if (n < 0){
                break;
            }
            sum = sum + n;
        }
        System.out.println(sum);
    }

    //ЗАДАНИЕ 2.
    public static void skippingNumbers(){

        for(int i = 1; i <= 20; i++){
            if (i % 3 == 0){
                continue;
            }
            System.out.println(i);
        }
    }

    //ЗАДАНИЕ 3.
    public static void positivityNumber(){
        Scanner scanner = new Scanner(System.in);
        int e;
        do{
            System.out.println("Введите числа: ");
            e = scanner.nextInt();
            if (e < 0){
                continue;
            }
            else if (e == 0){
                break;
            }
            System.out.println(e);
        }
        while (true);
    }
    //ЗАДАНИЕ 4.
    public static void commandStop(){
        Scanner scanner = new Scanner(System.in);
        String command = "";
        while(true){
            System.out.println("Введите слово: ");
            command = scanner.nextLine();
            if (command.equals("stop")){
                break;
            }
        }
        System.out.println(command);
    }
}
