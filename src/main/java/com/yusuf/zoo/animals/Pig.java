package com.yusuf.zoo.animals;

import com.yusuf.zoo.interfaces.Carnivore;
import com.yusuf.zoo.interfaces.Herbivore;
import com.yusuf.zoo.interfaces.Tricks;

/**
 * Pigs are omnivores, meaning they can eat both meat and plants,
 * and they are capable of performing playful tricks.
 */
public class Pig extends Animal implements Carnivore, Herbivore, Tricks {
    /**
     * Constructs a {@code Pig} with the specified name.
     *
     * @param name The name of the pig.
     */
    public Pig(String name) {
        super(name);
    }

    /**
     * Makes the pig say hello with a splashy sound.
     */
    @Override
    public void sayHello() {
        System.out.println("splash");
    }

    /**
     * Describes how the pig eats leaves or plant-based food.
     */
    @Override
    public void eatLeaves() {
        System.out.println("munch munch oink");
    }

    /**
     * Describes how the pig eats meat.
     */
    @Override
    public void eatMeat() {
        System.out.println("nomnomnom oink thx");
    }

    /**
     * Returns a list of tricks the pig can perform.
     *
     * @return An array of trick descriptions.
     */
    @Override
    public String[] getTricks() {
        return new String[]{
                "rolls in the mud",
                "wiggles ears"
        };
    }
}
