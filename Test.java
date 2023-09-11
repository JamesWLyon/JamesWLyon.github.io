/**

    Hello this is my Week 3 3B assignment

    Made by: James Lyon

 */

public class Test {

    public static void main(String[] args) {

        // This is a for loop. This repeats itself until the variable i is greater than 100 or equal to it.
        for (var i = 1; i <= 100; i++) {

            // This is an if/else statement. Its saying if variable i is disable by two until it equals 0, it is an even number.
            if (i % 2 == 0) {

                // This prints out what number variable i is and that it is even
                System.out.println(i + " is even");
            }
            // This is the else part of the if/else statement. This will run if the if part of the statement is not true.
            else {

                // This prints out what number variable i is and that it is odd
                System.out.println(i + " is odd");
            }
        }
    }
}
