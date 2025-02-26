import java.util.Random;

public class Dice {
    private int die1;
    private int die2;
    private int rollCount = 0;
    private boolean isDouble;

    public Dice() {
        isDouble = false;
    }

    public void roll() {
        while (!isDouble) {
            System.out.println("Rolling the dice...");
            die1 = new Random().nextInt(6) + 1;
            die2 = new Random().nextInt(6) + 1;
            rollCount++;
            System.out.println("Die 1: " + die1 + "\nDie 2: " + die2);
            System.out.println("------------------------");
            if (die1 == die2) {
                isDouble = true;
                break;
            }
        }
        System.out.println("You rolled a double!");
        System.out.println("After " + rollCount + " try both reach the same value.");

    }

    public int getDie1() {
        return die1;
    }

    public int getDie2() {
        return die2;
    }

}
