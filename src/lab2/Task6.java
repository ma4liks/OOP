package lab2;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        System.out.print("Enter a number: ");
        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextDouble();

        double root = Math.sqrt(a);
        double round = Math.round(a);
        double square = Math.pow(a, 2);
        double sin = Math.sin(a);

        System.out.println("Root of number: " + root);
        System.out.println("Round number: " + round);
        System.out.println("Pow of number: " + square);
        System.out.println("Sinus of number: " + sin);

        scanner.close();
    }
}
