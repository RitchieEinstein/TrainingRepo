package com.ritchieeinstein.training.ds.binarytree;

import java.util.LinkedList;
import java.util.Queue;

public class LevelOrderTraversal {
	
	static class Node{
		int val;
		Node left, right;
		
		public Node(int val) {
			this.val = val;
		}
		
		public static void levelOrder(Node root) {
			Queue<Node> q = new LinkedList<>();
			if(null == root) {
				return;
			}
			Node current = root;
			int curCounter = 1;
			int nextCounter = 0;
			while(null != current) {
				System.out.print(current.val);
				curCounter--;
				if(null != current.left) {
					q.add(current.left);
					nextCounter++;
				}
				if(null != current.right) {
					q.add(current.right);
					nextCounter++;
				}
				current = q.poll();
				if(curCounter <= 0) {
					System.out.println("\n");
					curCounter = nextCounter;
					nextCounter = 0;
				}
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
			levelOrder(root);
		}
	}

}
