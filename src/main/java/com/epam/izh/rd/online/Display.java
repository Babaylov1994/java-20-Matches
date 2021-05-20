package main.java.com.epam.izh.rd.online;

public class Display {

   private static int initialNumberMatches = 20;

    public static int getInitialNumberMatches() {
        return initialNumberMatches;
    }

    public static void setInitialNumberMatches(int initialNumberMatches) {
        Display.initialNumberMatches = initialNumberMatches;
    }

    void beginningGame(){
        System.out.println("На столе осталось " + getInitialNumberMatches() + " спичек");
    }

    void printNumberMatchesTable (){
        if (initialNumberMatches > 4){
            System.out.println("На столе осталось " + initialNumberMatches + " спичек.");
    } else
            System.out.println("На столе осталось " + initialNumberMatches + " спички.");
        }

    void printComputerMove(int matches){
        System.out.println("Количество выбранных компьютером спичек = " + matches + ".");
    }

    void printGameOver (){
        System.out.println("Для игрока осталась последняя спичка. Игрок проиграл!");
    }


}
