package com.evansitzes;

/**
 * Find the smallest item in the array and make it the first item in the array.  Repeat through every index in the array.
 * This will always take the same amount of time since it has to iterate through the entire array for every index in the array.
 * Best/Worst case: O(n^2)
 */
public class SelectionSort {

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
//            System.out.println("Smallest unsorted value " + array[i] + " switching into index " + i);
        }

        return array;
    }
}
