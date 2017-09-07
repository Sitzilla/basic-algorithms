package com.evansitzes.algorithms.sort;

import com.evansitzes.helpers.RandomArrayGenerator;
import com.evansitzes.helpers.TimekeeperHelper;

import java.util.Arrays;

/*
Sorting algorithm that always maintains a 'sorted part of the array' to the left and an 'unsorted part of the array' to
the right. Once at a time it inserts the leftmost value in the unsorted part of the array into the proper place in the
sorted array, decreasing the unsorted array length by 1 and increasing the sorted array length by 1.
Best case: O(n) (if an already sorted list)
Worst case: O(n^2)
 */
public class InsertionSort {

    private static final int RANDOM_ARRAY_SIZE = 10;

    public static void main(final String[] args) {
        final int[] unsortedInsertionArray = RandomArrayGenerator.generateArray(RANDOM_ARRAY_SIZE);
        System.out.println("Sorting array with Insertion Sort: " + Arrays.toString(unsortedInsertionArray));
        final TimekeeperHelper timekeeper = new TimekeeperHelper();

        final int[] sortedInsertionArray = sort(unsortedInsertionArray);
        timekeeper.endTimekeeping();

        System.out.println("Sorted array: " + Arrays.toString(sortedInsertionArray));
    }

    public static int[] sort(final int[] array) {

        // Start at index 1 because index 0 is a 'sorted array of size 1'
        for (int i = 1; i < array.length; i++) {

            final int newInsert = array[i]; // data to insert into the sorted array to the left
            int j = i - 1; // index of the max value in the sorted array to the left

            // While not to the end of the array and while value at index j is larger than the value to insert continue
            // to transition it towards the top of the array
            while (j >= 0 && array[j] >= newInsert) {
                array[j + 1] = array[j];
                j--;
            }

            array[j + 1] = newInsert; // once we find the index of a value smaller than the value to insert, insert here!
        }

        return array;
    }
}
