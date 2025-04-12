package lab3;

import java.util.Arrays;
import java.util.Random;

public class Task7 {
    public static void main(String[] args) {
        int[] arr = new int[10];

        Random random = new Random();

        for (int i = 0; i < 10; i++) {
            arr[i] = random.nextInt(1, 1001);
        }

        Arrays.sort(arr);
        for (int el : arr) {
            System.out.print(el + " ");
        }
    }
}
