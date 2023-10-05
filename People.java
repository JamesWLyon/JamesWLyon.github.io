/**
 
    Hello this is my Week 7 Objects Part 1 assignment,

    Last week I did not fully understand what an object in java was.
    Thanks to Mr. Gross's explaination and some more reading I
    finally understood what an object is and how to create and use
    one. So I made this. This program creates objects that are humans.
    It includes there name, age, height, and weight. As well as prints
    the info in the terminal to easily read.

    Made by: James Lyon
 
 **/

public class People {

    // Variable for the person's name
    String prsnName;
    // Variable for the person's age
    String prsnAge;
    // Variable for the person's height
    String prsnHeight;
    // Variable for the person's weight
    String prsnWeight;

    // This is the method for the objects
    public People (String name, int age, String height, int weight) {
        // Sets the person's name
        prsnName = name;
        // Sets the person's age, converts int to string
        prsnAge = String.valueOf(age);
        // Sets the person's height
        prsnHeight = height;
        // Sets the person's weight, converts int to string
        prsnWeight = String.valueOf(weight);
    }

    public static void main (String[] args) {
        // The first object
        People people1 = new People("Tim", 19, "6'2" + '"', 186);
        // The second object
        People people2 = new People("Rebbeca", 57, "4'8" + '"', 102);
        // The third object
        People people3 = new People("Chloe", 6, "3'6" + '"', 52);
        // The fourth object
        People people4 = new People("Richard", 87, "5'11" + '"', 173);

        // Prints out a bank line so it looks good
        System.out.println("");
        // Prints out the info of the first object
        System.out.println(people1.prsnName + " is " + people1.prsnAge + " years old, is " + people1.prsnHeight + ", and weighs " + people1.prsnWeight + ".");
        // Prints out the info of the second object
        System.out.println(people2.prsnName + " is " + people2.prsnAge + " years old, is " + people2.prsnHeight + ", and weighs " + people2.prsnWeight + ".");
        // Prints out the info of the third object
        System.out.println(people3.prsnName + " is " + people3.prsnAge + " years old, is " + people3.prsnHeight + ", and weighs " + people3.prsnWeight + ".");
        // Prints out the info of the fourth object
        System.out.println(people4.prsnName + " is " + people4.prsnAge + " years old, is " + people4.prsnHeight + ", and weighs " + people4.prsnWeight + ".");
        // Prints another blank line so it looks good
        System.out.println("");
    } 
}
