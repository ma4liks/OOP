package lab4;

public class Task8 {
    public static int counter = 0;
    public static void main(String[] args) {
        System.out.print(setCounter(counter));
    }

    public static int setCounter(int counter){
        counter = 10;
        return counter;
    }
}
