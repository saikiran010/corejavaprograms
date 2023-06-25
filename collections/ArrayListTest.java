package collections;
import java.util.ArrayList;
import java.util.Iterator;
public class ArrayListTest {
  public static void main(String args[]) {
	  ArrayList list=new ArrayList();
	  list.add("Saikiran");
	  list.add(5);
	  list.add(null);
	  list.add(true);
	  list.add(5.5);
	  
	  System.out.println(list);
	  
	  ArrayList<String> list2=new ArrayList<>();
	  
	  list2.add("Vishnu");
	  list2.add("Akhila");
	  list2.add("karthik");
	  list2.add("Ravalika");
	  
	  System.out.println(list2);
	  
	  ArrayList<Integer> list3=new ArrayList<>();
	  
	  list3.add(13);
	  list3.add(05);
	  list3.add(2000);
	  list3.add(2001);
	  
	  System.out.println(list3);
	  
	  System.out.println(" Using Iterator ");
	  Iterator<String> itr=list2.iterator();
	  while(itr.hasNext()) {
		  System.out.println(itr.next());
	  }
	  System.out.println("Using for each loop :");
	  for(Integer items : list3) {
		  System.out.println(items);
	  }
  }
}
