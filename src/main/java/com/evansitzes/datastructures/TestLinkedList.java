package com.evansitzes.datastructures;

public class TestLinkedList {

    public static void main(final String[] args) {
        final SinglyLinkedList singlyLinkedList = new SinglyLinkedList();

        singlyLinkedList.insertFirst(4);
        singlyLinkedList.insertFirst(-15);
        singlyLinkedList.insertFirst(12);
        singlyLinkedList.removeFirst();

        singlyLinkedList.print();

        final DoublyLinkedList doublyLinkedList = new DoublyLinkedList();

        doublyLinkedList.insertFirst(3);
        doublyLinkedList.insertFirst(4);
        doublyLinkedList.insertFirst(6);
        doublyLinkedList.insertFirst(7);
        doublyLinkedList.insertFirst(7);
        doublyLinkedList.removeFirst();

        doublyLinkedList.insertLast(2);
        doublyLinkedList.insertLast(1);
        doublyLinkedList.insertLast(1);
        doublyLinkedList.removeLast();

        doublyLinkedList.addAfterValue(6, 5);
        doublyLinkedList.addAfterValue(4, 3);
        doublyLinkedList.removeAtValue(3);

        doublyLinkedList.print();
    }

}

