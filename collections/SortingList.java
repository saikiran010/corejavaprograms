package collections;

import java.util.ArrayList;
import java.util.Collections;
public class SortingList {

	public static void main(String[] args) {
		 
		ArrayList<String> list=new ArrayList<String>();
		
		list.add("Meena");
		list.add("Saikiran");
		list.add("Akhil");
		list.add("Madhu");
		list.add("Vishnu");
		
		Collections.sort(list);
		System.out.println("Sorting String list :");
		for(String str : list) {
			System.out.println(str);
		}
		
		ArrayList<Integer> list1=new ArrayList<Integer>();
		
		list1.add(24);
		list1.add(97);
		list1.add(63);
		list1.add(12);
		list1.add(35);
		
		Collections.sort(list1);
		
		System.out.println("\nSorting Integer list :");
		for(Integer str : list1) {
			System.out.println(str);
		}
		
	}

}
