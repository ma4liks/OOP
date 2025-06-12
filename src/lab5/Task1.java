package lab5;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        System.out.print("Enter principal: ");
        Scanner scanner = new Scanner(System.in);
        double principal = scanner.nextDouble();

//        System.out.print("Enter monthly deposit: ");
//        double monthlyDeposit = scanner.nextDouble();

        System.out.print("Enter annual rate: ");
        double annualRate = scanner.nextDouble();

        System.out.print("Enter count of years: ");
        int years = scanner.nextInt();

        System.out.print("Enter times compounded: ");
        double timesCompounded = scanner.nextDouble();

        double sum = principal * Math.pow((1 + annualRate / timesCompounded), timesCompounded * years);

        System.out.printf("The amount after %d years is: $%f", years, sum);

        scanner.close();
    }
}