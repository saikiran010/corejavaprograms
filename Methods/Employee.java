package Methods;
import java.util.Scanner;
public class Employee {
   String empName;
   int empCode;
   int basicSalary;
   float allowance;
   float grossSalary;
   float tax;
   float netSalary;
   /* public Employee(String name,int code,int salary) {
    	 empName=name;
    	 empCode=code;
    	 basicSalary=salary;
     }*/
     public void accept() {
    	Scanner sc=new Scanner(System.in);
    	System.out.println("Enter emp name,code and salary : ");
    	empName=sc.nextLine();
    	empCode=sc.nextInt();
    	basicSalary=sc.nextInt();
     }
     public void allow() {
    	 allowance= basicSalary*(0.55f);
     }
     public void gross() {
    	grossSalary=basicSalary+allowance; 
     }
     public void tax() {
    	 tax= 0.12f*grossSalary;
     }
     public void net() {
    	 netSalary=grossSalary-tax;
     }
     public void display() {
    	System.out.println("---- Employee salary slip ----");
    	System.out.println("Employee Code : "+empCode+"\nEmployee Name : "+empName);
    	System.out.println("Basic Salary :"+basicSalary+"\n tax :"+tax+"\n Net salary :"+netSalary);
     }
     public static void main(String[] args) {
    	 Employee obj=new Employee();
    	 obj.accept();
    	 obj.allow();
    	 obj.gross();
    	 obj.tax();
    	 obj.net();
    	 obj.display();
     }
}
