/**
 
    Hello this is my Week 9 Stacks and Queues project,

    Made by: James Lyon
 
 **/


import java.util.*;

public class QueueAndStackDemo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Creating a queue and a stack
        Queue<String> queue = new LinkedList<>();
        Stack<String> stack = new Stack<>();

        // Prompting the user for input
        System.out.println("Enter data (type -1 to stop):");

        String input;
        // Taking user input until "-1" is entered
        while (!(input = scanner.nextLine()).equals("-1")) {
            queue.offer(input); // Adding to the queue
            stack.push(input);  // Adding to the stack
        }

        // Printing data in the queue in the order they would be used
        System.out.println("Queue order:");
        while (!queue.isEmpty()) {
            System.out.println(queue.poll()); // Printing elements in queue order
        }

        // Printing data in the stack in the order they would be used
        System.out.println("Stack order:");
        while (!stack.isEmpty()) {
            System.out.println(stack.pop()); // Printing elements in stack order
        }

        scanner.close(); // Closing the scanner
    }
}
