package collections;
import java.util.ArrayList;
import java.util.Iterator;
public class StudentArrayListEx {

	public static void main(String[] args) {
		  ArrayList<Student> stuList=new ArrayList<>();
		  stuList.add(new Student(101,"Vishnu",1));
		  stuList.add(new Student(102,"Akhila",2));
		  stuList.add(new Student(103,"Karthik",3));
		  stuList.add(new Student(104,"Madhu",4));
		  
		  Iterator itr=stuList.iterator();
		  while(itr.hasNext()) {
			  System.out.println(itr.next());
		  }

	}

}
