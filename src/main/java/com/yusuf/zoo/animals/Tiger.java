package com.yusuf.zoo.animals;

import com.yusuf.zoo.interfaces.Carnivore;
import com.yusuf.zoo.interfaces.Tricks;

import java.util.Random;

public class Tiger extends Animal implements Carnivore, Tricks {
    public String name;


    public Tiger(String name){
        super(name);
    }

    public void sayHello()
    {
        System.out.println("rraaarww");
    }

    public void eatMeat()
    {
        System.out.println("nomnomnom oink wubalubadubdub");
    }

   public String[] getTricks(){
       return new String[]{
               "jumps in tree", "scratches ears"
       };
   }


}
