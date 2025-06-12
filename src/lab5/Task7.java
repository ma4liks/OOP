package lab5;

import java.util.Scanner;
import java.util.Random;

public class Task7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int balance = 100;
        System.out.println("Welcome to the Slot Machine!");
        System.out.println("You start with $100.");
        System.out.println("Match 3 symbols to win big!");
        System.out.println("Symbols: A, B, C, D, $");

        while (balance > 0) {
            System.out.println("\nYour balance: $" + balance);
            System.out.print("Enter your bet: ");
            int bet = scanner.nextInt();

            if (bet > balance) {
                System.out.println("You don't have enough money.");
                continue;
            }

            if (bet <= 0) {
                System.out.println("Invalid bet.");
                continue;
            }

            balance -= bet;

            String[] row = spinRow();
            printRow(row);

            int win = getPayout(row, bet);

            if (win > 0) {
                System.out.println("You won: $" + win);
                balance += win;
            } else {
                System.out.println("You lost.");
            }

            if (balance == 0) {
                System.out.println("You have no more money. Game over.");
                break;
            }

            System.out.print("Play again? (yes/no): ");
            String answer = scanner.next();

            if (!answer.equalsIgnoreCase("yes")) {
                break;
            }
        }

        System.out.println("Thanks for playing!");
        scanner.close();
    }

    static String[] spinRow() {
        String[] symbols = {"A", "B", "C", "D", "$"};
        Random random = new Random();
        String[] row = new String[3];
        for (int i = 0; i < 3; i++) {
            row[i] = symbols[random.nextInt(symbols.length)];
        }
        return row;
    }

    static void printRow(String[] row) {
        System.out.println("-------------");
        System.out.println("| " + row[0] + " | " + row[1] + " | " + row[2] + " |");
        System.out.println("-------------");
    }

    static int getPayout(String[] row, int bet) {
        if (row[0].equals(row[1]) && row[1].equals(row[2])) {
            switch (row[0]) {
                case "A": return bet * 3;
                case "B": return bet * 4;
                case "C": return bet * 5;
                case "D": return bet * 10;
                case "$": return bet * 100;
            }
        } else if (row[0].equals(row[1]) || row[0].equals(row[2]) || row[1].equals(row[2])) {
            String match = row[0].equals(row[1]) || row[0].equals(row[2]) ? row[0] : row[1];
            switch (match) {
                case "A": return bet * 2;
                case "B": return bet * 3;
                case "C": return bet * 4;
                case "D": return bet * 5;
                case "$": return bet * 6;
            }
        }
        return 0;
    }
}

