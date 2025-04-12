package lab3;

import java.util.Random;
import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        System.out.print("Enter size of array: ");
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] arr = new int[size];

        Random random = new Random();

        for (int i = 0; i <= size - 1; i++) {
            arr[i] = random.nextInt(1,101);
        }

        for (int numb : arr) {
            System.out.println(numb);
        }

        System.out.println("Length of array: " + arr.length);

        scanner.close();
    }
}
