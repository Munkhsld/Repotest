package lab1;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class QueueExample {

	Queue<Integer> q = new LinkedList<>();

	public QueueExample(int[] values) {
		for (int value: values) {
			q.add(value);
		}
	}
	
	public Boolean isEmpty() {
		return q.isEmpty();
	}

	public int getHead() throws Exception {
		return q.element();
	}
	
	public int getSize() {
		return q.size();
	}

	public int removeHead() throws Exception {
		return q.remove();
	}
	
	public void insert(int value) {
		q.add(value);
	}
	
	
	public static void main(String[] args) {
		
		
		
		System.out.println("------------------------------------------------------------");
		System.out.println("Queue v1.0");
		System.out.print("Insert numbers with single space: ");
		Scanner in = new Scanner(System.in);
		String numbers = in.nextLine();
		
		String[] strArray = numbers.split(" ");
		int[] intArray = new int[strArray.length];

		for (int i=0;i<strArray.length;i++) {
			intArray[i] = Integer.valueOf(strArray[i]);
		}
		
		QueueExample q = new QueueExample(intArray);
		
		System.out.println(" The size of queue is: " + q.getSize());
		
		try {
			System.out.println(" The head of queue is: " + q.getHead());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(" The queue is empty.");
		}
		
		
		try {
			System.out.println(" Removing current head " + q.removeHead());
			System.out.println(" The new head is: " + q.getHead());
			System.out.println(" The size of queue is: " + q.getSize());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(" The queue is empty.");
		}
	}
	
}
