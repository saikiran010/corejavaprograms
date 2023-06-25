package collections;

public class Student {
  int rollNo;
  String name;
  int age;
    
  public Student(int rollNum,String name,int age) {
	  
	  this.rollNo=rollNum;
	  this.name=name;
	  this.age=age;
  }

@Override
public String toString() {
	return "Student [rollNo="+rollNo+",Name= "+name+",age="+age+"]";
}
  
  
}
