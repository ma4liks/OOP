package claswork14_03;

public class Arrays {
    public static void main(String[] args) {
     //масив А = []
     //масив Б = А

     int[] array1;
     int array2[];

     String[] food = new String[5];
     food[0] = "Banana";
     food[1] = "Banana";
     food[2] = "Banana";
     food[3] = "Banana";
//     food[4] = "Banana";
//     food[5] = "Banana";

     int [] numbers = {1, 2, 1000, 1000000};

     for (int i = 0; i < numbers.length; i++) {
         System.out.println("Element is = " + numbers[i]);
     }

     for(int el : numbers ) {
         System.out.println("Foreach element is = " + el);
     }
    }
}
