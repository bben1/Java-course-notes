package Collections;

import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

public class QueueClass {

	public static void main(String[] args) {
		
		//The ArrayBlockingQueue is a queue that has a limited size (defined in brackets
		//Exceeding this size produces a run-time error
		Queue<Integer> queue1 = new ArrayBlockingQueue<Integer>(10);
		
		try {
			for(int i=1; i<10; i++) {
				queue1.add(i);
			}
		}
		catch(IllegalArgumentException e) {
			System.out.println("Tried to add too many items to the queue");
		}
		
		System.out.println(queue1);
		
		//peek() method
		System.out.println("\npeek() method returns: " + queue1.peek());
		System.out.println(queue1);
		//remove() method
		System.out.println("\nremove() method returns: " + queue1.remove());
		System.out.println(queue1);
		//size() method
		System.out.println("\nsize() method returns: " + queue1.size());
		System.out.println(queue1);

	}

}
