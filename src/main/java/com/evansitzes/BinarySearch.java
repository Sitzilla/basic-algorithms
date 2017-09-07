package com.evansitzes;

import com.evansitzes.helpers.RandomArrayGenerator;
import com.evansitzes.helpers.TimekeeperHelper;

import java.util.Arrays;

/*
Divide-and-conquer technique on a sorted array to find a value in log(n) time.  Returns the index of the target, and -1
if not present in the array.  Keeps track of a lower and an upper index to search the array. Efficient search algorithm
with a time complexity of log(n).
 */
public class BinarySearch {

    private static final int RANDOM_ARRAY_SIZE = 40;
    private static final int MAX_VALUE = 15;
    private static final int TARGET = 13;

    public static void main(final String[] args) {
        final int[] sortedArray = SelectionSort.sort(RandomArrayGenerator.generateArray(RANDOM_ARRAY_SIZE, MAX_VALUE));
        System.out.println("Searching sorted array: " + Arrays.toString(sortedArray));
        final TimekeeperHelper timekeeper = new TimekeeperHelper();

        System.out.println("Target found at index: " + search(sortedArray, TARGET));
        timekeeper.endTimekeeping();
    }

    public static int search(final int[] array, final int target) {
        int p = 0; // lower index
        int q = array.length / 2; // midpoint
        int r = array.length - 1; // upper index

        while (p <= r) {

            // target is the midpoint
            if (array[q] == target) {
                return q;
            }

            if (target < array[q]) {
                // set the upper index to the left of the midpoint
                r = q - 1;
            } else  {
                // set the lower index to the right of the midpoint
                p = q + 1;
            }

            q = (r + q) / 2;
        }

        return -1;
    }

}
