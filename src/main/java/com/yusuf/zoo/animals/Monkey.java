package com.yusuf.zoo.animals;

import com.yusuf.zoo.interfaces.Carnivore;
import com.yusuf.zoo.interfaces.Herbivore;
import com.yusuf.zoo.interfaces.Tricks;

/**
 * Monkeys are omnivores — they can eat both meat and plants — and are capable of performing tricks.
 */
public class Monkey extends Animal implements Herbivore, Carnivore, Tricks {
    /**
     * Constructs a {@code Monkey} with the specified name.
     *
     * @param name The name of the monkey.
     */
    public Monkey(String name) {
        super(name);
    }

    /**
     * Makes the monkey say hello using typical monkey sounds.
     */
    @Override
    public void sayHello() {
        System.out.println("oo OOAAA OO AA");
    }

    /**
     * Describes how the monkey eats meat.
     */
    @Override
    public void eatMeat() {
        System.out.print("hem ghem");
    }

    /**
     * Describes how the monkey eats leaves or plants.
     */
    @Override
    public void eatLeaves() {
        System.out.print("shlaem shlem");
    }

    /**
     * Returns a list of tricks the monkey can perform.
     *
     * @return An array of trick descriptions.
     */
    @Override
    public String[] getTricks() {
        return new String[]{
                "Jumps on shoulder",
                "Hangs from your arm"
        };
    }
}
