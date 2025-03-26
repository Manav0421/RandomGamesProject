import java.util.Scanner;

/**
 * Game Menu
 * @author Manav
 * Allows the user to play either the Guessing Game or Rock-Paper-Scissors
 */
public class MainGame {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean keepGoing = true;

        while (keepGoing) {
            System.out.println("\n--- Game Menu ---");
            System.out.println("1. Play Guessing Game");
            System.out.println("2. Play Rock-Paper-Scissors");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    GuessingGame.playGuessingGame();
                    break;
                case 2:
                    RockPaperScissors.playRockPaperScissors();
                    break;
                case 3:
                    System.out.println("Thanks for playing!");
                    keepGoing = false;
                    break;
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
    }
}

