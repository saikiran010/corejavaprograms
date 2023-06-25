package collections;

import java.util.LinkedList;

public class LinkedListTest {

	public static void main(String[] args) {
		
		LinkedList<String> list=new LinkedList<>();
		
		list.add("String1");
		list.add("String2");
		list.add("String3");
		list.add(null);
		
		for(String str : list)
			System.out.println(str);
		
		

	}

}
