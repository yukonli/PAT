package me.interview.ms;

import java.util.ArrayList;

public class FindMatchSumInBinaryTree {
	
	private static class TreeNode {
		public TreeNode lNode;
		public TreeNode rNode;
		public int data;
	}
	
	public static void main(String args[]) {
		
		TreeNode root = new TreeNode();
		root.data = 10;
		root.lNode = new TreeNode();
		root.rNode = new TreeNode();
		root.lNode.data = 5;
		root.rNode.data = 12;
		root.lNode.lNode = new TreeNode();
		root.lNode.rNode = new TreeNode();
		root.lNode.lNode.data = 4;
		root.lNode.rNode.data = 7;
		
		int sum =22;
		ArrayList<Integer> path = new ArrayList<Integer>();
		helper(root, sum, path);
		
	}
	
	public static void printPath (ArrayList<Integer> path) {
		
		int length = path.size();
		for (int i = 0; i < length; i++)
		{
			System.out.print(path.get(i) + "---");
		}
		System.out.print("\n");
	}
	
	public static void helper( TreeNode root, int sum, ArrayList<Integer> path) {
		
		int pos = path.size();
		path.add(root.data);
		
		sum -= root.data;
		
		if (sum == 0)
			printPath(path);
		else {
			if (root.lNode != null)
				helper(root.lNode, sum, path);
			if (root.rNode != null)
				helper(root.rNode, sum, path);
		}
		sum += root.data;
		path.remove(pos);
	}

}
