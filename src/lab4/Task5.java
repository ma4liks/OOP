package lab4;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        System.out.print("Enter radius: ");
        Scanner scanner = new Scanner(System.in);
        double radius = scanner.nextDouble();
        System.out.print("Enter a: ");
        double a = scanner.nextDouble();
        System.out.print("Enter b: ");
        double b = scanner.nextDouble();

        System.out.println("Area of circle is: " + calculateArea(radius));
        System.out.println("Area of rectangle: " + calculateArea(a, b));
    }

    public static double calculateArea(double radius) {
        return radius * Math.PI;
    }

    public static double calculateArea(double a, double b) {
        return a * b;
    }
}
