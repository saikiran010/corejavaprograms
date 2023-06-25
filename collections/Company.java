package collections;
import java.util.ArrayList;
import java.util.Iterator;
public class Company {

	int companyId;
	String companyName;
	ArrayList<Employee> emp;
	
	public Company(int companyId, String companyName,ArrayList<Employee> emp)
	{
		this.companyId=companyId;
		this.companyName=companyName;
		this.emp=emp;
		
	}
	@Override
	public String toString() {
		
		return " Company details [Company id="+companyId+",Company Name="+companyName+"employess="+emp+"]";
	}
	
	public static void main(String[] args) {
		ArrayList<Employee> empys=new ArrayList<Employee> ();
		empys.add(new Employee(101,"Saikiran","1-01-2000",1000));
		empys.add(new Employee(102,"Saikiran1","1-01-2001",2000));
		empys.add(new Employee(103,"Saikiran2","1-01-2002",3000));
		empys.add(new Employee(104,"Saikiran3","1-01-2003",4000));
		
		ArrayList<Employee> empysDel=new ArrayList<Employee> ();
		empysDel.add(new Employee(121,"akhil","1-01-2021",5000));
		empysDel.add(new Employee(122,"vishnu","1-01-2022",6000));
		empysDel.add(new Employee(123,"rakesh","1-01-2023",7000));
		empysDel.add(new Employee(124,"ajay","1-01-2023",8000));
		
		ArrayList<Company> companies=new ArrayList<Company>();
		companies.add(new Company(1,"infosys",empys));
		companies.add(new Company(2,"Deloite",empysDel));
		
		Iterator<Company> itr=companies.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		
	}
	
}
