package phase1_practiceEx;

import java.util.EmptyStackException;
import java.util.Scanner;

class Stack {
    private static final int MAX_SIZE = 100;
    private int top;
    private int[] array;

    public Stack() {
        top = -1;
        array = new int[MAX_SIZE];
    }

    // Function to check if the stack is empty
    public boolean isEmpty() {
        return top == -1;
    }

    // Function to check if the stack is full
    public boolean isFull() {
        return top == MAX_SIZE - 1;
    }

    // Function to insert an element into the stack (push)
    public void push(int data) {
        if (isFull()) {
            System.out.println("Stack overflow. Cannot push element " + data + ".");
            return;
        }

        array[++top] = data;
        System.out.println("Pushed " + data + " into the stack.");
    }

    // Function to remove an element from the stack (pop)
    public int pop() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }

        int poppedElement = array[top--];
        System.out.println("Popped " + poppedElement + " from the stack.");
        return poppedElement;
    }

    // Function to get the element at the top of the stack without removing it
    public int peek() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }

        return array[top];
    }
}

public class StackOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Stack stack = new Stack();

        while (true) {
            System.out.println("\nChoose an operation:");
            System.out.println("1. Push");
            System.out.println("2. Pop");
            System.out.println("3. Peek");
            System.out.println("4. Quit");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter the element to push: ");
                    int elementToPush = scanner.nextInt();
                    stack.push(elementToPush);
                    break;

                case 2:
                    try {
                        int poppedElement = stack.pop();
                        System.out.println("Popped element: " + poppedElement);
                    } catch (EmptyStackException e) {
                        System.out.println("Stack is empty. Cannot pop.");
                    }
                    break;

                case 3:
                    try {
                        int peekedElement = stack.peek();
                        System.out.println("Peeked element: " + peekedElement);
                    } catch (EmptyStackException e) {
                        System.out.println("Stack is empty. Cannot peek.");
                    }
                    break;

                case 4:
                    System.out.println("Exiting the program.");
                    scanner.close();
                    System.exit(0);

                default:
                    System.out.println("Invalid choice. Please choose a valid option.");
            }
        }
    }
}

