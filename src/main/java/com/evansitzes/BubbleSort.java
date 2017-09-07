package com.evansitzes;

import com.evansitzes.helpers.RandomArrayGenerator;
import com.evansitzes.helpers.TimekeeperHelper;

import java.util.Arrays;

/*
 Iterates through the array n times, constantly swapping the lower and higher of two numbers.  The highest numbers
 'bubble' to the top.  Must maintain index of the last-sorted highest number.
 Best case: O(n) (if an already sorted list)
 Worst case: O(n^2)
 */
public class BubbleSort {

    private static final int RANDOM_ARRAY_SIZE = 1000000;

    public static void main(final String[] args) {
        final int[] unsortedBubbleArray = RandomArrayGenerator.generateArray(RANDOM_ARRAY_SIZE);
        System.out.println("Sorting array with Bubble Sort: " + Arrays.toString(unsortedBubbleArray));
        final TimekeeperHelper timekeeper = new TimekeeperHelper();

        final int[] sortedBubbleArray = sort(unsortedBubbleArray);
        timekeeper.endTimekeeping();

        System.out.println("Sorted array: " + Arrays.toString(sortedBubbleArray));
    }

    public static int[] sort(final int[] array) {
        for (int i = array.length - 1; i >= 0; i--) {
            for (int j = 0; j < i; j++) {

                if (array[j] > array[j + 1]) {
                    final int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }

        return array;
    }

}
