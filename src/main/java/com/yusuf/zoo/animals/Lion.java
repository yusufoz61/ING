package com.yusuf.zoo.animals;

import com.yusuf.zoo.interfaces.Carnivore;

public class Lion extends Animal implements Carnivore {
    public String name;


    public Lion(String name)
    {
        super(name);
    }

    @Override
    public void sayHello()
    {
        System.out.println("roooaoaaaaar");
    }
    @Override
    public void eatMeat()
    {
        System.out.println("nomnomnom thx mate");
    }
}
