package phase1_practiceEx;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class QueueOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Queue<Integer> queue = new LinkedList<>();

        while (true) {
            System.out.println("\nChoose an operation:");
            System.out.println("1. Enqueue");
            System.out.println("2. Dequeue");
            System.out.println("3. Display Queue");
            System.out.println("4. Quit");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter the element to enqueue: ");
                    int elementToEnqueue = scanner.nextInt();
                    enqueue(queue, elementToEnqueue);
                    break;

                case 2:
                    dequeue(queue);
                    break;

                case 3:
                    displayQueue(queue);
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

    // Function to enqueue (insert) an element into the queue
    private static void enqueue(Queue<Integer> queue, int element) {
        queue.offer(element);
        System.out.println("Enqueued " + element + " into the queue.");
    }

    // Function to dequeue (remove) an element from the queue
    private static void dequeue(Queue<Integer> queue) {
        if (queue.isEmpty()) {
            System.out.println("Queue is empty. Cannot dequeue.");
        } else {
            int dequeuedElement = queue.poll();
            System.out.println("Dequeued element: " + dequeuedElement);
        }
    }

    // Function to display the elements of the queue
    private static void displayQueue(Queue<Integer> queue) {
        if (queue.isEmpty()) {
            System.out.println("Queue is empty.");
        } else {
            System.out.println("Queue elements: " + queue);
        }
    }
}

