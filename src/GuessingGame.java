import java.util.Random;
import java.util.Scanner;

/**
 * Guessing Game
 * @author Manav
 * @since 3/24/25
 * This program generates a random number between 1 and 100
 * and gives the user 5 tries to guess it.
 */
public class GuessingGame {

    public static void playGuessingGame() {
        final int MAX_TRIES = 5;
        final int MIN = 1;
        final int MAX = 100;

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        boolean keepPlaying = true;

        while (keepPlaying) {
            int numberToGuess = random.nextInt(MAX - MIN + 1) + MIN;
            int tries = MAX_TRIES;

            System.out.println("I'm thinking of a number between " + MIN + " and " + MAX + ".");
            System.out.println("Guess what it is. You have " + MAX_TRIES + " tries:");

            while (tries > 0) {
                int guess = scanner.nextInt();
                tries--;

                if (guess == numberToGuess) {
                    System.out.println("You got it!");
                    break;
                } else if (guess < numberToGuess) {
                    System.out.println("Nope! Too low. Try again (" + tries + " tries left):");
                } else {
                    System.out.println("Nope! Too high. Try again (" + tries + " tries left):");
                }
            }

            if (tries == 0) {
                System.out.println("You lost. The number was " + numberToGuess);
            }

            System.out.print("Do you want to play again? (Y/N): ");
            String response = scanner.next().toLowerCase();
            if (!response.equals("y")) {
                keepPlaying = false;
            }
        }
    }
}

