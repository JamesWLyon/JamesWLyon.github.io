/**
 
    Hello this is my Week 11 Exceptions assignment,

    I watched like 8 youtubevideos to figure out how to do this and do it well.
    Took some trial and error, but after a couple hours of work I figured it
    out in the end. I am sure this could be compacted better, but from where it
    started I am happy how it turned out. The goal of this program is to find
    any out of bounds exception that may happen when using an array and catch
    it, as well as resolve it without crashing the program. Kinda like
    Minecrafts safety feature for when their java file crashs, or the game
    suddenly breaks.

    Made by: James Lyon
 
 **/

public class Main {

    public static void main(String[] args) {
        // Handling array out of bounds exception
        handleArrayException();
        
        // Handling divide by zero exception
        handleDivideByZeroException();
        
        // Print a message indicating successful completion
        System.out.println("Program caught the errors and closed without crashing.");
    }

    // Method to handle array out of bounds exception
    private static void handleArrayException() {
        try {
            // Creating an array with elements 1, 2, 3
            int[] array = {1, 2, 3};
            // Accessing an element outside the bounds of the array
            int value = array[5];
        } catch (ArrayIndexOutOfBoundsException e) {
            // Catching and handling the array out of bounds exception
            System.out.println("Array Out of Bounds Exception: Tried to access an element beyond the array size.");
        }
    }

    // Method to handle divide by zero exception
    private static void handleDivideByZeroException() {
        try {
            // Setting numerator to 10 and denominator to 0 (divide by zero scenario)
            int numerator = 10;
            int denominator = 0;
            // Attempting to divide by zero
            int result = numerator / denominator;
        } catch (ArithmeticException e) {
            // Catching and handling the divide by zero exception
            System.out.println("Divide By Zero Exception: Attempted to divide by zero.");
        }
    }
}
