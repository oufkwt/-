package Homework_2.lesson2_5;

public class Main {
    public static void main(String[] args){
        //моздаю объекты (2 игры)
        GameSetting game1 = new GameSetting("Minecraft", 3);
        GameSetting game2 = new GameSetting("CSGO", 5);

        // меняю макс игроков
        GameSetting.setMaxPlayers(15);

        //добавляю игроков в игры
        game1.addPlayers();
        game1.addPlayers();
        game2.addPlayers();

        //вывожу инфу в консоль
        game1.printGameStatus();
        game2.printGameStatus();
    }
}
