package com.dsa.sprint_boot_dsa.linked_list.doubly_linked_list;

public class DoublyLinkedList {
    Node head;

    DoublyLinkedList() {
        head = null;
    }

    // Method to insert a node at the front
    public void insertAtFront(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;     // If list is empty, set head to the new node
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
    }

    public void insertAtEnd(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
        newNode.prev = temp;
    }

    public void deleteNode(int data) {
        if (head == null) {
            System.out.println("List is empty...");
            return;
        }
        Node temp = head;
        // If the head node itself holds the data to be deleted
        if (temp != null && temp.data == data) {
            head = temp.next;   // Change the head
            if (head != null) {
                head.prev = null;
            }
            return;
        }

        // Search for the node to be deleted
        while (temp != null && temp.data != data) {
            temp = temp.next;
        }
        // If the node was not found
        if (temp == null) {
            System.out.println("Node not found");
        }
        // Unlink the node from the linked list
        if (temp.next != null) {
            temp.next.prev = temp.prev;
        }
        if (temp.prev != null) {
            temp.prev.next = temp.next;
        }
    }

    // Method to insert a node at a specific position
    public void insertAtPosition(int data, int position) {
        Node newNode = new Node(data);
        // If position is 1, insert at the head
        if (position == 1) {
            newNode.next = head;
            if (head != null) {
                head.prev = newNode;
            }
            head = newNode;
            return;
        }

        Node temp = head;
        int count = 1;

        // Traverse the list until the position is reached
        while (temp != null && count < position - 1) {
            temp = temp.next;
            count++;
        }

        // If the position is out of bounds
        if (temp == null) {
            System.out.println("Position out of bounds");
            return;
        }

        // Inserting at the end if temp.next is null
        if (temp.next == null) {
            temp.next = newNode;
            newNode.prev = temp;
        } else {
            // Inserting the new node between temp and temp.next
            newNode.next = temp.next;
            temp.next.prev = newNode;
            temp.next = newNode;
            newNode.prev = temp;
        }
    }

    public void displayForward() {
        if (head == null) {
            System.out.println("List is empty...");
            return;
        }
        Node temp = head;
        System.out.print("List (head to tail):");
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public void displayBackward() {
        if (head == null) {
            System.out.println("List is empty...");
            return;
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        System.out.print("List (tail to head): ");
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.prev;
        }
        System.out.println();
    }
}
