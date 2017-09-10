package com.evansitzes.datastructures;

/*
Data structure that stores data in Nodes. Each node contains a reference to the next node. Random lookup/add/removal is O(n),
prepending/appending is O(1).
 */
public class DoublyLinkedList extends SinglyLinkedList {
    private Node last;

    @Override
    public void insertFirst(final int value) {
        final Node newNode = new Node();
        newNode.value = value;

        if (first == null) {
            first = newNode;
            last = newNode;
            return;
        }

        newNode.next = first;
        first.previous = newNode;
        first = newNode;
    }

    @Override
    public int removeFirst() {
        final Node oldFirst = first;
        first.next.previous = null;
        first = first.next;

        return oldFirst.value;
    }

    public void insertLast(final int value) {
        final Node newNode = new Node();
        newNode.value = value;

        if (first == null) {
            first = newNode;
            last = newNode;
            return;
        }

        newNode.previous = last;
        last.next = newNode;
        last = newNode;
    }

    public int removeLast() {
        final Node oldLast = last;
        last.previous.next = null;
        last = last.previous;

        return oldLast.value;
    }

    public boolean addAfterValue(final int target, final int value) {
        Node nodeToCheck = first;

        if (isEmpty()) {
            System.out.println("Linked List is empty");
            return false;
        }

        while (nodeToCheck != null) {

            // if the int value is found, insert a new node after that value and update next/previous references
            if (nodeToCheck.value == target) {
                final Node newNode = new Node();
                newNode.value = value;

                if (nodeToCheck.equals(last)) {
                    insertLast(value);
                    return true;
                }

                nodeToCheck.next.previous = newNode;
                newNode.next = nodeToCheck.next;
                newNode.previous = nodeToCheck;
                nodeToCheck.next = newNode;

                return true;
            }

            nodeToCheck = nodeToCheck.next;
        }

        System.out.println("Value not found.");
        return false;
    }

    public int removeAtValue(final int value) {
        Node nodeToCheck = first;

        if (isEmpty()) {
            System.out.println("Linked List is empty");
            return Integer.MIN_VALUE;
        }

        while (nodeToCheck != null) {

            // if the int value is found, remove that node and update next/previous references
            if (nodeToCheck.value == value) {

                if (nodeToCheck.equals(first)) {
                    removeFirst();

                    return nodeToCheck.value;
                }

                if (nodeToCheck.equals(last)) {
                    removeLast();

                    return nodeToCheck.value;
                }

                nodeToCheck.previous.next = nodeToCheck.next;
                nodeToCheck.next.previous = nodeToCheck.previous;
                return nodeToCheck.value;
            }

            nodeToCheck = nodeToCheck.next;
        }

        System.out.println("Value not found.");
        return Integer.MIN_VALUE;
    }

}
