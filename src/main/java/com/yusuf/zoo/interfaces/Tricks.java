package com.yusuf.zoo.interfaces;

import java.util.Random;

public interface Tricks {

    default void performTrick(){
        String[] tricks = getTricks();

        Random random = new Random();
        int randomTrick = random.nextInt(tricks.length);
        System.out.println(tricks[randomTrick]);

    };
    String[] getTricks();
}
