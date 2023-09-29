/**
 
    Hello this is my Week 6 assignment,

    This was a cool thing to learn. I will not lie, I was confused
    what objects where in java for a solid hour. Then I finaly
    relized that objects in javascript are not the same as objects
    in java. Objects in javascript is another data type. In java
    though, objects are how you call and define a method.

    Made by: James Lyon
 
 **/

public class Test {

    // This array holds both the names and birthyears of the horses
    private static String info[][] = {/* Names held here*/{"", "", ""},/* Birth years held here */{"", "", ""}};
    // This is the number that is used to decide the current horse info
    private static int num[] = {0, 0};;

    public static void main (String[] args) {
        // The first horse
        horse("Steve", 1963);
        // The second horse
        horse("Lucy", 2032);
        // The third horse
        horse("Rob", 2013);
        // This prints out the horse info in the terminal
        for (var y = 0; y < info[0].length; y++) {
            Print(info[0][y], info[1][y]);
        }
    }

    // This method adds the horse data to the array called info
    public static void horse (String name, int birthYear) {
        // This makes the first item in the first array inside the info array turn into the horse's name
        info[num[0]][num[1]] = name;
        num[0]++;
        // This makes the first item in the second array inside the info array turn into the horse's name
        info[num[0]][num[1]] = String.valueOf(birthYear);
        num[0]--;
        num[1]++;
    }

    // This is takes its info and prints it in the terminal
    public static void Print (String x, String y) {
        System.out.println(x + " the horse was born in " + y + ".");
    }
}
