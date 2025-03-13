package lab1;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
    System.out.print("Enter number from -128 to 127: ");
    Scanner scanner = new Scanner(System.in);
    byte number = scanner.nextByte();
    double number1 = number / 2;
    int number2 = (int) number1;
    System.out.print(number2);
    scanner.close();
    }
}
