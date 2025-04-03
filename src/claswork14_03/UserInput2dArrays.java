package claswork14_03;

import java.sql.Array;
import java.util.Scanner;

public class UserInput2dArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter garage length: ");
        int arrayLength = scanner.nextInt();

        String[] cars = new String[arrayLength];
        scanner.nextLine();

        for (int i = 0; i < cars.length; i++) {
            System.out.print("Enter your car: ");
            cars[i] = scanner.nextLine();
        }

        for(String car : cars) {
            System.out.println("Машина: " + car);
        }

        scanner.close();
    }
}
