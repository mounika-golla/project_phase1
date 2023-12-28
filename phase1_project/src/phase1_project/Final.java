package phase1_project;

@SuppressWarnings("serial")
class CustomException extends Exception {
    public CustomException(String message) {
        super(message);
    }
}
public class Final {
    public static void main(String[] args) {
        try {
            
            int result = divide(10, 0);

            if (result == 0) {
                throw new CustomException("CustomException: Result is zero.");
            }

        } catch (ArithmeticException ex) {
            System.out.println("ArithmeticException: " + ex.getMessage());
        } catch (CustomException ex) {
            System.out.println(ex.getMessage());
        } finally {
            
            System.out.println("Finally block executed.");
        }

        System.out.println("Program continues after exception handling.");
    }

    public static int divide(int numerator, int denominator) throws ArithmeticException {
        if (denominator == 0) {
            throw new ArithmeticException("Cannot divide by zero.");
        }
        return numerator / denominator;
    }
}
