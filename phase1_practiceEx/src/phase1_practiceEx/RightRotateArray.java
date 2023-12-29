package phase1_practiceEx;

public class RightRotateArray {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9}; // Example array

        System.out.println("Original Array: ");
        printArray(array);

        int rotateSteps = 5;
        rightRotateArray(array, rotateSteps);

        System.out.println("\nArray after right rotation by " + rotateSteps + " steps: ");
        printArray(array);
    }

    // Function to right rotate an array by specified number of steps
    private static void rightRotateArray(int[] arr, int steps) {
        int n = arr.length;
        steps = steps % n; // Handle cases where steps are greater than array length

        reverseArray(arr, 0, n - 1);
        reverseArray(arr, 0, steps - 1);
        reverseArray(arr, steps, n - 1);
    }

    // Function to reverse an array or a portion of an array
    private static void reverseArray(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    // Function to print an array
    private static void printArray(int[] arr) {
        for (int value : arr) {
            System.out.print(value + " ");
        }
        System.out.println();
    }
}

