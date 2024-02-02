public class LinearSearch {
    public static void main(String[] args) {
        int[] array = {10, 25, 5, 42, 8, 15, 30};
        int target = 42;

        // Perform linear search
        int index = linearSearch(array, target);

        // Display the result
        if (index != -1) {
            System.out.println("Element " + target + " found at index: " + index);
        } else {
            System.out.println("Element " + target + " not found in the array.");
        }
    }

    // Linear Search function
    private static int linearSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i; // Return the index where the target is found
            }
        }
        return -1; // Return -1 if the target is not found
    }
}
