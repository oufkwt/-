package practiceOperation;

import java.util.Random;
import java.util.Scanner;

public class WhileTaskSolder {
    public static void main(String[] args) {
        //vas();
        op();

    }


    public static void vas(){
        Scanner scanner = new Scanner(System.in);
        int random = new Random().nextInt(20);
        int nuvmer;
        do{
            System.out.println("Угадай число: ");
            nuvmer = scanner.nextInt();

        }
        while (nuvmer != random);
        System.out.println("Верно");
    }

    public static void op(){
        Scanner scanner = new Scanner(System.in);
        int num;
        int min = 200000000;
        do{
            System.out.println("Введите число: ");
            num = scanner.nextInt();
            if (num < min) min = num;
        }
        while (num >= 0);
        System.out.println("Минимальное число: " + min);
    }
}
