package main.java.com.epam.izh.rd.online;

import java.util.Scanner;

public class Player {

    static int countMatchesPlayer;

    static int countMatchesNumberMovePlayer;

    public int move() {
        int matches;
        while (true) {
            System.out.print("Ход игрока. Введите количество спичек: ");
            Scanner scanner = new Scanner(System.in);
            matches = scanner.nextInt();
            if (matches < 1 || matches > 3) {
                System.out.println("Некорректное количество спичек!");
            } else break;
        }
        countMatchesNumberMovePlayer = matches;
        countMatchesPlayer += matches;
        Display.setInitialNumberMatches(Display.getInitialNumberMatches() - countMatchesNumberMovePlayer);

        return matches;
    }

}
