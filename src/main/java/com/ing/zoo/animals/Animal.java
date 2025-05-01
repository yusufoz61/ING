package com.ing.zoo.animals;

/**
 * Abstract base class for all animals in the zoo.
 * Contains common properties such as the animal's name,
 * and requires each animal to implement a greeting method.
 */
public abstract class Animal {

    // The name of the animal.
    protected String name;

    /**
     * Constructs an animal with the specified name.
     *
     * @param name The name of the animal.
     */
    public Animal(String name) {
        this.name = name;
    }

    /**
     * Returns the name of the animal.
     *
     * @return The animal's name.
     */
    public String getName() {
        return name;
    }

    /**
     * Makes the animal say hello.
     * Must be implemented by each specific animal class.
     */
    public abstract void sayHello();
}
