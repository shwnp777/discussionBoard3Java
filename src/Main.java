import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Example with Array
        int[] intArray = new int[5]; // Fixed size array of integers
        intArray[0] = 10;
        intArray[1] = 20;
        intArray[2] = 30;
        intArray[3] = 40;
        intArray[4] = 50;

        // Accessing array elements
        System.out.println("Array elements:");
        for (int i = 0; i < intArray.length; i++) {
            System.out.println(intArray[i]);
        }

        // Example with ArrayList
        ArrayList<Integer> intArrayList = new ArrayList<>(); // Dynamic ArrayList of integers
        intArrayList.add(10);
        intArrayList.add(20);
        intArrayList.add(30);
        intArrayList.add(40);
        intArrayList.add(50);

        // Accessing ArrayList elements
        System.out.println("ArrayList elements:");
        for (int i = 0; i < intArrayList.size(); i++) {
            System.out.println(intArrayList.get(i));
        }

        // Demonstrating dynamic resizing of ArrayList
        intArrayList.add(60);
        System.out.println("ArrayList after adding an element:");
        for (int i = 0; i < intArrayList.size(); i++) {
            System.out.println(intArrayList.get(i));
        }
    }
}