package practice_0;

public class MathOperation {

    // СУММА чисел
    public static int summm(int q, int w) {
        return q + w;
        }
    // ВЫЧИТАНИЕ чисел
    public static int sub(int a, int s) {
        return a - s;
    }
    // УМНОЖЕНИЕ чисел
    public static int mul(int e, int r) {
        return e * r;
    }
    // ДЕЛЕНИЕ чисел
    public static float del(float d, float f) {
        return d / f;
    }

    // ЗАДАНИЕ 2 МАКСИМУМ ЧИСЕЛ
    public static int maks(int i, int o) {
        return Math.max(i, o);
    }

    // ЗАДАНИЕ 3 РАЗНИЦА МЕЖДУ ДВУМЯ ЧИСЛАМИ
    public static int raz(int c, int v) {
        return Math.abs (c - v);
    }

    // ЗАДАНИЕ 4 ПЕРИМЕТР И КВАДРАТ
    public static int kv(int side1) {
        return side1 * side1;
    }
    public static int per(int side2) {
        return 4 * side2;
    }

    // ЗАДАНИЕ 5 ПЕРЕВОД в МИНУТЫ секунды
    public static float sel(float sekk) {
        return sekk / 60;
    }

    // ЗАДАНИЕ 6 ВЫЧИСЛЕНИЕ СРЕДНЕЙ СКОРОСТИ
    public static float skor(float distance, float time) {
        if (time == 0) {
            System.out.println("Ошибка, незя так");
            return 0;
        }
        return distance / time;
    }

    // ГИПОТЕНУЗА 7
    public static double gip(double j, double l) {
        return Math.sqrt(j * j + l * l);
    }

    // МЕТОД ДЛИНА ОКРУЖНОСТИ 8
    public static double okr(double p) {
        return 2 * Math.PI * p;
    }

    // ЗАДАНИЕ 9 ПРОЦЕНТЫ
    public static double proc(double total, double part) {
        if (total == 0) {
            System.out.println("Ошибка незя так");
            return 0;
        }
        return (part/total) * 100;
    }

    // ЗАДАНИЕ 10!!! Перевод темпы В ФАРЕНГЕЙТ
    public static double temp(double cc) {
        return cc * 9 / 5 + 32;
    }
    // ПЕРЕВОД ТЕМПЫ В С
    public static double temp2(double ff) {
        return (ff - 32) * 5 / 9;
    }

    // ТОЧКА ВХОДА MAIN (создаем переменные уравнений)
    public static void main(String[] args) {

        //Создание ПЕРЕМЕННОЙ СУММА чисел
        int summ = MathOperation.summm(4, 6);
        //ВЫВОДИМ В ТЕРМИНАЛ РЕЗУЛЬТАТ
        System.out.println("СУММИРОВАЛА: " + summ);

        // Создание ПЕРЕМЕННОЙ ВЫЧИТАНИЕ чисел
        int vici = MathOperation.sub(66, 77);
        System.out.println("ВЫЧЛА: " + vici);

        // СОЗДАНИЕ ПЕРЕМЕМННОЙ УМНИЖЕНИЕ чисел
        int dici = MathOperation.mul(2, 22);
        System.out.println("УМНОЖИЛА: " + dici);

        // Создание ПЕРЕМЕННОЙ ДЕЛЕНИЯ чисел
        float fici = MathOperation.del(44, 2);
        System.out.println("ПОДЕЛИЛА: " + fici);

        // Создание ПЕРЕМЕННОЙ МАКСИМУМ ЧИСЛА
        int didi = MathOperation.maks(8,10);
        System.out.println("Максимальное число: " + didi);

        // Создание ПЕРЕМЕННОЙ РАЗНИЦЫ МЕЖДУ числами
        int hihi = MathOperation.raz(33,11);
        System.out.println("РАЗНИЦА ЧИСЕЛ: " + hihi);

        //Создание ПЕРЕМЕННОЙ ПЕРИМЕТРА И КВАДРАТА
        int hehe = MathOperation.kv(5);
        System.out.println("Площадь квадрата: " + hehe);
        int hwhw = per(7);
        System.out.println("Периметр: " + hwhw);

        // СОЗДАНИЕ ПЕРЕМЕННОЙ МИНУТ
        float min = MathOperation.sel(666);
        System.out.println("СТОЛЬКО МИНУТ: " + min);

        //СОЗДАНИЕ ПЕРЕМЕННОЙ СРЕДНЕЙ СКОРОСТИ
        float sred = skor(150, 0);
        System.out.println("СРЕДНЯЯ СКОРОСТЬ: " + sred);

        // СОЗДАНИЕ ПЕРЕМЕННОЙ ГИПОТЕНУЗЫ
        double gipgip = gip(8,3);
        System.out.println("Гипотенуза: " + gipgip);

        // СОЗДАНИЕ ПЕРЕМЕННОЙ ОКРУЖНОСТИ РАДИУСА
        double rad = okr(1);
        System.out.println("РАдиус Окружности: " + rad);

        // Создание переменной проценты
        double ckok = proc(0,25);
        System.out.println("Стока процентов: " + ckok);

        // СОЗДАНИЕ ПЕРЕМЕННОЙ С и Ф
        double ccc = temp(88);
        double fff = temp2(88);
        System.out.println("По Цельсию стока: " + fff + " А по Фарингейту стока: " + ccc);

    }
}