package collections;
import java.util.ArrayDeque;
import java.util.Deque;
public class ArrayDequeTest {

	public static void main(String[] args) {
		 
		Deque<String> deque=new ArrayDeque<String>();
		deque.add("Coffee");
		deque.offer("Tea");
		deque.offer("Ice-cream");
		deque.offer("Pastry");
		deque.offer("Tea");
		deque.offerFirst("Burger");
		deque.offerLast("Samosa");
		
		for(String str: deque) {
			System.out.println(str);
		}
		
		System.out.println("\n Removing last element :");
		deque.pollLast();
		
		for(String str: deque) {
			System.out.println(str);
		}
		
		System.out.println("\n Removing 1st element :");
		deque.pollFirst();
		for(String str: deque) {
			System.out.println(str);
		}

	}

}
