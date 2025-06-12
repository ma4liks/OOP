package lab4;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        System.out.print("Enter your name: ");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();
        System.out.println(printInfo(name));
        System.out.println(printInfo(name, age));
    }

    public static String printInfo(String name) {
        return "Name is: " + name;
    }

    public static String printInfo(String name, int age) {
        return "Name is: " + name + ", age is: " + age;
    }
}
