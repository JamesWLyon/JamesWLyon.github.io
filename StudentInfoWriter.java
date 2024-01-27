/**
 
    Hello this is my Week 2 Writer project,

    This was actualy pretty confusing to make, but the power
    of YouTube is great and helped me in the end to figure
    out what I was doing wrong. Was quitee an enjoyable
    lesson though.

    Made by: James Lyon

**/

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class StudentInfoWriter {

    public static void main(String[] args) {
        try {
            // Create a BufferedReader to read input from the console
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

            // Prompt the user to input their information
            System.out.println("Welcome to Student Info Writer!");
            System.out.println("Please enter your first name:");
            String firstName = reader.readLine();

            System.out.println("Please enter your last name:");
            String lastName = reader.readLine();

            System.out.println("Please enter your school year (e.g., 9th, freshman):");
            String schoolYear = reader.readLine();

            System.out.println("Please enter the name of your school:");
            String schoolName = reader.readLine();

            // Close the reader
            reader.close();

            // Write user information to the file
            writeToFile(firstName, lastName, schoolYear, schoolName);

            System.out.println("Student information has been written to student.txt successfully.");

        } catch (IOException e) {
            // Handle any IOException that might occur during user input or file writing
            System.err.println("An error occurred: " + e.getMessage());
        }
    }

    /**
     * Writes user information to a file named "student.txt".
     *
     * @param firstName  The first name of the student.
     * @param lastName   The last name of the student.
     * @param schoolYear The school year or grade of the student.
     * @param schoolName The name of the school the student attends.
     * @throws IOException If an I/O error occurs during file writing.
     */
    private static void writeToFile(String firstName, String lastName, String schoolYear, String schoolName)
            throws IOException {
        // Try-with-resources statement to automatically close resources
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("student.txt"))) {
            // Write user information to the file, one per line with labels for clarity
            writer.write("First Name: " + firstName);
            writer.newLine();

            writer.write("Last Name: " + lastName);
            writer.newLine();

            writer.write("School Year: " + schoolYear);
            writer.newLine();

            writer.write("School Name: " + schoolName);
        }
    }
}
