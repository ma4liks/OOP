package lab4;

import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        System.out.print("Enter array size: ");
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] array = new int [size];

        for (int i = 0; i < size; i++) {
            System.out.print("Enter " + (i + 1) + " element: ");
            array[i] = scanner.nextInt();
        }

        scanner.nextLine();

        System.out.print("Enter line: ");
        String message = scanner.nextLine();

        System.out.println(printNumbers(message, array));

        scanner.close();
    }

    public static String printNumbers(String message, int... array) {
        String result = message + "\n";

        for (int el : array) {
            result += el + " ";
        }
        return result;
    }
}
 