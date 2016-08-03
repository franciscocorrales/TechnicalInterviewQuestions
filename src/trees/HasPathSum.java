package src.trees;

/*
 * http://www.geeksforgeeks.org/amazon-interview-experience-set-281-for-sde1/
 * */
public class HasPathSum {

	public HasPathSum() {
		
	}

	public static void main(String[] args) {
		
		HasPathSum finder = new HasPathSum();
		
		SimpleBinaryTree tree1 = new SimpleBinaryTree();
		finder.printPath(tree1, 22);		

	}

	private void printPath(SimpleBinaryTree tree, int sum) {
		System.out.println("Tree: ");
		tree.printTreeTab();
		System.out.println("Path: ");
	}

}
