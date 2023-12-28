package phase1_project;

import java.util.Scanner;

public class ExceptionHandlingDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter numerator: ");
            int numerator = Integer.parseInt(scanner.nextLine());

            System.out.print("Enter denominator: ");
            int denominator = Integer.parseInt(scanner.nextLine());

            int result = divide(numerator, denominator);

            System.out.println("Result of division: " + result);
        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Please enter valid integers.");
        } catch (ArithmeticException e) {
            System.out.println("Error: Division by zero is not allowed.");
        } finally {
          
            scanner.close();
        }
    }

    private static int divide(int numerator, int denominator) {
        if (denominator == 0) {
            throw new ArithmeticException("Division by zero");
        }
        return numerator / denominator;
    }
}

