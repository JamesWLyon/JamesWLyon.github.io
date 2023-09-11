/**
 
    Hello this is my Week 4 4B assignment

    Made by: James Lyon
 
 **/

public class Test {
    public static void main (String args[]) {

        // This is the variable that determines the length of the array that holds all of the numbers
        int lngth = 100;
        // This is the array that holds all the numbers, the code after the equal sign is to set the size of the array
        int[] numbers = new int[lngth];
        
        // When this for loop runs it adds numbers to the array. Then prints that number in the console, as well says if it is odd or even
        for (var i = 0; i <= numbers.length; i++) {

            // This where the number from the variable i gets put into the array
            numbers[i] = i + 1;

            // This says if the current number out of the array is divisible by two all the way to zero, to print and say it is even
            if (numbers[i] % 2 == 0) {
                System.out.println(numbers[i] + " is even");
            }
            // If the if statement above is false, this will run and print that the number is odd
            else {
                System.out.println(numbers[i] + " is odd");
            }
        }
    }
}
