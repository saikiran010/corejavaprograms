package collections;

import java.util.ArrayList;
import java.util.Iterator;

public class DaysOfWeek {

	public static void main(String[] args) {
		
		ArrayList<String> day=new ArrayList<> ();
		
		day.add("Monday");
		day.add("Tuesday");
		day.add("Wednesday");
		day.add("Thursday");
		day.add("Friday");
		day.add("Saturday");
		day.add("Sunday");
		
		System.out.println(day);
		
		System.out.println("Using Iterator :");
		Iterator<String> itr=day.iterator();
		while(itr.hasNext())
			System.out.println(itr.next());
		
		System.out.println("Using For Each loop :");
		for(String str: day)
			System.out.println(str);

	}

}
