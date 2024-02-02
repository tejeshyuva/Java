package Collections;

import java.util.ArrayList;

public class RemoveLastObject {
    public static void main(String[] args) {
        // Create an ArrayList
        ArrayList<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Orange");

        // Print the ArrayList before removing the last object
        System.out.println("ArrayList before removing the last object: " + list);

        // Remove the last object from the ArrayList
        list.remove(list.size() - 1);
        System.out.println("Last object removed successfully.");

        // Print the ArrayList after removing the last object
        System.out.println("ArrayList after removing the last object: " + list);
    }

    public static void removeLastObject(ArrayList<String> list) {
        if (!list.isEmpty()) {
            list.remove(list.size() - 1);
        }
    }
}
