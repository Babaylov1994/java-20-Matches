package main.java.com.epam.izh.rd.online;


public class GameLogic {

    public static void main(String[] args) {

        Player player = new Player();
        Computer computer = new Computer();
        Display display = new Display();

        display.beginningGame();
        computer.move();
        display.printComputerMove(Computer.getCountMatchesComputer());
        display.printNumberMatchesTable();
        player.move();
        display.printNumberMatchesTable();


    }

}
