package com.dsa.sprint_boot_dsa.linked_list.doubly_linked_list;

public class Main {
    public static void main(String[] args) {
        DoublyLinkedList dll = new DoublyLinkedList();
        // Inserting nodes into the list
        dll.insertAtFront(10);
        dll.insertAtFront(20);
        dll.insertAtEnd(30);
        dll.insertAtEnd(40);

        // Display the list
        dll.displayForward(); // List (head to tail): 20 10 30 40
        dll.displayBackward(); // List (tail to head): 40 30 10 20

        // Deleting a node
        dll.deleteNode(10);
        dll.deleteNode(10);
        dll.displayForward(); // List (head to tail): 20 30 40
    }
}
