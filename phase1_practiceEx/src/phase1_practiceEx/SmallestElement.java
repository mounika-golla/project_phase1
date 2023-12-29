package phase1_practiceEx;

import java.util.Arrays;

public class SmallestElement{
    public static void main(String[] args) {
        int[] unsortedList = {12, 5, 3, 7, 2, 8, 9, 1, 10, 4, 6}; // Example unsorted list

        int fourthSmallest = findFourthSmallestElement(unsortedList);

        System.out.println("The fourth smallest element is: " + fourthSmallest);
    }

    // Function to find the fourth smallest element in an unsorted list
    private static int findFourthSmallestElement(int[] arr) {
        if (arr.length < 4) {
            System.out.println("The list doesn't have enough elements.");
            return -1; // Indicate an error or handle the case as appropriate
        }

        // Sort the array
        Arrays.sort(arr);

        // Return the fourth smallest element
        return arr[3];
    }
}
