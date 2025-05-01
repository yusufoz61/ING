package com.ing.zoo.animals;

import com.ing.zoo.interfaces.Herbivore;

/**
 * Zebras are herbivores and have their own way of greeting and eating.
 */
public class Zebra extends Animal implements Herbivore {
    /**
     * Constructs a {@code Zebra} with the specified name.
     *
     * @param name The name of the zebra.
     */
    public Zebra(String name) {
        super(name);
    }

    /**
     * Makes the zebra say hello with its own unique sound.
     */
    @Override
    public void sayHello() {
        System.out.println("zebra zebra");
    }

    /**
     * Describes how the zebra eats leaves.
     */
    @Override
    public void eatLeaves() {
        System.out.println("munch munch zank yee bra");
    }
}
