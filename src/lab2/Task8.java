package lab2;

import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        System.out.print("Enter your email: ");
        Scanner scanner = new Scanner(System.in);
        String email = scanner.nextLine();

        String name = email.substring(0, email.length() - 10);
        String mail = email.substring(email.length() - 9, email.length());

        if (email.contains("@")) {
            System.out.printf("Info about user:\nUsername: %s\nMail service: %s", name, mail);
        } else {
            System.out.print("Error, you have not entered email address");
        }

        scanner.close();
    }
}
