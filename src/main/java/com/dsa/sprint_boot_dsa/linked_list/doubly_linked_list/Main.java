package com.dsa.sprint_boot_dsa.linked_list.doubly_linked_list;

public class Main {
    public static void main(String[] args) {
        DoublyLinkedList dll = new DoublyLinkedList();
        // Inserting nodes into the list
      /*  dll.insertAtFront(10);
        dll.insertAtFront(20);
        dll.insertAtEnd(30);
        dll.insertAtEnd(40);

        // Display the list
        dll.displayForward(); // List (head to tail): 20 10 30 40
        dll.displayBackward(); // List (tail to head): 40 30 10 20

        // Deleting a node
        dll.deleteNode(10);
        dll.deleteNode(10);
        dll.displayForward(); // List (head to tail): 20 30 40*/

        // Insert elements into the list
        dll.insertAtPosition(10, 1); // Insert at position 1
        dll.insertAtPosition(20, 2); // Insert at position 2
        dll.insertAtPosition(30, 3); // Insert at position 3
        dll.insertAtPosition(15, 2); // Insert at position 2
        dll.insertAtPosition(25, 4); // Insert at position 4

        // Display the list
        dll.displayForward(); // Output: List (head to tail): 10 15 20 25 30
    }
}
