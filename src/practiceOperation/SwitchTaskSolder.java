package practiceOperation;

public class SwitchTaskSolder {
    static void main(String[] args) {
        //Проверка сезона

        System.out.println(Week(Season.WINTER));
        System.out.println(Week(Season.SUMMER));

        // проверка дня недели

        System.out.println(dayOfWeek(3));
    }
    public static String dayOfWeek (int dayNumber) {
        String day = "";
        switch (dayNumber) {
            case 1:
                day = "Monday";
                break;
            case 2:
                day = "Tuesday";
                break;
            case 3:
                day = "Wednesday";
                break;
            case 4:
                day = "Thursday";
                break;
            case 5:
                day = "Friday";
                break;
            default:
                day = "Weekend";
        }
        return day;


    }
    public static String Week(Season season) {
        String description = "";
        switch (season){
            case WINTER -> description = "Зима - очень холодно.";
            case SPRING -> description = "Весна - всё цветет.";
            case AUTUMN -> description = "Осень - везде лужи";
            case SUMMER -> description = "Лето - пора на море";
        }
        return description;
    }
}
