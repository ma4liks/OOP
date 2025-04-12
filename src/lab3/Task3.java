package lab3;

public class Task3 {
    public static void main(String[] args) {
        int product;
        int i;

        for (i = 1; i <= 10; i++) {
            product = 7 * i;
            System.out.print("Cycle for: " + product + "\n");
        }

        System.out.println("");

        i = 1;
        while (i <= 10) {
            product = 7 * i;
            i++;
            System.out.print("Cycle while: " + product + "\n");
        }

        System.out.println("");

        i = 1;
        do {
            product = 7 * i;
            i++;
            System.out.print("Cycle do-while: " + product + "\n");
        } while (i <= 10);

    }
}
