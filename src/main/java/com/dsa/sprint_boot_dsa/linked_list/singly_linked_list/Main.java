package com.dsa.sprint_boot_dsa.linked_list.singly_linked_list;

public class Main {
    public static void main(String[] args) {
        SinglyLinkedList list = new SinglyLinkedList();
        // Append nodes to the list
        list.append(10);
        list.append(20);
        list.append(30);

        // Print the list
        System.out.println("List after appending elements:");
        list.printList();

        // Prepend node to the list
        list.prepend(5);
        System.out.println("List after prepending an element:");
        list.printList();

        // Delete a node
        list.delete(20);
        System.out.println("List after deleting element 20:");
        list.printList();

        // Attempt to delete a non-existent node
        list.delete(50);
    }
}
