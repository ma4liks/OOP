package lab2;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        System.out.print("Enter your name: ");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        System.out.println("Your name is: " + name + ", your age is: " + age);
        System.out.printf("Your name is: %s \nYour age is: %d", name, age);

        scanner.close();
    }
}
