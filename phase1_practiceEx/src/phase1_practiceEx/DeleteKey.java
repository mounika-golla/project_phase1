package phase1_practiceEx;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class LinkedList {
    Node head;

    LinkedList() {
        this.head = null;
    }

    // Function to insert a new node at the end of the linked list
    void insert(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }

    // Function to display the linked list
    void display() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    // Function to delete the first occurrence of a key in the linked list
    void deleteKey(int key) {
        Node current = head;
        Node prev = null;

        // If the key is in the head node
        if (current != null && current.data == key) {
            head = current.next;
            return;
        }

        // Search for the key and keep track of the previous node
        while (current != null && current.data != key) {
            prev = current;
            current = current.next;
        }

        // If the key was not found
        if (current == null) {
            System.out.println("Key not found in the linked list.");
            return;
        }

        // Unlink the node containing the key
        prev.next = current.next;
    }
}

public class DeleteKey {
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();

        // Insert elements into the linked list
        linkedList.insert(1);
        linkedList.insert(2);
        linkedList.insert(3);
        linkedList.insert(4);
        linkedList.insert(5);

        System.out.println("Original linked list:");
        linkedList.display();

        // Delete the first occurrence of key=3
        int keyToDelete = 3;
        linkedList.deleteKey(keyToDelete);

        System.out.println("Linked list after deleting the first occurrence of key " + keyToDelete + ":");
        linkedList.display();
    }
}
