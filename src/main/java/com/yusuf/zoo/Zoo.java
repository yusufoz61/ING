package com.yusuf.zoo;

import com.yusuf.zoo.animals.*;
import com.yusuf.zoo.interfaces.Carnivore;
import com.yusuf.zoo.interfaces.Herbivore;
import com.yusuf.zoo.interfaces.Tricks;

import java.util.Scanner;

public class Zoo {
    public static void main(String[] args)
    {

        Lion henk = new Lion("henk");
        Hippo elsa = new Hippo("elsa");
        Pig dora = new Pig("dora");
        Tiger wally = new Tiger("wally");
        Zebra marty = new Zebra("marty");
        Monkey chimp = new Monkey("chimp");
        Elephant harrison = new Elephant("harrison");

        Animal[] animals = {
                henk,
                elsa,
                dora,
                wally,
                marty,
                chimp,
                harrison
        };


        String[] commands = new String[4];
        commands[0] = "hello";
        commands[1] = "give leaves";
        commands[2] = "give meat";
        commands[3] = "perform trick";


        Scanner scanner = new Scanner(System.in);
        for(String com : commands){
            System.out.println(com);
        }
        System.out.print("Voer uw command in: ");
        String input = scanner.nextLine();

        String[] words = input.split(" ");

        if(input.equals(commands[0]))
        {
            for(Animal animal : animals){
                System.out.print(animal.getName() + ": ");
                animal.sayHello();
            }
        }else if(words.length >= 2 && input.equals(commands[0])){
            String name = words[1];
            for(Animal animal : animals){
                if(animal.getName().equals(name)){
                    System.out.print(animal.getName() + ": ");
                    animal.sayHello();
                }
            }

        }else if(input.equals(commands[1])){
            for(Animal animal : animals){
                if(animal instanceof Herbivore){
                    System.out.print(animal.getName() + ": ");
                    ((Herbivore) animal).eatLeaves();
                }
            }
        }else if(input.equals(commands[2])){
            for(Animal animal : animals){
                if(animal instanceof Carnivore){
                    System.out.print(animal.getName() + ": ");
                    ((Carnivore) animal).eatMeat();
                }
            }
        }else if(input.equals(commands[3])){
            for(Animal animal : animals){
                if(animal instanceof Tricks){
                    System.out.print(animal.getName() + ": ");
                    ((Tricks) animal).performTrick();
                }
            }
        }

    }
}
