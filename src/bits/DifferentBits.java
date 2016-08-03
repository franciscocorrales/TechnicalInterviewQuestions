package src.bits;

/*
 * http://www.geeksforgeeks.org/count-number-of-bits-to-be-flipped-to-convert-a-to-b/
 * */

public class DifferentBits {

	public DifferentBits() {
	}
	
	private static int numberOfFlips(int a, int b){
		int numberOfFlips = 0;
		int difference = a ^ b;
		numberOfFlips = Integer.bitCount(difference);
		return numberOfFlips;
	}
	
	private static void printNumberOfFlips(int a, int b){
		System.out.println( a + "->" + b + ": " + numberOfFlips(a, b) + "\n");
	}

	public static void main(String[] args) {
		printNumberOfFlips(0, 12);
		printNumberOfFlips(-1, 1);
		printNumberOfFlips(1000, -1000);
		printNumberOfFlips(33, 33);
		printNumberOfFlips(64, 64);
		printNumberOfFlips(0, 1024);
		printNumberOfFlips(555, 556);
		printNumberOfFlips(63, 65);
		
	}

}
