package lab2;

import java.util.Random;
import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        System.out.print("Enter min number: ");
        Scanner scanner = new Scanner(System.in);
        int min = scanner.nextInt();

        System.out.print("Enter max number: ");
        int max = scanner.nextInt();

        Random random = new Random();
        int randomNumber = random.nextInt(min, max);

        String isPaired;
        if (randomNumber % 2 == 0) {
            isPaired = "Number is paired";
        } else {
            isPaired = "Number is unpaired";
        }
        System.out.printf("Random number is %s \n%s", randomNumber, isPaired);

        scanner.close();
    }
}
