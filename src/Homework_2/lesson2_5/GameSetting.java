package Homework_2.lesson2_5;

public class GameSetting {
    static int maxPlayers = 10;
    final String gameName;
    int currentPlayers;

    //констурктор
    public GameSetting(String gameName, int currentPlayers){
        this.currentPlayers = currentPlayers;
        this.gameName = gameName;
    }

    //сеттер макс игроков
    public static void setMaxPlayers(int maxPlayers){
        GameSetting.maxPlayers = maxPlayers;
    }
    //добавление + игрока
    public void addPlayers(){
        currentPlayers++;
    }

    //метод вывода в консоль
    public void printGameStatus(){
        System.out.println("Game name: " + gameName + ". Current players: " + currentPlayers + ". Max players: " + maxPlayers);
    }

}
