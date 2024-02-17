import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class UserDataProcessor {
    public static void main(String[] args) {
        // FileWriter and Scanner for writing and reading from file
        FileWriter writer = null;
        Scanner scanner = null;

        try {
            // Create FileWriter instance to write to file
            writer = new FileWriter("user_data.txt");

            // Create Scanner instance to read from console
            scanner = new Scanner(System.in);

            // Prompt user for input 5 times
            for (int i = 1; i <= 5; i++) {
                System.out.print("Enter data for iteration " + i + ": ");
                String data = scanner.nextLine();

                // Write user input to file
                writer.write(data + "\n");
            }

            // Notify user that data has been saved
            System.out.println("Data saved to file.");
        } catch (IOException e) {
            // Handle IOException
            System.err.println("Error: Unable to write to file.");
            e.printStackTrace();
        } finally {
            // Close resources
            try {
                if (writer != null) {
                    writer.close();
                }
                if (scanner != null) {
                    scanner.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        // Read and separate fields from the file
        readAndSeparateFields();
    }

    // Method to read and separate fields from the file
    private static void readAndSeparateFields() {
        Scanner scanner = null;
        try {
            // Create Scanner instance to read from file
            scanner = new Scanner(new File("user_data.txt"));

            // Read and print separated fields from each line
            System.out.println("Separated Fields:");
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] fields = line.split("[,;_]");

                // Print each field
                for (String field : fields) {
                    System.out.print(field.trim() + " ");
                }
                System.out.println();
            }
        } catch (IOException e) {
            // Handle IOException
            System.err.println("Error: Unable to read file.");
            e.printStackTrace();
        } finally {
            // Close the scanner
            if (scanner != null) {
                scanner.close();
            }
        }
    }
}
