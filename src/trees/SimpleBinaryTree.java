package src.trees;

public class SimpleBinaryTree {

	private SimpleBinaryNode root;
	
	private class SimpleBinaryNode{
		SimpleBinaryNode left;
		SimpleBinaryNode right;
	    int value;
	    
	    SimpleBinaryNode(int newValue){
	    	this.value = newValue;
	    }
	    
	    private void print(){
	    	System.out.print( value + " ");
	    }

		public void printTab(String tabs) {
			System.out.print( tabs  + value + " \n " );
		}
	}
	
	public SimpleBinaryTree() {
		root = null;
	}
	
	private void insert(int elementToInsert){
		root = insert(root, elementToInsert);
	}
	
	private SimpleBinaryNode insert(SimpleBinaryNode fatherNode, int elementToInsert){

		if(isLeaf(fatherNode)){
			return new SimpleBinaryNode(elementToInsert);
		}
		else{
			insertToChildren(fatherNode, elementToInsert);
			return fatherNode;
		}
		
	}
	
	private boolean isLeaf(SimpleBinaryNode node){
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
		if(isLeaf(currentNode)){
			return ;//nothing
		}
		
		printTree(currentNode.left);
		printTree(currentNode.right);
		currentNode.print();
	}
	
	public void printTreeTab(){
		System.out.println();
		printTreeTab(root, "");
		System.out.println();
	}
	 

	private void printTreeTab(SimpleBinaryNode currentNode, String tabs) {
		if(isLeaf(currentNode)){
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
	}
	
}
