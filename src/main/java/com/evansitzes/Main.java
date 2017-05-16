package com.evansitzes;

import java.util.Arrays;

public class Main {

    private static final int RANDOM_ARRAY_SIZE = 10;

    public static void main(final String[] args) {

//        // Bubble Sort
//        final int[] unsortedBubbleArray = RandomArrayGenerator.generateArray(RANDOM_ARRAY_SIZE);
////        System.out.println("Sorting array with Bubble Sort: " + Arrays.toString(unsortedBubbleArray));
//        long startTime = System.currentTimeMillis();
//        final int[] sortedBubbleArray = BubbleSort.sort(unsortedBubbleArray);
//        long endTime = System.currentTimeMillis();
//        long totalTime = endTime - startTime;
////        System.out.println("Sorted array: " + Arrays.toString(sortedBubbleArray));
//        System.out.println("Total time taken for Bubble sort: " + totalTime + ", for array of size: " + RANDOM_ARRAY_SIZE);
//
//        // Selection Sort
//        final int[] unsortedSelectionArray = RandomArrayGenerator.generateArray(RANDOM_ARRAY_SIZE);
////        System.out.println("Sorting array with Selection Sort: " + Arrays.toString(unsortedSelectionArray));
//        startTime = System.currentTimeMillis();
//        final int[] sortedSelectionArray = SelectionSort.sort(unsortedSelectionArray);
//        endTime = System.currentTimeMillis();
//        totalTime = endTime - startTime;
////        System.out.println("Sorted array: " + Arrays.toString(sortedSelectionArray));
//        System.out.println("Total time taken for Selection sort: " + totalTime + ", for array of size: " + RANDOM_ARRAY_SIZE);

        // Quicksort
        final int[] unsorted = RandomArrayGenerator.generateArray(RANDOM_ARRAY_SIZE);
        final long startTime = System.currentTimeMillis();
        final int[] sortedArray = new QuickSort().sort(unsorted);
        final long endTime = System.currentTimeMillis();
        final long totalTime = endTime - startTime;
        System.out.println("Sorted array: " + Arrays.toString(sortedArray));
        System.out.println("Total time taken for Bubble sort: " + totalTime + ", for array of size: " + RANDOM_ARRAY_SIZE);
    }
}
