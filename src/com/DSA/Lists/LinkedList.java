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

    public void delete(Node head) {
        if (head == null)
            return;
        else {
            Node root = head.next;
            head.next = null;
            this.head = root;

        }
    }

    public void deleteNodeVal(int val) {
        if (this.head == null)
            return;

        if (this.head.val == val) {
            Node root = this.head.next;
            this.head.next = null;
            this.head = root;

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
            cur.next = null;

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

    public Node reverseList(Node head) {

        Node prev = null;
        Node cur = head;
        while (cur.next != null) {
            Node next = cur.next;
            cur.next = prev;
            prev = cur;
            cur = next;
        }
        cur.next = prev;
        this.head = cur;
        return cur;
    }

    public Node recursiveReverseList(Node head) {
        Node prev = null;
        return recursiveReverseList(head, prev);
    }

    // own recursive implementation
    private Node recursiveReverseList(Node head, Node prev) {
        if (head == null)
            return null;

        Node nextRef = recursiveReverseList(head.next, prev);
        if (nextRef == null) {
            this.head.next = nextRef;
            this.head = head;
            return head;
        }
        prev = nextRef;
        prev.next = head;

        return head;
    }

    public static void main(String[] args) {

        LinkedList list = new LinkedList();

        list.insert(20);
        list.insert(30);
        list.insert(40);
        list.insert(50);
        list.insert(60);
        list.insert(70);
        list.insert(80);
        list.insert(10);
        list.delete(list.head);
        list.deleteNodeVal(80);
        list.deleteNodeVal(40);

        list.traverse(list.head);
        System.out.println("---------------");
        System.out.println("middle is " + list.middle(list.head));
        System.out.println("---------------");
        System.out.println(list.middleAlgo(list.head));
        System.out.println("---------------");
        System.out.println("head after iterative reverse " + list.reverseList(list.head).val);
        System.out.println("After revrese---");
        list.traverse(list.head);
        list.recursiveReverseList(list.head);
        System.out.println("After recursive revrese---");
        list.traverse(list.head);

    }

}
