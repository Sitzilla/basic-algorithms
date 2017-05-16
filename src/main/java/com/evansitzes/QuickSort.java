package com.evansitzes;

/**
 * Divide and conquer algorithm that sorts an array by partitioning recursion.
 * Note: while quicksort has the same average big-O runtime as mergesort, in practice it tends to outperform mergesort.
 * Best case: O(nlogn)
 * Average case: O(nlogn)
 * Worst case: O(n^2)
 */
public class QuickSort {

    private int[] array;

    public int[] sort(final int[] array) {
        this.array = array;
        final int low = 0;
        final int high = array.length - 1;

        quickSort(low, high);
        return array;
    }

    public void quickSort(final int lowIndex, final int highIndex) {
        int i = lowIndex;
        int j = highIndex;

        // Using the median point as the pivot
        final int pivot = array[(highIndex + lowIndex) / 2];

        // Check until lower index passes upper index
        while (i <= j) {

            while (array[i] < pivot) {
                i++;
            }

            while (pivot < array[j]) {
                j--;
            }

            // Exchange if value at the left index is larger than pivot and value at the right index is smaller than pivot
            if (i <= j) {
                exchangeNumbers(i, j);
                i++;
                j--;
            }
        }

        // Sort left list
        if (lowIndex < j) {
            quickSort(lowIndex, j);
        }

        // Sort right list
        if (i < highIndex) {
            quickSort(i, highIndex);
        }

    }

    private final void exchangeNumbers(final int i, final int j) {
        final int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
