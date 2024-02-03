import java.util.Scanner;

public class WordBreaker {

    public static void main(String[] args) {
        // Hard-coded string
        String testString = "the quick Brown Fox Jumped over the lazy dog";

        // Display the original string and its words
        System.out.println("Original string:");
        System.out.println(testString); // Print the original string
        printWords(testString);

        // User input
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nEnter a line of text:");
        String userInput = scanner.nextLine();
        System.out.println("Your input:");
        printWords(userInput);

        scanner.close();
    }

    // Method to break down the input into words and print them
    private static void printWords(String input) {
        // Remove punctuation and convert to lowercase
        input = input.replaceAll("[^a-zA-Z ]", "").toLowerCase();

        // Split the string into words using space as a delimiter
        String[] words = input.split(" ");

        // Print each word on a separate line
        System.out.println("Individual words:");
        for (String word : words) {
            System.out.println(word);
        }

        // Print the total number of words
        System.out.println("Total number of words: " + words.length);
    }
}
