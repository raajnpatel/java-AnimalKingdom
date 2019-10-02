package animalKingdom;

import java.util.*;

public class Main {


    public static void printAnimals(ArrayList <Animals> animals, Checker tester) {
        for (Animals a : animals) {
            if (tester.test(a)) {
                System.out.println(a.getName());
            }
        }
    }

    public static void main(String[] args){

        ArrayList<Animals> kingdom = new ArrayList<Animals>();

        //add mammals to the kingdom ArrayList
        kingdom.add(new Mammals("Panda", 1869));
        kingdom.add(new Mammals("Zebra", 1778));
        kingdom.add(new Mammals("Koala", 1816));
        kingdom.add(new Mammals("Sloth", 1804));
        kingdom.add(new Mammals("Armadillo", 1758));
        kingdom.add(new Mammals("Raccoon", 1758));
        kingdom.add(new Mammals("Bigfoot", 2021));

        //add Birds
        kingdom.add(new Birds("Pigeon", 1837));
        kingdom.add(new Birds("Peacock", 1821));
        kingdom.add(new Birds("Toucan", 1758));
        kingdom.add(new Birds("Parrot", 1824));
        kingdom.add(new Birds("Swan", 1758));

        //add Fish
        kingdom.add(new Fish("Salmon", 1758));
        kingdom.add(new Fish("Catfish", 1817));
        kingdom.add(new Fish("Perch", 1758));


        //this sets up the console for the print.
        System.out.println("All the aminals by most recent year discovered: ");
        //sorts by year, top to bottom.
        kingdom.sort((animal1, animal2) -> animal2.getYearDiscovered() - animal1.getYearDiscovered());
        //prints a line for each animal in the sorted list
        kingdom.forEach(animal -> System.out.println("name: "+animal.getName()+" year discovered: "+animal.getYearDiscovered()));
        System.out.println();//makes a new line
        System.out.println();

        //sortin' em by the ABCs
        System.out.println("All the aminals by name, sorted alphabetically: ");
        kingdom.sort((animal1, animal2) -> animal1.getName().compareToIgnoreCase(animal2.getName()));
        kingdom.forEach(animal -> System.out.println("name: "+animal.getName()));
        System.out.println();
        System.out.println();

        //Sortin by movement
        System.out.println("All animals sorted by how they move: ");
        kingdom.sort((animal1, animal2) -> animal1.moves().compareToIgnoreCase(animal2.moves()));
        kingdom.forEach(animal -> System.out.println(animal.getName()+" will "+animal.moves()+" to move."));
        System.out.println();
        System.out.println();

        //print by breathing with lungs
        System.out.println("All animals that breathe with lungs: ");
        printAnimals(kingdom, animal -> animal.breathes().equals("lungs"));
        System.out.println();
        System.out.println();

        //print by lungs breathers discovered in 1758
        System.out.println("All animals that breathe with lungs discovered in 1758: ");
        printAnimals(kingdom, animal -> (animal.breathes().equals("lungs")) && (animal.getYearDiscovered()==1758));
        System.out.println();
        System.out.println();

        //print by lung breathing-egg layers
        System.out.println("All animals that breathe with lungs and poop out eggs: ");
        printAnimals(kingdom, animal -> (animal.breathes().equals("lungs")) && (animal.reproduces().equals("eggs")));
        System.out.println();
        System.out.println();

        //prints animals discovered in 1758 alphabetically
        System.out.println("All animals discovered in 1758, aphabetically: ");
        kingdom.sort((animal1, animal2) -> animal1.getName().compareToIgnoreCase(animal2.getName()));
        printAnimals(kingdom, animal -> animal.getYearDiscovered()==1758);
        System.out.println();
        System.out.println();

        //stretch! -sorts alphabetically, then prints out animals that are mammals.-
        kingdom.sort((animal1, animal2) -> animal1.getName().compareToIgnoreCase(animal2.getName()));
        for (Animals animal : kingdom) {
            if (animal instanceof Mammals) {
                System.out.println("Mammalian detected, name: "+ animal.getName());
            }
        }
    }
}