package com.evansitzes.helpers;

import java.util.Random;

/**
 * Created by evan on 1/10/17.
 */
public class RandomArrayGenerator {

    public static int[] generateArray(final int arraySize, final int maxValue) {
        final int[] array = new int[arraySize];
        final Random rand = new Random();

        for (int i = 0; i < arraySize; i++) {
            array[i] = rand.nextInt(maxValue) + 1;
        }

        return array;
    }
}
