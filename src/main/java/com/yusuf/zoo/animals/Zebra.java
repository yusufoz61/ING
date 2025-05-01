package com.yusuf.zoo.animals;

import com.yusuf.zoo.interfaces.Herbivore;

public class Zebra extends Animal implements Herbivore {
    public String name;


    public Zebra(String name)
    {
        super(name);
    }

    public void sayHello()
    {
        System.out.println("zebra zebra");
    }

    public void eatLeaves()
    {
        System.out.println("munch munch zank yee bra");
    }
}
