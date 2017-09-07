package com.evansitzes.algorithms.sort;

import com.evansitzes.helpers.RandomArrayGenerator;
import com.evansitzes.helpers.TimekeeperHelper;

import java.util.Arrays;

/**
 * Find the smallest item in the array and make it the first item in the array.  Repeat through every index in the array.
 * This will always take the same amount of time since it has to iterate through the entire array for every index in the array.
 * Much faster than bubble sort in practice because there is no physical swapping of values until the end of a pass. (Unless
 * the list is already sorted)
 * Best/Worst case: O(n^2)
 */
public class SelectionSort {

    private static final int RANDOM_ARRAY_SIZE = 1000000;

    public static void main(final String[] args) {
        final int[] unsortedSelectionArray = RandomArrayGenerator.generateArray(RANDOM_ARRAY_SIZE);
        System.out.println("Sorting array with Selection Sort: " + Arrays.toString(unsortedSelectionArray));
        final TimekeeperHelper timekeeper = new TimekeeperHelper();

        final int[] sortedSelectionArray = sort(unsortedSelectionArray);
        timekeeper.endTimekeeping();

        System.out.println("Sorted array: " + Arrays.toString(sortedSelectionArray));
    }


    public static int[] sort(final int[] array) {

        for (int i = 0; i < array.length; i++) {
            int min = i;

            // find the index of the smallest unsorted item
            for (int j = i; j < array.length; j++) {
                if (array[j] < array[min]) {
                    min = j;
                }
            }

            // swap new min with lowest unsorted index
            final int tmp = array[i];
            array[i] = array[min];
            array[min] = tmp;
        }

        return array;
    }
}
