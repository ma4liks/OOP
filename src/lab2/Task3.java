package lab2;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        System.out.print("Enter first number: ");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        System.out.print("Enter second number: ");
        int b = scanner.nextInt();

        int max = (a > b) ? a : b;
        System.out.println(max + " is bigger");

        scanner.close();
    }
}
