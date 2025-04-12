package lab3;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        int guess = 15;
        int userGuess;

        System.out.println("Guess the number");

        do {
            System.out.print("Enter number: ");
            Scanner scanner = new Scanner(System.in);
            userGuess = scanner.nextInt();
            if (guess == userGuess) {
                System.out.println("Congratulations, you won!");
            } else {
                System.out.println("Try again!");
            }
            scanner.close();

        } while (userGuess != guess);

    }
}
