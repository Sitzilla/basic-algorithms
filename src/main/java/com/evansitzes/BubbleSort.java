package com.evansitzes;

/**
 Iterates through the array n times, constantly swapping the lower and higher of two numbers.  The highest numbers
 'bubble' to the top.  Must maintain index of the last-sorted highest number.
 Best case: O(n)
 Worst case: O(n^2)
 */
public class BubbleSort {

        public static int[] sort(final int[] array) {

        for (int i = (array.length - 1); i >= 0; i--) {
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
