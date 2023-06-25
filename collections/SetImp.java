package collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class SetImp {

	public static void main(String[] args) {
	   HashSet<String> set=new HashSet<String> ();
	   set.add("Manago");
	   set.add("Grapes");
	   set.add("Apples");
	   set.add("Manago");
	   set.add(null);
	 System.out.println("\nImplimenting HashSet:");
	 for(String fruits : set)
		 System.out.println(fruits);
	
      LinkedHashSet<String> set1=new LinkedHashSet<String>();
      set1.add("Rose");
      set1.add("Jasmin");
      set1.add("Lilly");
      set1.add("Rose");
      set1.add(null);
      System.out.println("\nImplimenting LinkedHashSet:");
      for(String flowers : set1)
 		 System.out.println(flowers);
      
      TreeSet<String> set3=new TreeSet<String> ();
      set3.add("raj");
      set3.add("sai");
      set3.add("vish");
      set3.add("akhi");
      set3.add("raj");
      //set3.add(null); throws NullPointerException
      System.out.println("\nImplimenting TreeSet:");
 	 for(String names : set3)
 		 System.out.println(names);
      
	}

}
