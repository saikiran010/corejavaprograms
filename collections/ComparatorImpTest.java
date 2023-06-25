package collections;

import java.util.Comparator;
import java.util.ArrayList;
import java.util.Collections;

class AgeComparator implements Comparator<Student>{

	@Override
	public int compare(Student s1, Student s2) {
		if(s1.age==s2.age)
		return 0;
		else if(s1.age>s2.age)
			return 1;
		else
			return -1;
	}
	
}
class NameComparator implements Comparator<Student>{

	@Override
	public int compare(Student s1, Student s2) {
		return s1.name.compareTo(s2.name);
	}

}
public class ComparatorImpTest {

	public static void main(String[] args) {
		  
       ArrayList<Student> list=new ArrayList<Student>();
       list.add(new Student(101,"Saikiran",26));
       list.add(new Student(102,"Akhil",32));
       list.add(new Student(103,"Vijay",25));
       list.add(new Student(104,"Ganesh",20));
       list.add(new Student(105,"Madhu",31));
       
       System.out.println("\nSorting on the basis of age : ");
       
       Collections.sort(list,new AgeComparator());
       
       for(Student s1 : list)
    	   System.out.println(s1);
       
 System.out.println("\nSorting on the basis of name : ");
       
       Collections.sort(list,new NameComparator());
       
       for(Student s1 : list)
    	   System.out.println(s1);
       
       
	}

}
