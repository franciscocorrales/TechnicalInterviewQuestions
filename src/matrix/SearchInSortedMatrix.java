package src.matrix;

/*
 * http://www.geeksforgeeks.org/search-in-row-wise-and-column-wise-sorted-matrix/
 * */

public class SearchInSortedMatrix {
	
	public static void main(String[] args) {
		
		int[][] testMatrix1 = 
			{
					{10, 20, 30, 40},
					{15, 25, 35, 45},
					{27, 29, 37, 48},
					{32, 33, 39, 50},
			};
		
		int[][] testMatrix3 = 	{};
		
		int[][] testMatrix4 = 	{{10}};
		
		int[][] testMatrix5 = 	{{10},{15}};
		
		int[][] testMatrix6 = 	{{10, 15}};
		
		SearchInSortedMatrix searcher = new SearchInSortedMatrix();
		
		searcher.printSearch(0, testMatrix1, "testMatrix1");
		searcher.printSearch(10, testMatrix1, "testMatrix1");
		searcher.printSearch(50, testMatrix1, "testMatrix1");
		searcher.printSearch(20, testMatrix1, "testMatrix1");
		searcher.printSearch(48, testMatrix1, "testMatrix1");
		searcher.printSearch(29, testMatrix1, "testMatrix1");
		searcher.printSearch(51, testMatrix1, "testMatrix1");
		searcher.printSearch(-1, testMatrix1, "testMatrix1");
		searcher.printSearch(9, testMatrix1, "testMatrix1");
		
		searcher.printSearch(0, testMatrix3, "testMatrix3");
		searcher.printSearch(0, testMatrix4, "testMatrix4");
		searcher.printSearch(0, testMatrix5, "testMatrix5");
		searcher.printSearch(0, testMatrix6, "testMatrix6");
		
		searcher.printSearch(10, testMatrix3, "testMatrix3");
		searcher.printSearch(10, testMatrix4, "testMatrix4");
		searcher.printSearch(10, testMatrix5, "testMatrix5");
		searcher.printSearch(10, testMatrix6, "testMatrix6");
		
	}

	private void printSearch(int element, int[][] matrix, String matrixName){
		boolean found = search(element, matrix);
		String  beenFound =  found ? "was found" : "wasn't found";
		System.out.println( element + " " + beenFound +  " in " + matrixName + "\n");
	}
	
	/*
	 * The start point is top-right
	 * */
	private  boolean search(int element, int[][] matrix) {
		
		if(isBaseCase(matrix)){
			return false;
		}
		
		boolean foundElement = false;
		int column = matrix[0].length - 1;
		int row = 0;
		while(shouldContinueSearching(matrix, column, row) && !foundElement){
			if(matrix[row][column] == element){
				foundElement = true;
			}
			else if(matrix[row][column] < element){
				//move down
				row++;
			}
			else{
				//move left
				column--;
			}

		}

		
		return foundElement;
	}

	private boolean shouldContinueSearching(int[][] matrix, int column, int row) {
		return row <= (matrix.length - 1) && column >= 0;
	}

	private boolean isBaseCase(int[][] matrix) {
		return matrix == null || matrix.length == 0 ;
	}

	

}
