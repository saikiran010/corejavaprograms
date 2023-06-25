package java8features;

import java.util.ArrayList;

public class WithOutStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> list=new ArrayList<String>();
		list.add("Raj");
		list.add("Bhagyashree");
		list.add("Meera");
		list.add("Pravalika");
		list.add("Adhipurush");
		list.add("Raj");
		
		int count=0;
		for(String str : list) {
			
			if(str.length()>7)
				count++;			
		}
        System.out.println("There are "+count+" strings with length greater than 7");

	}

}
