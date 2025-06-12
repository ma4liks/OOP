package lab4;

import java.util.Arrays;
import java.util.Scanner;

public class Task11 {
    public static void main(String[] args) {
        System.out.print("Enter array size: ");
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] numbers = new int [size];
        for (int i = 0; i < size; i++) {
            System.out.print("Enter number: ");
            numbers[i] = scanner.nextInt();
        }

        System.out.print("Max number is: " + findMax(numbers));
    }

    public static int findMax(int... numbers) {
        int max = numbers[1];
        for (int el : numbers) {
            if (max < el) {
                max = el;
            }
        }
        return max;
    }
}
