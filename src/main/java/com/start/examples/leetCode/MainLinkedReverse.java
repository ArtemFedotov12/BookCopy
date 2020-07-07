package com.start.examples.leetCode;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

public class MainLinkedReverse {
    public static void main(String[] args) {
        LinkedNode linkedNode1 = new LinkedNode(1);
        LinkedNode linkedNode2 = new LinkedNode(2);
        LinkedNode linkedNode3 = new LinkedNode(3);

        linkedNode1.setNext(linkedNode2);
        linkedNode2.setNext(linkedNode3);

        printLinked(linkedNode1);

        printLinked(rev(linkedNode1));


    }

    // 1 -> 2 -> 3 -> null
    // 3 - > 2 - > 1 -> null

    private static LinkedNode rev(LinkedNode head) {
        LinkedNode previous = null;
        LinkedNode current = head;

        while (current != null) {
            LinkedNode next = current.next;//2
            current.setNext(previous);// 1- > null
            previous = current; // prev = 1
            current = next; //cur = 2
        }

        return previous;
    }

    private static void printLinked(LinkedNode head) {
        while (head!=null) {

            System.out.println(head);

            head = head.next;
        }
    }

    @Getter
    @Setter
    @ToString
    private static class LinkedNode {
        private int val;
        @ToString.Exclude
        LinkedNode next;

        public LinkedNode(int val) {
            this.val = val;
        }

    }

}
