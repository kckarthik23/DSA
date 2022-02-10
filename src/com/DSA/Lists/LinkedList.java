package com.DSA.Lists;

public class LinkedList {
    Node head;

    class Node {
        Node next;
        int val;

        Node(int val) {
            this.val = val;
        }
    }

    public Node insert(int val) {
        Node newNode = new Node(val);
        if (this.head == null) {
            this.head = newNode;
            return newNode;
        } else {
            newNode.next = head;
            head = newNode;
            return head;
        }

    }

    public void traverse(Node head) {
        if (head == null)
            return;
        else {
            Node cur = head;
            while (cur.next != null) {
                System.out.println(cur.val);
                cur = cur.next;
            }
            System.out.println(cur.val);

        }

    }

    public int middle(Node head) {
        Node cur = head;
        int count = 1;
        while (cur.next != null) {
            ++count;
            cur = cur.next;
        }
        Node now = head;
        for (int i = 1; i < (count / 2); i++) {
            now = now.next;
        }
        return now.val;
    }

    public int middleAlgo(Node head) {
        Node slowRef = head;
        Node fastRef = head;
        while (fastRef != null && fastRef.next != null) {
            slowRef = slowRef.next;
            fastRef = fastRef.next.next;
        }
        return slowRef.val;
    }

    public static void main(String[] args) {

        LinkedList list = new LinkedList();
        list.insert(10);
        list.insert(20);
        list.insert(30);
        list.insert(40);
        list.insert(50);
        list.insert(60);
        list.insert(70);
        list.insert(80);

        list.traverse(list.head);
        System.out.println("---------------");
        System.out.println("middle is " + list.middle(list.head));
        System.out.println("---------------");
        System.out.println(list.middleAlgo(list.head));

    }

}
