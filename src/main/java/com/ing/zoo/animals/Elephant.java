package com.ing.zoo.animals;

import com.ing.zoo.interfaces.Herbivore;
import com.ing.zoo.interfaces.Tricks;

/**
 * Elephants are herbivores and can perform tricks.
 */
public class Elephant extends Animal implements Herbivore, Tricks {
    /**
     * Creates a new {@code Elephant} with the given name.
     *
     * @param name The name of the elephant.
     */
    public Elephant(String name) {
        super(name);
    }

    /**
     * Makes the elephant say hello with its characteristic sound.
     */
    @Override
    public void sayHello() {
        System.out.println("Pawoo!");
    }

    /**
     * Describes how the elephant eats leaves.
     */
    @Override
    public void eatLeaves() {
        System.out.println("kghrab ghrap");
    }

    /**
     * Returns a list of tricks that the elephant can perform.
     *
     * @return An array of trick descriptions.
     */
    @Override
    public String[] getTricks() {
        return new String[]{
                "lies down on the ground",
                "spews water out of his trunk",
                "plays football with his trunk"
        };
    }
}
