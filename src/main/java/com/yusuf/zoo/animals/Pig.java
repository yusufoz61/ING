package com.yusuf.zoo.animals;

import com.yusuf.zoo.interfaces.Carnivore;
import com.yusuf.zoo.interfaces.Herbivore;
import com.yusuf.zoo.interfaces.Tricks;

import java.util.Random;

public class Pig extends Animal implements Carnivore, Herbivore, Tricks {
    public String name;


    public Pig(String name)
    {
        super(name);
    }

    public void sayHello()
    {
        System.out.println("splash");
    }

    @Override
    public void eatLeaves()
    {
        System.out.println("munch munch oink");
    }

    @Override
    public void eatMeat()
    {
        System.out.println("nomnomnom oink thx");
    }

    @Override
    public String[] getTricks(){
        return new String[] {
                "rolls in the mud",
                "wiggles ears"
        };
    }
}
