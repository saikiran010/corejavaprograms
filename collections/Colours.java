package collections;

import java.util.ArrayList;
import java.util.Iterator;

public class Colours {

public static void main(String[] args) {
		
		ArrayList<String> colors=new ArrayList<> ();
		
		colors.add("Red");
		colors.add("Blue");
		colors.add("Green");
		colors.add("Yellow");
		
		
		System.out.println(colors);
		
		System.out.println("Using Iterator :");
		Iterator<String> itr=colors.iterator();
		while(itr.hasNext())
			System.out.println(itr.next());
		
		System.out.println("Using For Each loop :");
		for(String str: colors)
			System.out.println(str);

	}
}
