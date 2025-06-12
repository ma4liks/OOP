package lab4;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        System.out.print("Enter a: ");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();    System.out.print("Enter b: ");
        int b = scanner.nextInt();
        int multiplyMain = multiply(a, b);
        System.out.printf("Multiply is: %d", multiplyMain);
        scanner.close();
    }

    public static int multiply(int a, int b) {
        return a * b;
    }
}
