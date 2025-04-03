package claswork14_03;

import java.util.Arrays;

public class SortedArrays {
    public static void main(String[] args) {
        String[] fruits = {"orange", "banana", "apple"};

        for (String fruit : fruits) {
            System.out.print(fruit + " - ");
        }

            Arrays.sort(fruits);
            System.out.println(fruits + " - ");

            Arrays.fill(fruits, "default fruit");
            System.out.print("Done");
            for (String fruit2 : fruits) {
                System.out.print(fruits);
            }

    }
}
