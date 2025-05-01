package com.ing.zoo.animals;

import com.ing.zoo.interfaces.Carnivore;
import com.ing.zoo.interfaces.Tricks;

/**
 * Tigers are carnivores and can perform a variety of tricks.
 */
public class Tiger extends Animal implements Carnivore, Tricks {
    /**
     * Constructs a {@code Tiger} with the specified name.
     *
     * @param name The name of the tiger.
     */
    public Tiger(String name) {
        super(name);
    }

    /**
     * Makes the tiger say hello with a growling sound.
     */
    @Override
    public void sayHello() {
        System.out.println("rraaarww");
    }

    /**
     * Describes how the tiger eats meat.
     */
    @Override
    public void eatMeat() {
        System.out.println("nomnomnom oink wubalubadubdub");
    }

    /**
     * Returns a list of tricks the tiger can perform.
     *
     * @return An array of trick descriptions.
     */
    @Override
    public String[] getTricks() {
        return new String[]{
                "jumps in tree",
                "scratches ears"
        };
    }
}
