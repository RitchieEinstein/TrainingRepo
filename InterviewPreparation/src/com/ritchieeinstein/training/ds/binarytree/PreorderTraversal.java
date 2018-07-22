package com.ritchieeinstein.training.ds.binarytree;

public class PreorderTraversal {

	static class Node {
		int val;
		Node left, right;

		public Node(int val) {
			this.val = val;
			left = right = null;
		}
	}

	public static void preOrder(Node root) {
		if (null != root) {
			System.out.println(root.val);
		}
		if (root.left != null) {
			preOrder(root.left);
		}
		if (root.right != null) {
			preOrder(root.right);
		}
	}

	public static void main(String[] args) {
		Node root = new Node(1);
		root.left = new Node(2);
		root.right = new Node(3);
		root.left.left = new Node(4);
		root.left.right = new Node(5);
		root.right.left = new Node(6);
		root.right.right = new Node(7);
		preOrder(root);
	}
}
