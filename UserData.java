/*

    My name is James Lyon, and this is my week 6 assignment Delimiters.
 
*/


import java.io.*;
import java.util.*;

public class UserData {
    public static void main(String[] args) {
        // Initialize a Scanner object to read user input from the console
        Scanner scanner = new Scanner(System.in);
        // Define the number of user records to collect
        int numRecords = 5;
        // Define the filename to save user data
        String filename = "user_data.txt";

        // Prompt the user to input data for each user and save it to a file
        for (int i = 0; i < numRecords; i++) {
            System.out.println("Enter data for user " + (i + 1) + ":");
            // Get user data from the user
            Map<String, String> userData = getUserData(scanner);
            // Save user data to the file
            saveDataToFile(userData, filename);
        }

        // Display the saved user data
        System.out.println("\nData saved to file. Here is the information:");
        readDataFromFile(filename);

        // Calculate some statistics based on the numbers entered
        try {
            // List to store the numbers entered by users
            List<Integer> numbers = new ArrayList<>();
            // Open a file reader to read user data from the file
            BufferedReader reader = new BufferedReader(new FileReader(filename));
            String line;
            // Read each line of the file
            while ((line = reader.readLine()) != null) {
                // Check if the line contains a number entry
                if (line.contains("Number")) {
                    try {
                        // Extract and parse the number from the line and add it to the list
                        int number = Integer.parseInt(line.split(": ")[1]);
                        numbers.add(number);
                    } catch (NumberFormatException e) {
                        // Handle parsing errors
                        e.printStackTrace();
                    }
                }
            }
            // Close the file reader
            reader.close();

            // If there are numbers entered, calculate the average and mode
            if (!numbers.isEmpty()) {
                // Calculate the average of the numbers
                double sum = 0;
                for (int number : numbers) {
                    sum += number;
                }
                double averageNumber = sum / numbers.size();
                System.out.println("\nAverage of the numbers entered: " + averageNumber);

                // Calculate the mode of the numbers
                Map<Integer, Integer> frequencyMap = new HashMap<>();
                for (int number : numbers) {
                    if (frequencyMap.containsKey(number)) {
                        frequencyMap.put(number, frequencyMap.get(number) + 1);
                    } else {
                        frequencyMap.put(number, 1);
                    }
                }
                int modeNumber = 0;
                int maxFrequency = 0;
                for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
                    if (entry.getValue() > maxFrequency) {
                        modeNumber = entry.getKey();
                        maxFrequency = entry.getValue();
                    }
                }
                System.out.println("Most common number entered: " + modeNumber);
            } else {
                // If no numbers are entered, display a message
                System.out.println("No numbers entered to calculate statistics.");
            }
        } catch (IOException e) {
            // Handle file IO errors
            e.printStackTrace();
        }
    }

    // Function to get user data from the console
    public static Map<String, String> getUserData(Scanner scanner) {
        // Create a map to store the user data
        Map<String, String> userData = new HashMap<>();
        // Prompt the user for their name, address, and pet
        System.out.print("Enter name: ");
        userData.put("Name", scanner.nextLine());
        System.out.print("Enter address: ");
        userData.put("Address", scanner.nextLine());
        System.out.print("Enter pet: ");
        userData.put("Pet", scanner.nextLine());

        // Prompt the user to enter a number until a valid number is entered
        while (true) {
            try {
                System.out.print("Enter a number: ");
                // Parse the user input as an integer and add it to the user data map
                userData.put("Number", String.valueOf(Integer.parseInt(scanner.nextLine())));
                break;
            } catch (NumberFormatException e) {
                // Handle parsing errors
                System.out.println("Please enter a valid number.");
            }
        }
        // Return the user data map
        return userData;
    }

    // Function to save user data to a file
    public static void saveDataToFile(Map<String, String> data, String filename) {
        try {
            // Open a file writer in append mode to add data to the file
            BufferedWriter writer = new BufferedWriter(new FileWriter(filename, true));
            // Write each key-value pair of user data to the file
            for (Map.Entry<String, String> entry : data.entrySet()) {
                writer.write(entry.getKey() + ": " + entry.getValue());
                writer.newLine();
            }
            // Add an empty line between user records for readability
            writer.newLine();
            // Close the file writer
            writer.close();
        } catch (IOException e) {
            // Handle file IO errors
            e.printStackTrace();
        }
    }

    // Function to read user data from a file and print it to the console
    public static void readDataFromFile(String filename) {
        try {
            // Open a file reader to read data from the file
            BufferedReader reader = new BufferedReader(new FileReader(filename));
            String line;
            // Read each line from the file and print it to the console
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
            // Close the file reader
            reader.close();
        } catch (IOException e) {
            // Handle file IO errors
            e.printStackTrace();
        }
    }
}
