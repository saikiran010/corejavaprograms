package relationship;

public class Student extends Person {
	
	double phy,chem,maths,total,percent;
	Person s1;
	  public Student() {
		  phy=50;
		  chem=60;
		  maths=70;
		  s1=new Person();
	  }
	
	  public Student(double phy,double chem,double maths,Person s1 ) {
		  this.phy=phy;
		  this.chem=chem;
		 this.maths=maths;
		 this.s1=s1;
	  }
	  public void calculate() {
		  total=phy+chem+maths;
		  percent=total/3;
	  }

	public void display() {
		  
		  s1.display();
		  System.out.println("total :"+total+"\npercent :"+percent);
	  }

}
