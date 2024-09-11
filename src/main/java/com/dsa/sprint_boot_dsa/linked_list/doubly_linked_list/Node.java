package com.dsa.sprint_boot_dsa.linked_list.doubly_linked_list;

public class Node {
    Node prev;
    int data;
    Node next;

    Node(int data) {
        this.prev = null;
        this.data = data;
        this.next = null;
    }
}
