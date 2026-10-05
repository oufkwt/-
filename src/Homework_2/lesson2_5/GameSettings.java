package Homework_2.lesson2_5;

public class GameSettings {
    static int maxPlayers = 10;
    final String gameName;
    int currentPlayers;

    //констурктор
    public GameSettings(String gameName, int currentPlayers){
        this.currentPlayers = currentPlayers;
        this.gameName = gameName;
    }

    //сеттер макс игроков
    public static void setMaxPlayers(int maxPlayers){
        GameSettings.maxPlayers = maxPlayers;
    }
    //добавление + игрока
    public void addPlayer(){
        currentPlayers++;
    }

    //метод вывода в консоль
    public void printGameStatus(){
        System.out.println("Game name: " + gameName + ". Current players: " + currentPlayers + ". Max players: " + maxPlayers);
    }

}
