package com.yusuf.zoo.animals;

import com.yusuf.zoo.interfaces.Herbivore;
import com.yusuf.zoo.interfaces.Tricks;

public class Elephant extends Animal implements Herbivore, Tricks {
    public String name;

    public Elephant(String name) {
        super(name);
    }

    @Override
    public void sayHello() {
        System.out.println("Pawoo!");
    }


    @Override
    public void eatLeaves() {
        System.out.println("kghrab ghrap");
    }

    @Override
    public String[] getTricks() {
        return new String[]{
                "lies down on the ground",
                "spews water out of his slurf",
                "plays football with his slurf"
        };
    }
}
