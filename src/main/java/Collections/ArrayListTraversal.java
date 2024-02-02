package Collections;

import java.util.ArrayList;

public class ArrayListTraversal {
    public static void main(String[] args) {
        // Creating an ArrayList of Strings
        ArrayList<String> stringsList = new ArrayList<>();
        stringsList.add("Apple");
        stringsList.add("Banana");
        stringsList.add("Orange");

        // Traversing using traditional for loop
        System.out.println("Traversing using traditional for loop:");
        for (String fruit : stringsList) {
            System.out.println(fruit);
        }

        // Traversing using enhanced for loop (for-each loop)
        System.out.println("\nTraversing using enhanced for loop:");
        for (String fruit : stringsList) {
            System.out.println(fruit);
        }
    }
}
