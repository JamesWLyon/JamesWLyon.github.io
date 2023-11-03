/**
 
    Hello this is my Week 9 Inheritance and Overloading assignment,

    It took me longer to make this than I wanted. There was alot of reworking the code, tons of deleting stuff,
    and adding new stuff. I made it so this has one main class "Creature" and this class has two sub classes,
    "Bug" and "Animal". Bug just has one thing to define it and Animal is defined by an array of data. I also
    got lost on a long bunny trail of coding in W3Schools this week and discovered what extends is as well as
    the fact that I can include a funtion in a class and still call it from somewhere from outside of the class.

    Made by: James Lyon
 
 **/

// Creature class
class Creature {\
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
        // This creates an instance of creature
        Creature creatureObject = new Creature("Generic Creature");
        creatureObject.printCreatureName();

        // This adds onto the main instance of creature and adds data about a bug
        Bug bugObject = new Bug("Ladybug", "Beetle");
        bugObject.printCreatureName();
        bugObject.printBugType();

        // This adds onto the main instance of creature and adds data about a animal
        String[] animalTraits = {"Carnivorous", "Fast runner", "Wild"};
        Animal animalObject = new Animal("Tiger", animalTraits);
        animalObject.printCreatureName();
        animalObject.printAnimalTraits();
    }
}
