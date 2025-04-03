package lab2;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        System.out.print("Enter the number: ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        if (number > 0) {
            System.out.println("Your number is positive");
        } else if (number < 0) {
            System.out.println("Your number is negative");
        } else {
            System.out.println("Your number is 0");
        }

        scanner.close();
    }
}
