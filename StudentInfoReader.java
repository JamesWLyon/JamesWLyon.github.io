/**
 
    Hello, this is my 1.3 Week 3 project,
    Made by: James Lyon

**/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class StudentInfoReader {

    public static void main(String[] args) {
        try {
            // Read student information from the file
            String[] studentInfo = readFromFile("student.txt");

            // Check if exactly three lines were read
            if (studentInfo.length == 3) {
                // Print student information to the console
                System.out.println("Student Information:");
                for (String line : studentInfo) {
                    System.out.println(line);
                }
            } else {
                // Print an error message if the file does not contain three lines
                System.out.println("Error: Incomplete student information in the file.");
            }

        } catch (IOException e) {
            // Handle any IOException that might occur during file reading
            System.err.println("An error occurred: " + e.getMessage());
        }
    }

    /**
     * Reads student information from a file.
     *
     * @param filePath The path to the file containing student information.
     * @return An array of strings representing each line of student information.
     * @throws IOException If an I/O error occurs during file reading.
     */
    private static String[] readFromFile(String filePath) throws IOException {
        // Try-with-resources statement to automatically close resources
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            // Read three lines of student information from the file
            String[] studentInfo = new String[3];
            for (int i = 0; i < studentInfo.length; i++) {
                studentInfo[i] = reader.readLine();
            }
            return studentInfo;
        }
    }
}
