package lab4;

import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {
        System.out.print("Enter array size: ");
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] array = new int [size];
        for (int i = 0; i < size; i++) {
            System.out.print("Enter " + (i + 1) + " element: ");
            array[i] = scanner.nextInt();
        }

        System.out.println("Sum is: " + sum(array));
        scanner.close();
    }

    public static int sum(int... array) {
        int sum = 0;
        for (int num : array) {
            sum += num;
        }

        return sum;
    }
}
