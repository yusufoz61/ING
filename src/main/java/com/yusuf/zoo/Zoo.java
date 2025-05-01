package com.yusuf.zoo;

import com.yusuf.zoo.animals.*;
import com.yusuf.zoo.interfaces.Carnivore;
import com.yusuf.zoo.interfaces.Herbivore;
import com.yusuf.zoo.interfaces.Tricks;

import java.util.Scanner;

/**
 * The {@code Zoo} class serves as the entry point of the application.
 * It creates animal instances, defines available commands, and handles user input
 * to interact with animals through the console.
 */
public class Zoo {
    /**
     * Main method that runs the Zoo application.
     * It allows the user to:
     * <ul>
     *     <li>Make all or a specific animal say hello</li>
     *     <li>Feed all herbivores leaves</li>
     *     <li>Feed all carnivores meat</li>
     *     <li>Make all trick-performing animals perform a trick</li>
     * </ul>
     *
     * @param args Command-line arguments (not used)
     */
    public static void main(String[] args) {

        // Create animal instances
        Lion henk = new Lion("henk");
        Hippo elsa = new Hippo("elsa");
        Pig dora = new Pig("dora");
        Tiger wally = new Tiger("wally");
        Zebra marty = new Zebra("marty");
        Monkey chimp = new Monkey("chimp");
        Elephant harrison = new Elephant("harrison");

        // Store all animals in an array for easy looping
        Animal[] animals = {
                henk,
                elsa,
                dora,
                wally,
                marty,
                chimp,
                harrison
        };

        // Define available commands
        String[] commands = new String[5];
        commands[0] = "hello";
        commands[1] = "give leaves";
        commands[2] = "give meat";
        commands[3] = "perform trick";
        commands[4] = "exit";

        // Display commands once
        System.out.println("Available commands:");
        for (String com : commands) {
            System.out.println(" - " + com);
        }

        Scanner scanner = new Scanner(System.in);
        String input;

        // Main interaction loop
        while (true) {
            System.out.print("\nEnter your command: ");
            input = scanner.nextLine().trim();
            String[] words = input.split(" ");

            // Exit condition
            if (input.equalsIgnoreCase("exit")) {
                System.out.println("Exiting the zoo... Goodbye!");
                break;
            }

            // hello (all)
            if (input.equalsIgnoreCase("hello")) {
                for (Animal animal : animals) {
                    System.out.print(animal.getName() + ": ");
                    animal.sayHello();
                }

                // hello [name]
            } else if (words.length >= 2 && words[0].equalsIgnoreCase("hello")) {
                String name = words[1];
                boolean found = false;
                for (Animal animal : animals) {
                    if (animal.getName().equalsIgnoreCase(name)) {
                        System.out.print(animal.getName() + ": ");
                        animal.sayHello();
                        found = true;
                    }
                }
                if (!found) {
                    System.out.println("No animal found with the name: " + name);
                }

                // give leaves
            } else if (input.equalsIgnoreCase("give leaves")) {
                for (Animal animal : animals) {
                    if (animal instanceof Herbivore) {
                        System.out.print(animal.getName() + ": ");
                        ((Herbivore) animal).eatLeaves();
                    }
                }

                // give meat
            } else if (input.equalsIgnoreCase("give meat")) {
                for (Animal animal : animals) {
                    if (animal instanceof Carnivore) {
                        System.out.print(animal.getName() + ": ");
                        ((Carnivore) animal).eatMeat();
                    }
                }

                // perform trick
            } else if (input.equalsIgnoreCase("perform trick")) {
                for (Animal animal : animals) {
                    if (animal instanceof Tricks) {
                        System.out.print(animal.getName() + ": ");
                        ((Tricks) animal).performTrick();
                    }
                }

                // Unknown command
            } else {
                System.out.println("Unknown command. Please try again.");
            }
        }
    }
}