package relationship;

public class TestEmployee {
    public static void main(String args[]) {
    	Employee emp=new Employee();
    	emp.calculate();
    	emp.display();
    	System.out.println("--------------------------");
    	Employee emp2=new Employee(102,"Saikiran2",new MyDate(30,5,2000),17,1700);
    	emp2.calculate();
    	emp2.display();
    }
}
