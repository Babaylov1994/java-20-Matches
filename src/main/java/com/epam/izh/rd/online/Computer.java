package main.java.com.epam.izh.rd.online;

public class Computer extends Player {

    static int countMatchesComputer = 0;

    private int countMatchesNumberMoveComputer;

    public static int getCountMatchesComputer() {
        return countMatchesComputer;
    }

    public static void setCountMatchesComputer(int countMatchesComputer) {
        Computer.countMatchesComputer = countMatchesComputer;
    }

    public int getCountMatchesNumberMoveComputer() {
        return countMatchesNumberMoveComputer;
    }

    public void setCountMatchesNumberMoveComputer(int countMatchesNumberMoveComputer) {
        this.countMatchesNumberMoveComputer = countMatchesNumberMoveComputer;
    }

    @Override
    public int move(){
        if (countMatchesComputer == 0){
            int random = (int) (Math.random() * 3)+1;
            countMatchesComputer = random;
            Display.setInitialNumberMatches(Display.getInitialNumberMatches() - countMatchesComputer);
            return random;
        } else
            countMatchesNumberMoveComputer = 4 - super.getCountMatchesNumberMovePlayer();
            countMatchesComputer += 4 - super.getCountMatchesNumberMovePlayer();
            Display.setInitialNumberMatches(Display.getInitialNumberMatches() - countMatchesComputer);
       return countMatchesNumberMoveComputer;
    }

    @Override
    public int count() {
        return countMatchesComputer;
    }
}
