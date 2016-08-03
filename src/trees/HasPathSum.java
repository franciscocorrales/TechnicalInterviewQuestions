package src.trees;

import java.util.ArrayList;
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
		ArrayList<Integer> path = new ArrayList<Integer>();
		printPathSum(tree.root, path,sum); 
	}

	
	private void printPathSum(SimpleBinaryNode currentNode,ArrayList<Integer> path, int sum) {
		if (currentNode==null)
			return;

		path.add(currentNode.value);

		// it's a leaf, so print the path that led to here 
		if (currentNode.isLeaf() && sum == currentNode.value) { 
			printArray(path); 
		} 
		else {
			printPathSumChildren(currentNode, path,sum);
		} 
	}
	
	private void printPathSumChildren(SimpleBinaryNode currentNode, ArrayList<Integer> path, int sum){
		int newSum = sum - currentNode.value;
		printPathSum(currentNode.left,  new ArrayList<Integer>(path), newSum); 
	    printPathSum(currentNode.right, new ArrayList<Integer>(path), newSum); 
	}
	
	private void printArray(ArrayList<Integer> path) {		
		System.out.println(Arrays.toString(path.toArray()));
	} 

	
	
	
	
	
	
	
	public static void main(String[] args) {
		
		HasPathSum finder = new HasPathSum();
		
		SimpleBinaryTree tree1 = new SimpleBinaryTree();
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
		finder.printPath(tree2, 22);
		finder.printPath(tree2, 5);
		finder.printPath(tree2, 4);
		finder.printPath(tree2, 2222);
		finder.printPath(tree2, 26);
		finder.printPath(tree2, 13);

	}

	private void printPath(SimpleBinaryTree tree, int sum) {
		boolean hasPath =  hasPathSum(tree, sum);
		if(hasPath){
			System.out.println("Paths for sum: " + sum);
			printPathSum(tree, sum);
			System.out.println("\n");
		}
		else{
			System.out.println("The tree doesn't have a path for the sum: " + sum);
		}
	}
	
	
}
