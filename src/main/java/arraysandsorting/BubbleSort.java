package arraysandsorting;
import java.util.*;
public class BubbleSort {
    public static void main(String[] args) {
        int[] array = {64, 34, 25, 12, 22, 11, 90};

        // Display the original array
        System.out.print("Original array: ");
        printArray(array);

        // Sort the array using Bubble Sort
        bubbleSort(array);

        // Display the sorted array
        System.out.print("\nSorted array:   ");
        printArray(array);
    }

    // Function to perform Bubble Sort on an array
    private static void bubbleSort(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Swap arr[j] and arr[j+1]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    // Function to print an array
    private static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
