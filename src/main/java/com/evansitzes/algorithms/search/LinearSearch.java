package com.evansitzes.algorithms.search;

import com.evansitzes.helpers.RandomArrayGenerator;
import com.evansitzes.helpers.TimekeeperHelper;

/*
Most basic searching algorithm. Searches linearly through an integer array until it finds the target number.  Assumes
uniqueness of values. Return index of target, and -1 if not found. Linear time complexity O(n).
 */
public class LinearSearch {

    private static final int RANDOM_ARRAY_SIZE = 10000;
    private static final int MAX_VALUE = 500;
    private static final int TARGET = 42;

    public static void main(final String[] args) {
        final int[] unsortedBasicArray = RandomArrayGenerator.generateArray(RANDOM_ARRAY_SIZE, MAX_VALUE);
        final TimekeeperHelper timekeeper = new TimekeeperHelper();

//        System.out.println("Searching Basic Array: " + Arrays.toString(unsortedBasicArray));
        System.out.println("Target found at index: " + search(unsortedBasicArray, TARGET));
        timekeeper.endTimekeeping();
    }

    public static int search(final int[] array, final int target) {

        for (int i = 0; i < array.length; i++) {
            if (array[i] == target) {
                return i;
            }
        }

        return -1;
    }
}
