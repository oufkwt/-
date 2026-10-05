package Homework_2.lesson2_5;

public class Main {
    public static void main(String[] args){
        //моздаю объекты (2 игры)
        GameSettings game1 = new GameSettings("Minecraft", 3);
        GameSettings game2 = new GameSettings("CSGO", 5);

        // меняю макс игроков
        GameSettings.setMaxPlayers(15);

        //добавляю игроков в игры
        game1.addPlayer();
        game1.addPlayer();
        game2.addPlayer();

        //вывожу инфу в консоль
        game1.printGameStatus();
        game2.printGameStatus();
    }
}
