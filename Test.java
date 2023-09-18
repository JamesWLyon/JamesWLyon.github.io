/**
 
    Hello this is my Week 5 5B assignment,

    This week I really wanted to push myself,
    so I took my Python and Javascript knowledge and
    made this program which gets random numbers,
    adds them to an array, and then sorts the array.

    Made by: James Lyon
 
 **/


// This is a java libary that allows us to better use random numbers
import java.util.Random;

public class Test {
    public static void main (String args[]) {
        // The main function calls sorter to start the program
        sortter();}

    public static void sortter () {
        // This is the variable that determines the length of the array that holds all of the numbers
        int lngth = 50;
        // This is the array that holds all the numbers, the code after the equal sign is to set the size of the array
        int[] numbers = new int[lngth];

        // This makes a instance where we can use random numbers freely
        Random num = new Random();
        // This is the variable that will generate our random number
        int ran_num;
        // This will be the boolean that will check if our array is sorted
        boolean check = true;
        // This helps with spacing stuff when it is printed in the terminal
        String hlp = ", ";

        
        // This for loop adds random numbers to the array
        for (var y = 0; y < numbers.length; y++) {
            // This generates a random number between 0 and the length of the array times 10
            ran_num = num.nextInt(numbers.length * 10) + 1;
            // This then adds that numberto the array
            numbers[y] = ran_num;
        }

        // This prints out the unsorted array in the terminal
        System.out.println("Unsorted Array:");
        for (var y = 0; y < numbers.length; y++) {
            if (y != numbers.length - 1) {
                System.out.print(numbers[y] + hlp);
            }
            // This removes the comma from the last item in the array to make it look nice and adds a space below
            else {
                System.out.print(numbers[y] + "\n\n");
            }
        }


        // This while loop then checks to see if the array is sortted in numeric order, from lowest to highest
        while (check) {
            check = false;
            /* This varaible gets the length of the array minus one
               This allows for when it's time to check, that it checks the number bellow it's current number */
            int current_num = numbers.length - 1;
            // This for loop then swaps all the out of order numbers in the array
            for (var y = 0; y < current_num; y++) {
                if (numbers[y] > numbers[y + 1]) {
                    swapper(numbers, y, y + 1);
                    // It keeps telling the while loop that its not done yet, once it is done swapping all the numbers, it won't change this varaible back to true
                    check = true;
                }
            }
            current_num--;
        }

        // This prints out the sorted array in the terminal
        System.out.println("Sorted Array:");
        for (var y = 0; y < numbers.length; y++) {
            if (y != numbers.length - 1) {
                System.out.print(numbers[y] + hlp);
            }
            // This removes the comma from the last item in the array to make it look nice
            else {
                System.out.print(numbers[y]);
            }
        }
    }
    
    // This is the function that swaps all the numbers in the array
    public static void swapper (int[] array, int i, int y) {
        int itm = array[i];
        array[i] = array[y];
        array[y] = itm;
    }
}
