package com.evansitzes.datastructures;

public class TestStack {

    public static void main(final String[] args) {
        final Stack stack = new Stack(10);
        stack.push(3);
        stack.push(6);
        stack.push(2);
        stack.push(8);
        stack.push(10);

        System.out.println(stack.peek());
        System.out.println(stack.pop());
        System.out.println(stack.peek());

        stack.push(5);
        stack.push(1);
        stack.push(0);
        stack.push(-5);
        stack.push(9);

        stack.push(7);
        stack.push(21);

        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
        }

        System.out.println(stack.pop());
    }
}
