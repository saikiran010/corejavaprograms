package java8features;

import java.util.ArrayList;
import java.util.Collections;

public class ForEachMethod {

	public static void main(String[] args) {
		  
		ArrayList<String> list=new ArrayList<String>();
		list.add("Red");
		list.add("Blue");
		list.add("Green");
		list.add("White");
		list.add("Brown");
		
		System.out.println(list);
		
		Collections.sort(list);
		
		System.out.println("\nUsing For Each method : ");
		list.forEach(str->System.out.println(str));

	}

}
