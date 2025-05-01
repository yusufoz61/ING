package com.yusuf.zoo.animals;

import com.yusuf.zoo.interfaces.Herbivore;

public class Hippo extends Animal implements Herbivore {
    public String name;


    public Hippo(String name)
    {
        super(name);
    }
    @Override
    public void sayHello()
    {
        System.out.println("splash");
    }

    @Override
    public void eatLeaves()
    {
        System.out.println("munch munch lovely");
    }
}
