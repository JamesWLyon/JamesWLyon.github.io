/*

    My name is James Lyon, and this is my week 5 assignment String Tokenizer.
 
*/

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class LetterFrequencyAnalyzer {
    public static void main(String[] args) {
        // Define the file name
        String fileName = "LetterFrequency.txt";

        // Create a map to store letter frequencies
        Map<Character, Integer> letterFreq = new HashMap<>();

        // Variable to store total number of letters
        int totalLetters = 0;

        try {
            // Read from the file
            File file = new File(fileName);
            Scanner scanner = new Scanner(file);

            // Loop through each line in the file
            while (scanner.hasNextLine()) {
                // Read a line
                String line = scanner.nextLine();

                // Split the line by whitespace
                String[] parts = line.split("\\s+");

                // Extract letter and frequency
                char letter = parts[0].charAt(0);
                int frequency = Integer.parseInt(parts[1]);

                // Update letter frequency map and total letters count
                letterFreq.put(letter, frequency);
                totalLetters += frequency;
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            // Handle file not found exception
            System.err.println("File not found: " + fileName);
            e.printStackTrace();
        }

        // Calculate average frequency and total percentage
        double averageFrequency = calculateAverageFrequency(letterFreq);
        double totalPercentage = calculateTotalPercentage(letterFreq, totalLetters);

        // Print the results
        printResults(letterFreq, averageFrequency, totalPercentage);
    }

    // Method to calculate average frequency
    private static double calculateAverageFrequency(Map<Character, Integer> letterFreq) {
        int sum = 0;
        for (int freq : letterFreq.values()) {
            sum += freq;
        }
        return (double) sum / letterFreq.size();
    }

    // Method to calculate total percentage
    private static double calculateTotalPercentage(Map<Character, Integer> letterFreq, int totalLetters) {
        double sum = 0;
        for (int freq : letterFreq.values()) {
            sum += ((double) freq / totalLetters) * 100;
        }
        return sum;
    }

    // Method to print the results
    private static void printResults(Map<Character, Integer> letterFreq, double averageFrequency, double totalPercentage) {
        for (Map.Entry<Character, Integer> entry : letterFreq.entrySet()) {
            char letter = entry.getKey();
            int frequency = entry.getValue();
            double percentage = ((double) frequency / totalPercentage) * 100;
            System.out.println(letter + "\t" + percentage + "%");
        }
        System.out.printf("Total\tAverage Frequency: %.2f\tTotal Percentage: %.2f%%\n", averageFrequency, totalPercentage);
    }
}
