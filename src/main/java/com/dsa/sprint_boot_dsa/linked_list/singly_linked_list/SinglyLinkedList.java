package com.dsa.sprint_boot_dsa.linked_list.singly_linked_list;

public class SinglyLinkedList {
    Node head;

    public SinglyLinkedList() {
        head = null;
    }

    public void append(int data) {
        Node newNode = new Node(data);
        // If the list is empty, make the new node the head
        if (head == null) {
            head = newNode;
            return;
        }
        // Otherwise, traverse to the end of the list and insert the new node
        Node current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = newNode;
    }

    // Method to print the entire list
    public void printList() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null"); // End of the list
    }

    // Method to insert a new node at the beginning
    public void prepend(int data) {
        Node newNode = new Node(data); // Create a new node
        newNode.next = head;            // Make the new node point to the current head
        head = newNode;                // Make the new node the new head
    }

    // Method to delete a node with a specific value
    public void delete(int data) {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }
        // If the node to be deleted is the head
        if (head.data == data) {
            head = head.next;
            return;
        }
        // Otherwise, search for the node to delete
        Node current = head;
        while (current.next != null && current.next.data != data) {
            current = current.next;
        }

        // If the node was found, remove it from the list
        if (current.next != null) {
            current.next = current.next.next;
        } else {
            System.out.println("Node not found.");
        }
    }
}
