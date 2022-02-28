package com.DSA.Trees;

public class Tree {
	Node root;
	static int prev = Integer.MIN_VALUE;
	int maxlevel = 0;

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

	public static int depthOfTree(Node root) {
		if (root == null)
			return -1;
		else {
			return 1 + Math.max(depthOfTree(root.left), depthOfTree(root.right));
		}
	}

	public static boolean isBST(Node root) {
		int min = Integer.MIN_VALUE;
		int max = Integer.MAX_VALUE;
		return isBST(root, min, max);
	}

	private static boolean isBST(Node root2, int min, int max) {
		if (root2 == null)
			return true;

		return (root2.val > min && root2.val < max && isBST(root2.left, min, root2.val)
				&& isBST(root2.right, root2.val, max));
	}

	public static boolean isBSTEffcient(Node root) {

		if (root == null)
			return true;
		if (isBST(root.left) == false)
			return false;
		if (root.val < prev)
			return false;
		prev = root.val;
		return isBST(root.right);

	}

	public void printLeftView(Node root, int level) {
		if (root == null)
			return;

		if (maxlevel < level) {
			maxlevel = level;
			System.out.println(root.val);
		}
		printLeftView(root.left, level + 1);
		printLeftView(root.right, level + 1);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tree t = new Tree();
		Node root = t.new Node(10);
		Node r = t.new Node(12);
		Node rl1=t.new Node(11);
		Node r1 = t.new Node(14);
		Node rl2=t.new Node(13);
		Node l = t.new Node(8);
		Node l1 = t.new Node(6);
		Node l2 = t.new Node(4);
		Node l3 = t.new Node(2);
		Node lr3 = t.new Node(3);
		Node l4 = t.new Node(0);
		Node lr4 = t.new Node(1);

		root.left = l;
		l.left = l1;
		l1.left = l2;
		l2.left = l3;
		l3.left = l4;
		l3.right = lr3;
		l4.right = lr4;
		root.right = r;
		r.left=rl1;
		r.right = r1;
		r1.left=rl2;
		t.root = root;
		inOrder(t.root);
		System.out.println("-------------");
		preOrder(t.root);
		System.out.println("-------------");
		postOrder(t.root);
		System.out.println("-------------");
		System.out.println("Depth or Height of the tree is --->> " + depthOfTree(t.root));
		System.out.println("--------------");
		System.out.println("is binary Tree " + isBST(t.root));
		t.printLeftView(t.root, 1);

	}

}
