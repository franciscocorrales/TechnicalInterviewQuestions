package src.trees;

import java.util.Arrays;

/*
 * http://www.geeksforgeeks.org/amazon-interview-experience-set-281-for-sde1/
 * http://www.geeksforgeeks.org/root-to-leaf-path-sum-equal-to-a-given-number/
 * 
 * */
public class HasPathSum {

	
	public HasPathSum() {
		
	}

	private boolean hasPathSum(SimpleBinaryTree tree, int sum){
		return hasPathSum(tree.root, sum);
	}
	
	private boolean hasPathSum(SimpleBinaryNode currentNode, int sum) {
		if(currentNode == null){
			return sum == 0;
		}
		else{
			int newSum = sum - currentNode.value;
			return hasPathSum(currentNode.left, newSum) || hasPathSum(currentNode.right, newSum);
		}
	}



	
	
	
	
	private void printPathSum(SimpleBinaryTree tree, int sum) {
		int[] path = new int[1000]; // should be set to the max height of tree
		printPathSum(tree.root, path, 0, sum); 
	}

	
	private void printPathSum(SimpleBinaryNode currentNode, int[] path, int pathLen, int sum) {
		if (currentNode==null)
			return;

		// append this node to the path array 
		path[pathLen] = currentNode.value; 
		pathLen++;

		// it's a leaf, so print the path that led to here 
		if (currentNode.isLeaf() && sum == currentNode.value) { 
			printArray(path, pathLen); 
		} 
		else {
			printPathSumChildren(currentNode, path, pathLen,sum);
		} 
	}
	
	private void printPathSumChildren(SimpleBinaryNode currentNode, int[] path, int pathLen, int sum){
		int newSum = sum - currentNode.value;
		printPathSum(currentNode.left, path, pathLen, newSum); 
	    printPathSum(currentNode.right, path, pathLen, newSum); 
	}
	
	private void printArray(int[] ints, int len) { 
		  int i; 
		  for (i=0; i<len; i++) { 
		   System.out.print(ints[i] + " "); 
		  } 
		  System.out.println(); 
	} 

	
	
	
	
	
	
	
	public static void main(String[] args) {
		
		HasPathSum finder = new HasPathSum();
		
		SimpleBinaryTree tree1 = new SimpleBinaryTree();
		tree1.printTreeTab();
		finder.printPath(tree1, 22);		
		
		/*
			   	  5
				/   \
			   4     8
		      /     / \
		     11    13  4   
		    /  \      /  \
		   7    2    5    1
		*/
		SimpleBinaryTree tree2 = new SimpleBinaryTree(
				new SimpleBinaryNode(5),
					new SimpleBinaryTree(
							new SimpleBinaryNode(4),
							new SimpleBinaryTree(
									new SimpleBinaryNode(11),
									new SimpleBinaryNode(7),
									new SimpleBinaryNode(2)
							).root,
							null
					).root,
					new SimpleBinaryTree(
							new SimpleBinaryNode(8),
							new SimpleBinaryNode(13),
							new SimpleBinaryTree(
									new SimpleBinaryNode(4),
									new SimpleBinaryNode(5),
									new SimpleBinaryNode(1)
							).root
					).root
				);
		tree2.printTreeTab();
		finder.printPath(tree2, 22);
		finder.printPath(tree2, 5);
		finder.printPath(tree2, 4);
		finder.printPath(tree2, 2222);
		finder.printPath(tree2, 26);

	}

	private void printPath(SimpleBinaryTree tree, int sum) {
		System.out.println("Has path for sum:"+ sum + " ? -> " + hasPathSum(tree, sum) );
		System.out.println("Path: ");
		printPathSum(tree, sum);
		System.out.println("\n");
	}
	
	
}
