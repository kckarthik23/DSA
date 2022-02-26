package com.DSA.Lists;

public class DoublyLinkedList {
    Node head;
    Node tail;

    class Node {
        Node prev;
        Node next;
        int val;

        Node(int val) {
            this.val = val;
        }
    }

    public void insertAthead(int val) {
        Node newNode = new Node(val);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
            head.prev = null;

        }
    }

    public void insertAtEnd(int val) {
        Node newNode = new Node(val);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.prev = tail;
            tail.next = newNode;
            tail = newNode;
            tail.next = null;

        }
    }

    public void deleteNode(int val) {
        if (this.head == null)
            return;
        if (this.head.val == val) {
            Node tentHead = this.head.next;
            this.head.next = null;
            this.head = tentHead;
            this.head.prev = null;
        } else if (this.tail.val == val) {
            Node tentTail = this.tail.prev;
            this.tail.prev = null;
            this.tail = tentTail;
            this.tail.next = null;
        } else {
            Node cur = this.head;
            Node prev = null;
            while (cur != null && cur.val != val) {
                prev = cur;
                cur = cur.next;
            }
            if (cur == null)
                return;
            prev.next = cur.next;
            cur.next.prev = prev;
            cur.next = null;
            cur.prev = null;

        }
    }

    public void traverseDoublyLinkedList(Node head) {

        Node cur = head;
        while (cur.next != null) {
            System.out.println(cur.val);
            cur = cur.next;
        }
        System.out.println(tail.val);

    }

    public void reverseDoublyLinkedList(Node head) {
        Node prev = null;
        Node cur = head;
        this.tail = cur;
        while (cur.next != null) {
            Node next = cur.next;
            cur.prev = next;
            cur.next = prev;
            prev = cur;
            cur = next;
        }
        cur.next = prev;
        cur.prev = null;
        this.head = cur;
    }

    public static void main(String[] args) {
        DoublyLinkedList db = new DoublyLinkedList();

        db.insertAthead(10);
        db.insertAtEnd(20);
        db.insertAtEnd(30);
        db.insertAtEnd(40);
        db.insertAtEnd(40);
        db.insertAtEnd(50);
        db.insertAtEnd(60);
        db.insertAthead(5);
        db.insertAthead(4);
        db.traverseDoublyLinkedList(db.head);

        db.deleteNode(4); // deleting the head
        db.deleteNode(40); // deleting middle
        db.deleteNode(60); // deleting tail
        System.out.println("--------after deleting operations ---------");
        db.traverseDoublyLinkedList(db.head);
        db.reverseDoublyLinkedList(db.head);
        System.out.println("---after reversing the doubly linked list---");
        db.traverseDoublyLinkedList(db.head);

    }

}
