package lab3;

public class Task6 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};
        int min = arr[0];
        int max = arr[0];
        double sum = 0;
        int pairNumbers = 0;
        double avg = 0;

        for (int i = 0; i <= arr.length - 1; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
            if (arr[i] > max) {
                max = arr[i];
            }

            sum += arr[i];

            if (arr[i] % 2 == 0) {
                pairNumbers += 1;
            }

        }
        avg = sum / arr.length;

        System.out.println("Min: " + min + "\nMax: " + max + "\nAverage: " + avg + "\nCount of pair numbers: " + pairNumbers);

    }
}
