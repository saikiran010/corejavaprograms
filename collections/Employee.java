package collections;

public class Employee {
	int empId;
	String empName;
    String joiningDate;
    float salary;
   public Employee(int id,String name,String date,float sal) {
	   
	   empId=id;
	   empName=name;
	   joiningDate=date;
	   salary=sal;
   }
   
   @Override
   public String toString() {
	   return "Emp [empId="+empId+",empName="+empName+",DateOfJoining="+joiningDate+",salary="+salary+"]";
   }
}
