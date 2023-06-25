package collections;

import java.util.Queue;
import java.util.PriorityQueue;

public class PriorityQueueTest {

	public static void main(String[] args) {
	    
		Queue<String> queue=new PriorityQueue<String>();
		queue.add("Java");
		queue.offer("Python");
		queue.offer("Da");
		queue.offer("C++");
		queue.offer("Angular");
		queue.offer("Java");
	    //queue.add(null);  //NullPointerException
		
		for(String str: queue) {
			System.out.println(str);
		}
		System.out.println("\nHead of queue : "+queue.element());
		
		System.out.println("\n Removing element : "+queue.remove());//will throw Exception if queue is empty
		
		System.out.println("queue after removing element :");
		for(String str: queue) {
			System.out.println(str);
		}
		
		System.out.println("\nRemoving elemement : "+queue.poll()); // will return null if queue is empty
		System.out.println("queue after removing element :");
		for(String str: queue) {
			System.out.println(str);
		}
	}

}
