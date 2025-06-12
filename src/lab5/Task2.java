package lab5;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        double balance = 0;
        int lastDodep;
        int withdraw;
        int close;
        int user_choice;

        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("1.Withdraw current balance");
            System.out.println("2.Deposit funds to the account");
            System.out.println("3.Withdraw funds from the account");
            System.out.println("4.End the program");
            user_choice = scanner.nextInt();

            switch (user_choice) {
                case 1:
                    System.out.println(showBalance(balance));
                    break;
                case 2:
                    balance = deposit(scanner, balance);
                    System.out.print("Your balance is: " + balance + "\n");
                    break;
                case 3:
                    balance = withdraw(scanner, balance);
                    System.out.print("Your balance is: " + balance + "\n");
                    break;
                case 4:
                    System.out.println("End");
                    break;
            }
        } while (user_choice != 4);
    }

    static String showBalance(double balance) {
        return "Your balance is: " + balance;
    }

    static double deposit(Scanner scanner, double balance) {
        System.out.print("Enter amount of money: ");
        double sum = scanner.nextDouble();
        balance += sum;
        return balance;
    }

    static double withdraw(Scanner scanner, double balance) {
        System.out.print("Enter amount of money: ");
        double sum = scanner.nextDouble();
        if (sum > balance) {
            System.out.print("Insufficient funds" + "\n");
        } else {
            balance -= sum;
        }
        return balance;
    }
}
