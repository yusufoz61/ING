package com.yusuf.zoo.animals;

import com.yusuf.zoo.interfaces.Carnivore;
import com.yusuf.zoo.interfaces.Herbivore;
import com.yusuf.zoo.interfaces.Tricks;

public class Monkey extends Animal implements Herbivore, Carnivore, Tricks {
    public String name;

    public Monkey(String name) {
        super(name);
    }

    /**
     *
     */
    @Override
    public void sayHello() {
        System.out.println("oo OOAAA OO AA");
    }

    /**
     *
     */
    @Override
    public void eatMeat() {
        System.out.print("hem ghem");
    }

    /**
     *
     */
    @Override
    public void eatLeaves() {
        System.out.print("shlaem shlem");
    }

    /**
     * @return
     */
    @Override
    public String[] getTricks() {
        return new String[]{
                "Jumps on shoulder",
                "Hangs from your arm"
        };
    }
}
