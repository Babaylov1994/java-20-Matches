package main.java.com.epam.izh.rd.online;


public class Computer extends Player {

    static int countMatchesComputer = 0;

    static int countMatchesNumberMoveComputer;


    @Override
    public int move() {
        if (countMatchesComputer == 0) {
            int firstMove = 3;
            countMatchesComputer = firstMove;
            System.out.println("Количество выбранных компьютером спичек = " + firstMove);
            Display.setInitialNumberMatches(Display.getInitialNumberMatches() - countMatchesComputer);
            return firstMove;
        } else
            countMatchesNumberMoveComputer = 4 - Player.countMatchesNumberMovePlayer;
        System.out.println("Количество выбранных компьютером спичек = " + countMatchesNumberMoveComputer);
        countMatchesComputer += countMatchesNumberMoveComputer;
        Display.setInitialNumberMatches(Display.getInitialNumberMatches() - countMatchesNumberMoveComputer);

        return countMatchesNumberMoveComputer;
    }
}


