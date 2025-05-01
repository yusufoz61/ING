package com.yusuf.zoo.animals;

import com.yusuf.zoo.interfaces.Carnivore;

/**
 * Lions are carnivores and greet with a roar.
 */
public class Lion extends Animal implements Carnivore {
    /**
     * Constructs a {@code Lion} with the specified name.
     *
     * @param name The name of the lion.
     */
    public Lion(String name) {
        super(name);
    }

    /**
     * Makes the lion say hello with a roar.
     */
    @Override
    public void sayHello() {
        System.out.println("roooaoaaaaar");
    }

    /**
     * Describes how the lion eats meat.
     */
    @Override
    public void eatMeat() {
        System.out.println("nomnomnom thx mate");
    }
}
