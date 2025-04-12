package lab3;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        System.out.print("Enter number: ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int sum = 0;

        for (int i = 1; i <= n; i++) {
            sum += i;
            System.out.println("Sum of numbers is: " + sum);
        }

        scanner.close();
    }
}
