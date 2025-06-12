package lab4;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        System.out.print("Enter a: ");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();    System.out.print("Enter b: ");
        int b = scanner.nextInt();
        System.out.print("Sum is: " + sum(a, b));
        scanner.close();
    }

    public static int sum(int a, int b) {
        return a + b;
    }
}
