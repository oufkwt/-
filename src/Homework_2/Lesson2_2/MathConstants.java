package Homework_2.Lesson2_2;

public class MathConstants {
    static final double PI = 3.14159;
    static final double E = 2.71828;
    private double r;
    private double initialValue;
    private double rate;
    private double time;


    //площадь круга
    static double calculateCircleArea(double r){
        return PI * r * r;
    }
    //длина окружности
    static double calculateCircumference(double r){
        return 2 * PI * r;
    }

    //экспоненциальный рост
    static double calculateExponentialGrowth(double initialValue, double rate, double time){
        return initialValue * (E * rate * time);
    }
}
