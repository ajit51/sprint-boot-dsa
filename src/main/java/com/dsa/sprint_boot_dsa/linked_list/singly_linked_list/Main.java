package com.dsa.sprint_boot_dsa.linked_list.singly_linked_list;

public class Main {
    public static void main(String[] args) {
        SinglyLinkedList list = new SinglyLinkedList();

       list.insertElementAtParticularPosition(10, 0);
       list.insertElementAtParticularPosition(20, 0);
       list.insertElementAtParticularPosition(78, 1);
       list.insertElementAtParticularPosition(90, 0);
       list.insertElementAtParticularPosition(88, 1);
        list.printList();
    }
}
