package task3;

import task3.devices.iPhone;
import task3.games.LogicGame;
import task3.games.MemoryGame;
import task3.interfaces.Game;

public class App {

    public static void getStatistics(Game g) {
        System.out.println("Showing game statistics:");
        g.a();
        g.b();
        g.c();
    }

    public static void main(String[] args) {
        LogicGame logicGame = new LogicGame();
        MemoryGame memoryGame = new MemoryGame();
        iPhone iphone = new iPhone();

        System.out.println("LogicGame:");
        getStatistics(logicGame);
        logicGame.d();

        System.out.println();

        System.out.println("MemoryGame:");
        getStatistics(memoryGame);
        memoryGame.d();

        System.out.println();

        System.out.println("iPhone:");
        iphone.sell();
        iphone.plugIn();
    }
}
