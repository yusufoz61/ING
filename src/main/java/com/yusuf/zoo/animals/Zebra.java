package com.yusuf.zoo.animals;

import com.yusuf.zoo.interfaces.Herbivore;

public class Zebra extends Animal implements Herbivore {
    public String name;


    public Zebra(String name)
    {
        super(name);
    }

    @Override
    public void sayHello()
    {
        System.out.println("zebra zebra");
    }

    @Override
    public void eatLeaves()
    {
        System.out.println("munch munch zank yee bra");
    }
}
