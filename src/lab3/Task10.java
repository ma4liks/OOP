package lab3;

import java.util.Arrays;
import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        System.out.print("Enter array size: ");
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int arr[] = new int[size];

        for (int i = 0; i < size; i++) {
            System.out.print("Enter number for array: ");
            arr[i] = scanner.nextInt();
        }

        for (int el : arr) {
            System.out.print(el + " ");
        }

        System.out.println("\n");

        for (int i = 0; i < size; i++) {
            for (int j = i + 1; j < size; j++) {
                if (arr[i] == arr[j]) {
                    System.out.print("Duplicate found: " + arr[j]);
                    break;
                }
            }
        }

    }
}
