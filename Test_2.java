/**
 
    Hello, this is an updated version of my Week 5 5B project

    This now includes an sorter that checks if a random number has already been generated.
    My teacher Kim Gross, showed me how to do it, and do it simple. I also turned the parts
    that print the numbers in the terminal into functions, to shorten the code some.

    Made by: James Lyon
 
 **/


// This is a java libary that allows us to better use random numbers
import java.util.Random;

public class Test {
    public static void main (String args[]) {
        // The main function calls sorter to start the program
        sortter();
    }

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
        // This varaible gets the length of the array minus one, this helps with alot of the for loops
        int current_num = numbers.length - 1;

        
        // This for loop adds random numbers to the array
        for (var y = 0; y < numbers.length; y++) {
            // This generates a random number between 0 and the length of the array times 10
            ran_num = num.nextInt(numbers.length * 10) + 1;
            // This then adds that number to the array
            for (var x = 0; x < numbers.length; x++) {
                // This checks to see if the number has already been generated, if it has, it runs the outer for loop another time
                if (ran_num == current_num) {
                    y--;
                }
                // If not it adds it to the array
                else {
                    numbers[y] = ran_num;
                }
            }
        }

        // This prints out the array in the terminal
        print_txt(numbers, current_num, hlp);
        System.out.println("\n");


        // This while loop then checks to see if the array is sortted in numeric order, from lowest to highest
        while (check) {
            check = false;
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

        // This prints out the array in the terminal
        print_txt(numbers, current_num, hlp);
    }
    
    // This is the function that swaps all the numbers in the array
    public static void swapper (int[] array, int i, int y) {
        int itm = array[i];
        array[i] = array[y];
        array[y] = itm;
    }

    // This is the function that prints the numbers in the terminal
    public static void print_txt (int[] array, int num, String hlp) {
        // This prints out the array in the terminal
        System.out.println("Sorted Array:");
        for (var y = 0; y < array.length; y++) {
            // This removes the comma from the last item in the array to make it look nice
            if (y == num) {
                System.out.print(array[y]);
            }
            // This prints the rest of the numbers
            else {
                System.out.print(array[y] + hlp);
            }
        }
    }
}
