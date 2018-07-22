package com.ritchieeinstein.training.ds.binarytree;

public class InorderTraversal {

	static class Node {
		int val;
		Node left, right;

		Node(int val) {
			this.val = val;
		}

	}

	public static void inorder(Node root) {
		if (root.left != null) {
			inorder(root.left);
		}
		System.out.println(root.val);
		if (root.right != null) {
			inorder(root.right);
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

		inorder(root);
	}

}
