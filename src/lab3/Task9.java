package lab3;

import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {
        System.out.print("Enter index (from 0 to 9): ");
        Scanner scanner = new Scanner(System.in);
        int ind = scanner.nextInt();
        System.out.print("Enter its value: ");
        int newValue = scanner.nextInt();
        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

        arr[ind] = newValue;

        System.out.print("New array: ");
        for (int el : arr) {
            System.out.print(el + ", ");
        }

        scanner.close();
    }
}
