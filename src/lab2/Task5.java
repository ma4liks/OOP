package lab2;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        System.out.print("Enter line: ");
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();

        int length = line.length();
        char letter = line.charAt(0);
        char end = line.charAt(line.length() - 1);
        String bigLetters = line.toUpperCase();
        String smallLetters = line.toLowerCase();
        String partOfLine = line.substring(0, 3);
        boolean java = line.contains("Java");

        System.out.println("Length is: " + length);
        System.out.println("First letter is: " + letter);
        System.out.println("Last letter is: " + end);
        System.out.println("Upper case: " + bigLetters);
        System.out.println("Lower case: " + smallLetters);
        System.out.println("Substring: " + partOfLine);
        System.out.println("Is there a Java?" + java);

        scanner.close();
    }
}
