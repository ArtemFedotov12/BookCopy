package com.start.examples.test41;

import lombok.*;

@ToString
@Getter
@Setter
@RequiredArgsConstructor
public class ListNode {
    @ToString.Exclude
    private ListNode next;
    @NonNull
    private int val;

    public static void main(String[] args) {
        ListNode listNode1 = new ListNode(1);
        ListNode listNode2 = new ListNode(2);
        ListNode listNode3 = new ListNode(3);

        listNode1.setNext(listNode2);
        listNode2.setNext(listNode3);
        listNode3.setNext(null);

        ListNode cur = reverse(listNode1);
        while (cur!=null ) {
            System.out.println(cur);
            cur = cur.next;
        }

    }

    // 1 -> 2 -> 3 -> null
    // 3 -> -> 2 -> 1 -> null
    public static ListNode reverse(ListNode head) {
        ListNode current = head;
        ListNode previous = null;
        ListNode next = null;

        while (current!= null) {
            next = current.next;//2
            current.next = previous;
            previous = current;//1
            if (next==null)
                break;
            current = next;//2
        }

        return current;
    }
}


