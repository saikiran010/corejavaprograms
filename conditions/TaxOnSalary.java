package conditions;
import java.util.Scanner;
public class TaxOnSalary {
   public static void main(String args[]) {
	   Scanner sc=new Scanner(System.in);
	   System.out.println("Enter Salary");
	   long s=sc.nextLong();
	   float tax;
	   if(s<50000)
		   tax=0.1f*s;
	   else
		   tax=0.15f*s;
	   System.out.println("the tax ammount is :"+tax);
   }
}
