/**
 
    Hello this is my Week 10 Inheritance assignment,

    I am really proud of this program, was tons of fun to mess around with.
    Did take me quite a few youtube videos to understand how some of the new
    stuff from this week worked. I got there in the end though. I made this
    program so it creates instances of the class "creature" which has two sub
    classes, "bug" and "animal". Its adds them to an array so if needed it
    can sort all the instances.

    Made by: James Lyon
 
 **/

// This imports two libarys that will help with holding the class instances in an array and sortimg them
import java.util.ArrayList;
import java.util.Collections;

// Creature class
class Creature implements Comparable<Creature> {
    // This holds the creature data
    String creatureName;

    Creature(String name) {
        // This makes the data able to be used by other programs
        this.creatureName = name;
    }

    void printCreatureName() {
        // This small part of code prints the data info in the terminal to show it is working
        System.out.println("Creature Name: " + creatureName);
    }

    // This goes through and compares all the instances of creature in an array and sorts them, also had to watch a youtube video to understand it
    @Override
    public int compareTo(Creature otherCreature) {
        return this.creatureName.compareTo(otherCreature.creatureName);
    }
}

// Bug class as subclass of Creature
class Bug extends Creature {
    // This holds the bug data
    String bugType;

    Bug(String name, String type) {
        // This calls the main class of Bug, aka Creature
        super(name);
        // This makes the data able to be used by other programs
        this.bugType = type;
    }

    void printBugType() {
        // This small part of code prints the data info in the terminal to show it is working
        System.out.println("Bug Type: " + bugType);
    }
}

// Animal class as subclass of Creature
class Animal extends Creature {
    // This holds the animal data
    String[] animalTraits;

    Animal(String name, String[] traits) {
        // This calls the main class of Animal, aka Creature
        super(name);
        // This makes the data able to be used by other programs
        this.animalTraits = traits;
    }

    void printAnimalTraits() {
        // This small part of code prints the data info in the terminal to show it is working
        System.out.print("Animal Traits: ");
        // Uses a for loop to print each part of the array
        for (String trait : animalTraits) {
            System.out.print(trait + " ");
        }
        System.out.println();
    }
}

// Main class
public class Main {
    public static void main(String[] args) {
        // This makes a new array list of instances of creatures
        ArrayList<Creature> creatures = new ArrayList<>();
        creatures.add(new Creature("Zebra"));
        creatures.add(new Creature("Lion"));
        creatures.add(new Creature("Elephant"));
        creatures.add(new Creature("Giraffe"));
        creatures.add(new Creature("Monkey"));
        creatures.add(new Creature("Kangaroo"));
        creatures.add(new Creature("Bear"));
        creatures.add(new Creature("Rabbit"));
        creatures.add(new Creature("Deer"));
        creatures.add(new Creature("Tiger"));

        // This prints the what the data looked like before sorting
        System.out.println("Before sorting:");
        for (Creature creature : creatures) {
            creature.printCreatureName();
        }
        
        // This is what really sorts the data
        Collections.sort(creatures);

        // This prints the what the data looked like after sorting
        System.out.println("\nAfter sorting:");
        for (Creature creature : creatures) {
            creature.printCreatureName();
        }
    }
}
