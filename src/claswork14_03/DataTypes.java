package claswork14_03;

public class DataTypes {
    public static void main(String[] args) {
//        int num1 = 100;
//        int num2 = num1;
//        System.out.println(num1);
//        System.out.println(num2);
//        num1 = 5;
//        System.out.println(num1);
//        System.out.println(num2);

        String[] cars1 = {"Ford", "Audi", "BMW"};
        String[] cars2 = cars1;

        System.out.println(cars1);
        System.out.println(cars2);

        cars1[0] = "Volvo";

        for (String car : cars1) {
            System.out.println("cars1: " + car);
        }

        for (String car : cars1) {
            System.out.println("cars2: " + car);
        }
    }
}
