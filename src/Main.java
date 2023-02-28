import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        final int answer = random.nextInt(100) + 1;
        final int rounds = 5;
        int roundsLast = rounds + 1;
        // add difficulty lvl mechanism later
        boolean endOfGame = false;
        boolean gameStarted = false;

        System.out.println("I generated a random number in range from 1 to 100 for you to guess (it's " + answer + ")");
        System.out.println("Guess this number and type it here:");

        while (!endOfGame) {
            roundsLast--;

            if (roundsLast == 1) {
                System.out.println("You have one last try");
            }
            else if (roundsLast == 0) {
                endOfGame = true;
                break;
            }
            else if (roundsLast < rounds && roundsLast != 1 && roundsLast != 0) {
                System.out.println("You have " + roundsLast + " more tries");
            }

            if (!gameStarted) {
                gameStarted = true;
            }
            else if (!endOfGame) {
                System.out.println("Type another number: ");
            }

            int userNumber = scanner.nextInt();

            if (userNumber > answer) {
                System.out.println("This number is too big");
            }
            else if (userNumber < answer) {
                System.out.println("This number is too small");
            }
            else if (userNumber == answer) {
                //add rounds counter
                System.out.println("Congratulations, you guessed it correctly!");
                endOfGame = true;
            }
        }
    }
}