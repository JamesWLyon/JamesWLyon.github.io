public class Main {
    public static void main (String[] args) {
        // The people who own the cars, this creates instances of the people
        People person1 = new People();
        People person2 = new People();
            // This changes person 1 data
            person1.name = "Charlie";
            person1.age -= 20;
            person1.height = "6'3" + '"';
            person1.weight += 86;
            // This changes person 1 data
            person2.name = "Richard";
            person2.age += 30;
            person2.height = "5'10" + '"';
            person2.weight += 45;

        // The cars the people own, this creates instances of the cars
        Cars car1 = new Cars();
        Cars car2 = new Cars();
        Cars car3 = new Cars();
            // This changes car 1 data
            car1.brand = "W Motors";
            car1.year = 2014;
            car1.horsePower -= 250;
            car1.owner = person2.name;
            car1.cost = 3690000;
            // This changes car 2 data
            car2.brand = "Lamborghini";
            car2.year = 2024;
            car2.owner = person1.name;
            car2.cost = 604000;
            // This changes car 3 data
            car3.brand = "Rolls-Royces";
            car3.horsePower -= 437;
            car3.owner = person2.name;
            car3.cost = 493000;

        // This prints the some of the info into the terminal
        System.out.println("");
        System.out.println(person1.name + " is " + person1.age + ", is " + person1.height + ", and weights " + person1.weight + ". " + person1.name + " also owns a " + car2.brand + " that cost $" + car2.cost + " and has " + car2.horsePower + "hp.");
        System.out.println(person2.name + " is " + person2.age + ", is " + person2.height + ", and weights " + person2.weight + ". " + person2.name + " also owns a " + car3.brand + " that cost $" + car3.cost + " and has " + car3.horsePower + "hp.");
        System.out.println("");
    }
}
