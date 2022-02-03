package com.DSA.Trees;

public class Tree {
	Node root;

	class Node {
		int val;
		Node right;
		Node left;

		public Node(int val) {
			this.val = val;
		}
	}

	public static void inOrder(Node root) {
		if (root != null) {
			System.out.println(root.val);
			inOrder(root.left);
			inOrder(root.right);
		}
	}

	public static void preOrder(Node root) {
		if (root != null) {
			preOrder(root.left);
			System.out.println(root.val);
			inOrder(root.right);
		}
	}

	public static void postOrder(Node root) {
		if (root != null) {

			postOrder(root.left);
			postOrder(root.right);
			System.out.println(root.val);
		}
	}
	
	public static int depthOfTree(Node root)
	{
		if(root==null)
			return -1;
		else
		{
			return 1+Math.max(depthOfTree(root.left), depthOfTree(root.right));
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tree t = new Tree();
		Node root = t.new Node(10);
		Node r = t.new Node(12);
		Node r1 = t.new Node(14);
		Node l = t.new Node(8);
		Node l1 = t.new Node(6);
		Node l2 = t.new Node(4);
		Node l3 = t.new Node(2);
		Node l4 = t.new Node(0);

		t.root = root;
		t.root.left = l;
		t.root.left.left = l1;
		t.root.left.left.left = l2;
		t.root.left.left.left.left = l3;
		t.root.left.left.left.left.left = l4;
		t.root.right = r;
		t.root.right.right = r1;

		inOrder(t.root);
		System.out.println("-------------");
		preOrder(t.root);
		System.out.println("-------------");
		postOrder(t.root);
		System.out.println("-------------");
		System.out.println("Depth or Height of the tree is --->> "+depthOfTree(t.root));;
	}

}