package src.java.trees;

/*
 * http://cslibrary.stanford.edu/110/BinaryTrees.html
 * */

public class SimpleBinaryTree {

	SimpleBinaryNode root;
	
	public SimpleBinaryTree() {
		root = null;
	}
	
	public SimpleBinaryTree(SimpleBinaryNode newRoot, SimpleBinaryNode left, SimpleBinaryNode right) {
		root = newRoot;
		root.left = left;
		root.right = right;
	}
	
	private void insert(int elementToInsert){
		root = insert(root, elementToInsert);
	}
	
	public SimpleBinaryNode insert(SimpleBinaryNode fatherNode, int elementToInsert){

		if(isEmpty(fatherNode)){
			return new SimpleBinaryNode(elementToInsert);
		}
		else{
			insertToChildren(fatherNode, elementToInsert);
			return fatherNode;
		}
		
	}
	
	private boolean isEmpty(SimpleBinaryNode node){
		return node == null;
	}
	
	private boolean shouldInsertAtLeft(SimpleBinaryNode fatherNode, int elementToInsert){
		return elementToInsert <= fatherNode.value;
	}
	
	private void insertToChildren(SimpleBinaryNode fatherNode, int elementToInsert){
		if(shouldInsertAtLeft(fatherNode, elementToInsert)){
			fatherNode.left = insert(fatherNode.left, elementToInsert);
		}
		else{
			fatherNode.right = insert(fatherNode.right, elementToInsert);
		}
	}
	
	public void printTree() {
		System.out.println();
		 printTree(root); 
		 System.out.println(); 
	}

	private void printTree(SimpleBinaryNode currentNode) {
		if(isEmpty(currentNode)){
			return ;//nothing
		}
		
		printTree(currentNode.left);
		printTree(currentNode.right);
		currentNode.print();
	}
	
	public void printTreeTab(){
		System.out.println();
		if(root == null){
			System.out.println("This tree is empty! :( ");
		}
		else{
			printTreeTab(root, "");
		}
		System.out.println();
	}
	 

	private void printTreeTab(SimpleBinaryNode currentNode, String tabs) {
		if(isEmpty(currentNode)){
			return ;//nothing
		}
		
		currentNode.printTab(tabs);
		printTreeTab(currentNode.left, tabs + "\t");
		printTreeTab(currentNode.right, tabs + "\t");
	}

	public static void main(String[] args) {
		
		SimpleBinaryTree tree1 = new SimpleBinaryTree();
		tree1.insert(10);
		tree1.insert(15);
		tree1.insert(7);
		tree1.insert(5);
		tree1.printTree();
		tree1.printTreeTab();

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
	
}
