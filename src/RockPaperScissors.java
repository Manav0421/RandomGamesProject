import java.util.Random;
import java.util.Scanner;

/**
 * Rock-Paper-Scissors Game
 * @author Manav
 * @since 3/24/25
 * User plays against the computer. Choices: 1 = Paper, 2 = Scissors, 3 = Rock
 */
public class RockPaperScissors {

    public static void playRockPaperScissors() {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        boolean playAgain = true;

        while (playAgain) {
            int computerChoice = random.nextInt(3) + 1;

            System.out.print("Enter your choice: 1 = Paper, 2 = Scissors, 3 = Rock: ");
            int userChoice = scanner.nextInt();

            String result = "";

            if (userChoice == computerChoice) {
                result = "It is a tie!";
            } else if ((userChoice == 1 && computerChoice == 3) ||
                    (userChoice == 2 && computerChoice == 1) ||
                    (userChoice == 3 && computerChoice == 2)) {
                result = "You win!";
            } else {
                result = "Computer wins!";
            }

            System.out.println(result);
            System.out.print("Do you want to play again? (Y/N): ");
            String response = scanner.next().toLowerCase();
            playAgain = response.equals("y");
        }
    }
}
