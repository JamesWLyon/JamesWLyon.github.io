import java.util.*;

public class TicketCounterSimulation {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Creating a queue to simulate the ticket line
        Queue<String> ticketLine = new LinkedList<>();

        // Welcoming the user and prompting them to join the line
        System.out.println("Welcome to the ticket counter simulation!");
        System.out.println("Enter your name to join the line (type 'done' to stop):");

        String input;
        // Taking user input until "done" is entered
        while (!(input = scanner.nextLine()).equals("done")) {
            ticketLine.offer(input); // Adding person to the line
            System.out.println(input + " has joined the ticket line!");
        }

        // Serving customers until the line is empty
        while (!ticketLine.isEmpty()) {
            String currentCustomer = ticketLine.poll(); // Serving the next customer
            System.out.println("Now serving: " + currentCustomer);
        }

        // Simulation complete
        System.out.println("All customers have been served. Simulation complete!");

        scanner.close(); // Closing the scanner
    }
}
