package com.dsa.sprint_boot_dsa.linked_list.singly_linked_list;

public class Main {
    public static void main(String[] args) {
        SinglyLinkedList list = new SinglyLinkedList();

        list.insertNodeAtFirst(20);
        list.insertNodeAtFirst(80);
        list.insertNodeAtFirst(10);
        list.printList();
        list.deleteNodeAtPosition(1);
        list.printList();
    }
}
