package lab3;

import java.util.Arrays;
import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        System.out.print("Enter the number you are looking for: ");
        Scanner scanner = new Scanner(System.in);
        int userRequiredNumber = scanner.nextInt();
        int[] arr = { 1, 2, 3, 4, 5, 6, 7 };

        int requiredNumber = Arrays.binarySearch(arr, userRequiredNumber);
    if (requiredNumber >= 0) {
        System.out.printf("Number found, it index: %d", requiredNumber);
    } else {
        System.out.println("Number not found");
      }

    scanner.close();
    }
}
