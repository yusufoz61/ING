package com.ing.zoo.animals;

import com.ing.zoo.interfaces.Herbivore;

/**
 * Hippos are herbivores and greet with a splash.
 */
public class Hippo extends Animal implements Herbivore {
    /**
     * Constructs a {@code Hippo} with the specified name.
     *
     * @param name The name of the hippo.
     */
    public Hippo(String name) {
        super(name);
    }

    /**
     * Makes the hippo say hello with a splash sound.
     */
    @Override
    public void sayHello() {
        System.out.println("splash");
    }

    /**
     * Describes how the hippo eats leaves.
     */
    @Override
    public void eatLeaves() {
        System.out.println("munch munch lovely");
    }
}
