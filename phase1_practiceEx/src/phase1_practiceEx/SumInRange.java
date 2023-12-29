package phase1_practiceEx;

import java.util.Scanner;

public class SumInRange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements (n): ");
        int n = scanner.nextInt();

        int[] array = new int[n];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            System.out.print("Element " + i + ": ");
            array[i] = scanner.nextInt();
        }

        System.out.print("Enter the range (L and R) where 0 <= L <= R <= n-1:\n");
        System.out.print("Enter L: ");
        int L = scanner.nextInt();

        System.out.print("Enter R: ");
        int R = scanner.nextInt();

        int sumInRange = calculateSumInRange(array, L, R);

        System.out.println("The sum of elements in the range [" + L + ", " + R + "] is: " + sumInRange);

        scanner.close();
    }

    // Function to calculate the sum of elements in the range [L, R]
    private static int calculateSumInRange(int[] arr, int L, int R) {
        int sum = 0;
        
        if (L < 0 || R >= arr.length || L > R) {
            System.out.println("Invalid range");
            return -1; // Indicate an error or handle the case as appropriate
        }

        for (int i = L; i <= R; i++) {
            sum += arr[i];
        }

        return sum;
    }
}
