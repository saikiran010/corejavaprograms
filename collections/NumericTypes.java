package collections;

import java.util.ArrayList;
import java.util.Iterator;
public class NumericTypes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 
		  ArrayList<Number> num=new ArrayList<> ();
		  num.add(12);
		  num.add(12.14f);
		  num.add(99787546671647364L);
		  num.add(1234.67987467d);
		  num.add((byte)7);
		  
		  System.out.println("Displaying elements using Iterator :");
		  
		  Iterator<Number> itr=num.iterator();
		  
		  while(itr.hasNext()) {
			  System.out.println(itr.next());
		  }
		  

	}

}
