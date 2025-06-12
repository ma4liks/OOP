package lab5;

import java.util.Scanner;
import java.util.Random;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.print("Enter number of dice: ");
        int diceCount = scanner.nextInt();

        while (diceCount <= 0) {
            System.out.println("Wrong number. Try again.");
            diceCount = scanner.nextInt();
        }

        int total = 0;

        for (int i = 1; i <= diceCount; i++) {
            int roll = random.nextInt(1,7);
            System.out.println("Dice " + i + ":");

            switch (roll) {
                case 1:
                    System.out.println("+-------+");
                    System.out.println("|       |");
                    System.out.println("|   *   |");
                    System.out.println("|       |");
                    System.out.println("+-------+");
                    break;
                case 2:
                    System.out.println("+-------+");
                    System.out.println("| *     |");
                    System.out.println("|       |");
                    System.out.println("|     * |");
                    System.out.println("+-------+");
                    break;
                case 3:
                    System.out.println("+-------+");
                    System.out.println("| *     |");
                    System.out.println("|   *   |");
                    System.out.println("|     * |");
                    System.out.println("+-------+");
                    break;
                case 4:
                    System.out.println("+-------+");
                    System.out.println("| *   * |");
                    System.out.println("|       |");
                    System.out.println("| *   * |");
                    System.out.println("+-------+");
                    break;
                case 5:
                    System.out.println("+-------+");
                    System.out.println("| *   * |");
                    System.out.println("|   *   |");
                    System.out.println("| *   * |");
                    System.out.println("+-------+");
                    break;
                case 6:
                    System.out.println("+-------+");
                    System.out.println("| *   * |");
                    System.out.println("| *   * |");
                    System.out.println("| *   * |");
                    System.out.println("+-------+");
                    break;
            }

            total += roll;
        }

        System.out.println("Total: " + total);
        scanner.close();
    }
}

