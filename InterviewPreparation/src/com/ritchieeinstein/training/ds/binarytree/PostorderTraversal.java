package com.ritchieeinstein.training.ds.binarytree;

public class PostorderTraversal {
	static class Node {
		int val;
		Node left, right;

		public Node(int val) {
			this.val = val;
			left = right = null;
		}
	}

	public static void postOrder(Node root) {
		if (root.left != null) {
			postOrder(root.left);
		}
		if (root.right != null) {
			postOrder(root.right);
		}
		if (null != root) {
			System.out.println(root.val);
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
		postOrder(root);
	}
}
