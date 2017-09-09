package com.evansitzes.datastructures;

/*
Data structure using an internal array and a pointer to the 'top' index in the array to create a LIFO stack.
 */

public class Stack {
    private int maxSize;
    private int top; // pointer to the top index in the array
    private int[] array;

    public Stack(final int size) {
        maxSize = size;
        array = new int[size];
        top = -1;
    }

    public void push(final int value) {
        if (isFull()) {
            System.out.println("Cannot push " + value + " because stack is full.");
            return;
        }
        top++;
        array[top] = value;
    }

    public int pop() {
        if (isEmpty()) {
            System.out.println("Cannot pop because stack is empty.");
            return Integer.MIN_VALUE;
        }

        return array[top--];
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("Cannot peek because stack is empty.");
            return Integer.MIN_VALUE;
        }

        return array[top];
    }

    public boolean isEmpty() {
        return top < 0;
    }

    public boolean isFull() {
        return top >= maxSize - 1;
    }
}
