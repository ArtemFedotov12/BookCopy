package com.start.examples.leetCode;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.ArrayDeque;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        LinkedNode linkedNode1 = new LinkedNode(1);
        LinkedNode linkedNode2 = new LinkedNode(2);
        LinkedNode linkedNode3 = new LinkedNode(3);
        LinkedNode linkedNode4 = new LinkedNode(4);
        LinkedNode linkedNode5 = new LinkedNode(5);

        linkedNode1.setNext(linkedNode2);
        linkedNode2.setNext(linkedNode3);
        linkedNode3.setNext(linkedNode4);
        linkedNode4.setNext(linkedNode5);
        linkedNode5.setNext(null);

        printLinked(linkedNode1);
        System.out.println("*****");
        printLinked(reverse(linkedNode1));

    }

    private static void printLinked(LinkedNode head) {
        LinkedNode current = head;
        while (current!=null){
            System.out.println(current.toString());
            current = current.next;
        }
    }

    private static LinkedNode reverse(LinkedNode head) {

        LinkedNode current = head;

        LinkedNode previous = new LinkedNode(head.getValue());
        LinkedNode next = new LinkedNode(0);
        while (current.next != null) {
            next = new LinkedNode(current.next.getValue());
            next.setNext(previous);

            previous = next;

            current = current.next;
        }


        return next;
    }

    @Setter
    @Getter
    @ToString
    private static class LinkedNode {
        private int value;
        @ToString.Exclude
        private LinkedNode next;

        public LinkedNode(int value) {
            this.value = value;
        }

    }

}


