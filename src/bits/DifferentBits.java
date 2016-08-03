package src.bits;

/*
 * http://www.geeksforgeeks.org/count-number-of-bits-to-be-flipped-to-convert-a-to-b/
 * */

public class DifferentBits {
	
	private int numberOfFlips(int a, int b){
		int numberOfFlips = 0;
		int difference = a ^ b;
		numberOfFlips = Integer.bitCount(difference);
		return numberOfFlips;
	}
	
	private void printNumberOfFlips(int a, int b){
		System.out.println( a + "->" + b + ": " + numberOfFlips(a, b) + "\n");
	}

	public static void main(String[] args) {
		
		DifferentBits db = new DifferentBits();
		
		db.printNumberOfFlips(0, 12);
		db.printNumberOfFlips(-1, 1);
		db.printNumberOfFlips(1000, -1000);
		db.printNumberOfFlips(33, 33);
		db.printNumberOfFlips(64, 64);
		db.printNumberOfFlips(0, 1024);
		db.printNumberOfFlips(555, 556);
		db.printNumberOfFlips(63, 65);
		
	}

}
