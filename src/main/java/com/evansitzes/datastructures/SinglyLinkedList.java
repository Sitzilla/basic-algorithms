package com.evansitzes.datastructures;

/*
Data structure that stores data in Nodes. Each node contains a reference to the next node. Random lookup is O(n), prepending
is O(1).
 */

public class SinglyLinkedList {

    protected Node first;

    public void insertFirst(final int value) {
        final Node newNode = new Node();
        newNode.value = value;

        if (first == null) {
            first = newNode;
            return;
        }

        newNode.next = first;
        first = newNode;
    }

    public int removeFirst() {
        final Node oldFirst = first;
        first = first.next;

        return oldFirst.value;
    }

    public boolean isEmpty() {
        return first == null;
    }

    public void print() {
        if (isEmpty()) {
            System.out.println("Linked List is empty");
            return;
        }

        Node printNode = first;
        System.out.println("[ " + first.value + " ]");

        while (printNode.next != null) {
            printNode = printNode.next;
            System.out.println("[ " + printNode.value + " ]");
        }
    }
}
