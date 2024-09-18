package com.dsa.sprint_boot_dsa.linked_list.singly_linked_list;

public class SinglyLinkedList {

    Node head;

    public SinglyLinkedList() {
        head = null;
    }

    public void insertNodeAtFirst(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    public void insertNodeAtLast(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = newNode;
    }

    public void insertNodeAtParticularPosition(int data, int position) {
        Node newNode = new Node(data);

        // Case: Insert at the beginning (position 0)
        if (position == 0) {
            newNode.next = head;
            head = newNode;
            return;
        }
        Node current = head;
        int count = 0;
        while (current != null && count < position - 1) {
            current = current.next;
            count++;
        }
        // If current is null, the position is out of bounds
        if (current == null) {
            System.out.println("Position out of bounds");
            return;
        }

        // Insert the new node at the position
        newNode.next = current.next;
        current.next = newNode;

    }

    public void deleteFirstNode() {
        if (head == null) {
            System.out.println("List is empty, nothing to delete.");
            return;
        }
        head = head.next;
    }

    public void deleteLastNode() {
        if (head == null) {
            System.out.println("List is empty, nothing to delete.");
            return;
        }
        // If the list has only one element
        if (head.next == null) {
            head = null;
            System.out.println("Deleted, There has only one element");
            return;
        }
        Node current = head;
        while (current.next.next != null) {
            current = current.next;
        }
        current.next = null;
    }

    public void deleteNodeAtPosition(int position) {
        if (head == null) {
            System.out.println("List is empty, nothing to delete.");
            return;
        }
        // Case 1: Deleting the head node
        if (position == 0) {
            head = head.next;
            return;
        }
        Node current = head;
        // Traverse to the node before the one we want to delete
        for (int i = 0; current != null && i < position - 1; i++) {
            current = current.next;
        }

        // If position is out of range
        if (current == null || current.next == null) {
            System.out.println("Position out of range.");
            return;
        }

        // Node to be deleted is `current.next`
        Node nodeToDeleted = current.next;
        current.next = nodeToDeleted.next;

    }

    public void printList() {
        if (head == null) {
            System.out.println("List is empty");
        }
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }
}
