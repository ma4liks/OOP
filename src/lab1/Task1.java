package lab1;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
    System.out.print("Enter yor age ");
    Scanner scanner = new Scanner(System.in);
    int age = scanner.nextInt();
    System.out.print("Your age is: ");
    System.out.print(age);
    scanner.close();
    }
}
