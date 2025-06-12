package lab4;

public class Task7 {
    public static int counter = 0;
    public static void main(String[] args) {
        increment();
        increment();
        System.out.print(counter);
    }

    public static void increment() {
        counter += 1;
    }
}
