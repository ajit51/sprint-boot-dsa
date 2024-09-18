package com.dsa.sprint_boot_dsa.linked_list.singly_linked_list;

public class Main {
    public static void main(String[] args) {
        SinglyLinkedList list = new SinglyLinkedList();

        list.insertNodeAtFirst(20);
        list.insertNodeAtFirst(80);
        list.insertNodeAtFirst(10);
        list.printList();
        int result = list.searchElement(10);
        int key = 20;
        if (result != -1) {
            System.out.println("Element " + key + " fount at result " + result);
        } else {
            System.out.println("Element " + key + " not fount at result");
        }
    }
}
