/**
 
    Hello this is my Week 1 Scanner Input project,

    Went through this and had some fun with it. Did figure out how to have
    it separate the names, so I made it so it even asks if it can call you
    by your first name. After some trial and error also got the try/catch
    code to work. Hilariously I had an error while coding that part. Misspelt
    two separate things.

    Made by: James Lyon

**/

import java.util.Scanner;

public class  InputReader{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Part 1: Input int, float, and line
        int userInputInt = 0;
        float userInputFloat = 0.0f;
        String userInputLine = "";

        try {
            System.out.print("Enter an integer: ");
            userInputInt = scanner.nextInt();
            System.out.println("Thank you for inputting the int. I read: " + userInputInt);

            System.out.print("Enter a float: ");
            userInputFloat = scanner.nextFloat();
            System.out.println("Thank you for inputting the float. I read: " + userInputFloat);

            scanner.nextLine(); // Consume the newline character
            System.out.print("Enter a line: ");
            userInputLine = scanner.nextLine();
            System.out.println("Thank you for inputting the line. I read: " + userInputLine);

        } catch (Exception e) {
            System.out.println("Invalid input. Please enter the correct data type.");
            return;
        }

        // Part 2: Try to handle first and last name
        try {
            System.out.print("Enter your first and last name: ");
            String fullName = scanner.nextLine();

            // Splitting full name into first and last names
            String[] names = fullName.split(" ");
            String firstName = names[0];
            String lastName = names.length > 1 ? names[names.length - 1] : "";

            System.out.println("Hello, Mr/Ms " + lastName + ". Can I call you " + firstName + "?");

        } catch (Exception e) {
            System.out.println("Error processing names. Please try again.");
        } finally {
            scanner.close();
        }
    }
}
