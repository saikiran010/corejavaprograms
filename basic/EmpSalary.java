package basic;
import java.util.Scanner;
public class EmpSalary {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter employee salary");
		int sal=sc.nextInt();
		System.out.printf("the tax amount : %.3f",(0.12*sal));
	}

}
