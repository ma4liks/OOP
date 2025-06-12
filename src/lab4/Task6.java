package lab4;

public class Task6 {
    public static void main(String[] args) {
//        System.out.println(num);
        System.out.print(printNumber());
    }

    //Видало помилку, бо змінна num локальна, та метод main її не бачить
    public static int printNumber() {
        int num = 10;
        return num;
    }
}
