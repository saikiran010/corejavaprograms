package collections;

import java.util.Vector;
import java.util.Enumeration;
public class VectorTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Vector<String> list=new Vector<String>();
		
		list.add("String1");
		list.add("String3");
		list.add("String5");
		list.add(null);
		
		Enumeration<String> enums=list.elements();
		
		while(enums.hasMoreElements()) {
			
			System.out.println(enums.nextElement());
		}

	}

}
