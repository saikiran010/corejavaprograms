package relationship;

public class Employee extends Person {
	double workingDays,perDay,salary;
	public Employee() 
	{
		super();
		workingDays=20;
		perDay=2000;
	}
	public Employee(int  id,String name,MyDate birthDate,double workingDays,double perDay) {
		super(id,name,birthDate);
		this.workingDays=workingDays;
		this.perDay=perDay;
	}
	public void calculate() {
		salary=workingDays*perDay;
	}
	//@override
	public void display() {
		super.display();
		System.out.println("Salay : "+salary);
	}
}
