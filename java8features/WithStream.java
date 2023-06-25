package java8features;

import java.util.ArrayList;
import java.util.stream.Stream;

public class WithStream {

	public static void main(String[] args) {
		   
		ArrayList<String> list=new ArrayList<String>();
		list.add("Raj");
		list.add("Bhagyashree");
		list.add("Meera");
		list.add("Pravalika");
		list.add("Adhipurush");
		list.add("Raj");
		
		long count=list.stream().filter(str->str.length()>7).count();
		
		/*Stream<String> names=list.stream();  //Stream creation
		
		Stream<String> longNames=names.filter(str->str.length()>7);  // intermediate operation
		
		long count=longNames.count();    //terminal operation*/
		
		System.out.println("There are "+count+" strings with length greater than 7");
		

	}

}
