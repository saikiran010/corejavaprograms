package relationship;

public class Grade extends Student{
	String grade;
	Student s1;
	public Grade() {
		super();
		grade="";
	}
	public Grade(double phy, double chem, double maths,Person s1) {
		super(phy, chem, maths,s1);
	}
	public void calculate() {
		super.calculate();
		if(percent>90)
			grade="A";
		else if(percent>80)
			grade="B";
		else if(percent>70)
			grade="C";
		else if(percent>=60)
			grade="D";
		else
			grade="E";
	}
	public void display() {
		super.display();
		System.out.println("Grade :"+grade);
	}
	
	public static void main(String args[])
	{
		Grade p1=new Grade();
		p1.calculate();
		p1.display();
		
		System.out.println("------------------------");
		Grade p2=new Grade(91,80,90,new Person(102,"Akhil",new MyDate(10,5,2002)));
		p2.calculate();
		p2.display();
		
	}
}
