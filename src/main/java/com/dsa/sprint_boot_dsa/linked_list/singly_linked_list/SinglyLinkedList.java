package com.dsa.sprint_boot_dsa.linked_list.singly_linked_list;

public class SinglyLinkedList {

    Node head;

    public SinglyLinkedList() {
        head = null;
    }

    public void insertElementAtFirst(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    public void insertElementAtLast(int data) {
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

    public void insertElementAtParticularPosition(int data, int position) {
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

    public void printList() {
        if (head == null) {
            System.out.println("List is empty");
        }
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
    }
}
