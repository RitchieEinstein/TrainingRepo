package com.ritchieeinstein.training.ds.tree;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class VerticalOrderTraversalWithoutOrder {

	static class Node {
		int val;
		Node left, right;

		public Node(int val) {
			this.val = val;
		}
	}
	
	public static void verticalOrder(Node root) {
		if(null == root)return;
		
		Map<Integer,List<Integer>> posMap = new LinkedHashMap<>();	
		findOrderofNodes(root, 0, posMap);
		Set<Entry<Integer,List<Integer>>> entrySet = posMap.entrySet();
		for(Entry<Integer, List<Integer>>entry : entrySet) {
			System.out.println(entry.getValue());
		}
	}
	
	public static void findOrderofNodes(Node node, int distance, Map<Integer, List<Integer>> posMap) {
		if(node == null)return;
		
		findOrderofNodes(node.left, distance-1, posMap);
		findOrderofNodes(node.right, distance+1, posMap);
		List<Integer> nodeList = (List<Integer>) posMap.get(distance);
		if(null == nodeList) {
			nodeList = new LinkedList<Integer>();
		}
		posMap.put(distance, nodeList);
		nodeList.add(node.val);
		
	}

	public static void main(String[] args) {
		Node root = new Node(1);
		root.left = new Node(2);
		root.right = new Node(3);
		root.left.left = new Node(4);
		root.left.right = new Node(5);
		root.right.left = new Node(6);
		root.right.right = new Node(7);
		verticalOrder(root);
	}

}
