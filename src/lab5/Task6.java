package lab5;

import java.util.Scanner;
import java.util.Random;

public class Task6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        String[] choices = {"rock", "paper", "scissors"};
        String playAgain;

        do {
            System.out.print("Enter your move (rock, paper, scissors): ");
            String playerMove = scanner.nextLine().toLowerCase();

            while (!playerMove.equals("rock") && !playerMove.equals("paper") && !playerMove.equals("scissors")) {
                System.out.println("Invalid input. Try again.");
                System.out.print("Enter your move (rock, paper, scissors): ");
                playerMove = scanner.nextLine().toLowerCase();
            }

            int computerIndex = random.nextInt(3);
            String computerMove = choices[computerIndex];

            System.out.println("Computer chose: " + computerMove);

            if (playerMove.equals(computerMove)) {
                System.out.println("It's a tie!");
            } else if (playerMove.equals("rock") && computerMove.equals("scissors")
                    || playerMove.equals("paper") && computerMove.equals("rock")
                    || playerMove.equals("scissors") && computerMove.equals("paper")) {
                System.out.println("You win!");
            } else {
                System.out.println("Computer wins!");
            }

            System.out.print("Do you want to play again? (yes/no): ");
            playAgain = scanner.nextLine().toLowerCase();

        } while (playAgain.equals("yes"));

        System.out.println("Thanks for playing!");
        scanner.close();
    }
}

