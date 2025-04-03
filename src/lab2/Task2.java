package lab2;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        System.out.print("Enter number 1-7: ");
        Scanner scanner = new Scanner(System.in);
        int dayOfTheWeek = scanner.nextInt();

        switch (dayOfTheWeek) {
            case(1):
                System.out.print("It`s Monday");
                break;
            case(2):
                System.out.print("It`s Tuesday");
                break;
            case(3):
                System.out.print("It`s Wednesday");
                break;
            case(4):
                System.out.print("It`s Thursday");
                break;
            case(5):
                System.out.print("It`s Friday");
                break;
            case(6):
                System.out.print("It`s Saturday");
                break;
            case(7):
                System.out.print("It`s Sunday");
                break;
            default:
                System.out.println("Zroby normal`no");
                break;
        }

        scanner.close();
    }
}
