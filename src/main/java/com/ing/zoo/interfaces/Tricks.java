package com.ing.zoo.interfaces;

import java.util.Random;

/**
 * The {@code Tricks} interface should be implemented by animals that can perform tricks.
 * It provides a default method for selecting and performing a random trick.
 */
public interface Tricks {
    /**
     * Performs a random trick from the list provided by {@link #getTricks()}.
     * This method is defined as a default implementation, so individual classes only need to
     * give their own trick list by implementing {@code getTricks()}.
     */
    default void performTrick() {
        String[] tricks = getTricks();

        Random random = new Random();
        int randomTrick = random.nextInt(tricks.length);
        System.out.println(tricks[randomTrick]);
    }

    /**
     * Returns an array of tricks that the animal can perform.
     *
     * @return An array of trick descriptions.
     */
    String[] getTricks();
}
