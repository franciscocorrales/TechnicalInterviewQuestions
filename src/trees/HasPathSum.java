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

	}

	private void printPath(SimpleBinaryTree tree, int sum) {
		System.out.println("Tree: ");
		tree.printTreeTab();
		System.out.println("Path: " + "\n");
	}

	
	
}

/*

5
	left 4
		left 11
			left 7
			right 2
	right 8
		left 13
		right 4
			left 5
			right 1





root = new Node(2); 
Node lChild = new Node(1); 
Node rChild = new Node(3);

root = new Node(2); 
root.left = new Node(1); 
root.right = new Node(3); 
*/