package src.java.linkedlist;

import java.util.Iterator;
import java.util.LinkedList;

/*
 * http://www.geeksforgeeks.org/amazon-interview-experience-set-281-for-sde1/
 * */
public class AppendNumbers {

	public AppendNumbers() {

	}
	
	private void printAppend(LinkedList<Integer> list){
		System.out.println("List: " + list.toString() + " -> " +  appendNumbers(list) );
	}

	private int appendNumbers(LinkedList<Integer> list) {
		int sum = 0;
		Iterator<Integer> iterator = list.iterator();
		while(iterator.hasNext()){
			sum = (sum*10) + iterator.next();
		}
		return sum;
	}

	public static void main(String[] args) {
		AppendNumbers appender = new AppendNumbers();
		
		LinkedList<Integer> linkedlist1 = new LinkedList<Integer>();
		linkedlist1.add(1);
		linkedlist1.add(2);
		linkedlist1.add(3);
		appender.printAppend(linkedlist1);
		
		LinkedList<Integer> linkedlist2 = new LinkedList<Integer>();
		linkedlist2.add(2);
		linkedlist2.add(4);
		linkedlist2.add(6);
		appender.printAppend(linkedlist2);
		
		LinkedList<Integer> linkedlist3 = new LinkedList<Integer>();
		appender.printAppend(linkedlist3);
		
		LinkedList<Integer> linkedlist4 = new LinkedList<Integer>();
		linkedlist4.add(111);
		linkedlist4.add(999);
		appender.printAppend(linkedlist4);
		
		LinkedList<Integer> linkedlist5 = new LinkedList<Integer>();
		linkedlist5.add(0);
		linkedlist5.add(-1);
		appender.printAppend(linkedlist5);
	}

}
