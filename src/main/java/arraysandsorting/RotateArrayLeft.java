import java.util.Scanner;
public class RotateArrayLeft {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        System.out.println("enter the number of integers to get rotated:");
        int x = sc.nextInt();

        // Display the original array
        System.out.print("Original array: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        // Rotate the array to the left by x positions
        int n = arr.length;
        x = x % n;

        // Perform left rotation in-place
        for (int i = 0; i < x; i++) {
            int temp = arr[0];
            for (int j = 0; j < n - 1; j++) {
                arr[j] = arr[j + 1];
            }
            arr[n - 1] = temp;
        }

        // Display the rotated array
        System.out.print("\nRotated array:   ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        sc.close();
    }
}
