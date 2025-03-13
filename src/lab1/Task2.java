package lab1;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        System.out.print("Enter radius: ");
        Scanner scanner = new Scanner(System.in);
        double radius = scanner.nextDouble();
        double square = Math.PI * radius * radius;
        System.out.print("Square is: " +  square);
        scanner.close();
    }
}
