package phase1_project;

import java.util.Scanner;

public class ExceptionHandling {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter a number: ");
            int numerator = scanner.nextInt();

            System.out.print("Enter another number: ");
            int denominator = scanner.nextInt();

            int result = divideNumbers(numerator, denominator);
            System.out.println("Result of division: " + result);
        } catch (ArithmeticException ex) {
            System.out.println("Error: Cannot divide by zero.");
        } catch (Exception ex) {
            System.out.println("An unexpected error occurred: " + ex.getMessage());
        } finally {
            
            System.out.println("Finally block executed.");
            scanner.close(); 
        }

        System.out.println("Program continues after exception handling.");
    }

    private static int divideNumbers(int numerator, int denominator) {
        
        return numerator / denominator;
    }
}

