public class MoveZerosToEnd {
    public static void main(String[] args) {
        int[] numbers = {0, 3, 0, 2, 8, 4, 0, 1};
        moveZerosToEnd(numbers);
        System.out.print("Modified array: ");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
    }

    
    private static void moveZerosToEnd(int[] nums) {
        int nonZeroIndex = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                int temp = nums[i];
                nums[i] = nums[nonZeroIndex];
                nums[nonZeroIndex] = temp;
                nonZeroIndex++;
            }
        }
    }
}
