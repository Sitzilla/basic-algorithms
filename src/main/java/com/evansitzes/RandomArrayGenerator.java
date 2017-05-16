package com.evansitzes;

import java.util.Random;

/**
 * Created by evan on 1/10/17.
 */
public class RandomArrayGenerator {

    private static final int MAX_INT_SIZE = 99;

    public static int[] generateArray(final int arraySize) {
        final int[] array = new int[arraySize];
        final Random rand = new Random();

        for (int i = 0; i < arraySize; i++) {
            array[i] = rand.nextInt(MAX_INT_SIZE) + 1;
        }

        return array;
    }

}
