import java.util.Scanner;

// Define a class to represent each element in the linked list
class Node {
    // Data stored in the node
    private String data;
    // Reference to the next node
    private Node next;
    // Reference to the previous node
    private Node previous;

    // Constructor to initialize the node with data
    public Node(String data) {
        this.data = data;
        this.next = null;
        this.previous = null;
    }

    // Getter method for data
    public String getData() {
        return data;
    }

    // Getter method for the next node
    public Node getNext() {
        return next;
    }

    // Setter method for the next node
    public void setNext(Node next) {
        this.next = next;
    }

    // Getter method for the previous node
    public Node getPrevious() {
        return previous;
    }

    // Setter method for the previous node
    public void setPrevious(Node previous) {
        this.previous = previous;
    }
}

// Main class to manage the linked list
public class SimpleLinkedList {
    // Head of the linked list
    private Node head;
    // Tail of the linked list
    private Node tail;

    // Method to add a new node to the end of the list
    public void addNode(String data) {
        Node newNode = new Node(data);
        // If the list is empty, set the new node as both head and tail
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            // Otherwise, add the new node after the current tail
            tail.setNext(newNode);
            // Update the previous reference of the new node
            newNode.setPrevious(tail);
            // Update the tail to the new node
            tail = newNode;
        }
    }

    // Method to display the list from head to tail
    public void displayForward() {
        Node current = head;
        // Traverse the list from head to tail and print each node's data
        while (current != null) {
            System.out.print(current.getData() + " ");
            current = current.getNext();
        }
        System.out.println(); // Print a new line after displaying the list
    }

    // Method to display the list from tail to head
    public void displayBackward() {
        Node current = tail;
        // Traverse the list from tail to head and print each node's data
        while (current != null) {
            System.out.print(current.getData() + " ");
            current = current.getPrevious();
        }
        System.out.println(); // Print a new line after displaying the list
    }

    public static void main(String[] args) {
        // Create a scanner object to read input from the console
        Scanner scanner = new Scanner(System.in);
        // Create an instance of SimpleLinkedList to manage the list
        SimpleLinkedList list = new SimpleLinkedList();

        System.out.println("Enter data items (type 'done' to finish):");
        String input;
        // Prompt the user to input data items until they type "done"
        while (true) {
            input = scanner.nextLine();
            if (input.equals("done")) {
                break;
            }
            // Add each input data item to the linked list
            list.addNode(input);
        }

        // Display the data items in the list from head to tail
        System.out.println("Data items from head to tail:");
        list.displayForward();

        // Display the data items in the list from tail to head
        System.out.println("Data items from tail to head:");
        list.displayBackward();
        
        // Close the scanner to release resources
        scanner.close();
    }
}
