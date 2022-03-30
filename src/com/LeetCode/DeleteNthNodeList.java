package com.LeetCode;

// Definition for singly-linked list.
class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}

public class DeleteNthNodeList {
    public ListNode removeNthFromEnd(ListNode head, int n) {

        ListNode cur = head;
        int size = 0;
        int i = 0;
        /*
         * if(head==null|| k<=1)
         * return null;
         * else
         */
        while (cur != null) {
            cur = cur.next;
            size++;
        }
        ListNode now = head;
        if (n == size) {
            head = head.next;
            return head;
        }

        while (i < size - n - 1) {
            System.out.println("before " + now.val);
            now = now.next;
            i++;
            System.out.println("after " + now.val + " i val " + i);

        }
        System.out.println(now.val + " size " + size + " i " + i);
        now.next = now.next.next;

        return head;

    }
}
