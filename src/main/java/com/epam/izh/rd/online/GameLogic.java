package main.java.com.epam.izh.rd.online;


public class GameLogic {

    public static void main(String[] args) {

        Player player = new Player();
        Computer computer = new Computer();
        Display display = new Display();

        display.beginningGame();
        while (true) {
            computer.move();
            if (Display.getInitialNumberMatches() == 1){
                break;
            }
            display.printNumberMatchesTable();
            player.move();
            if (Display.getInitialNumberMatches() == 1){
                break;
            }
            display.printNumberMatchesTable();
        }
        display.printGameOver();
    }
}