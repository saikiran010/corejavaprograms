package basic;

import java.util.Scanner;

public class BasicSalary {

	long basicSalary,bonus;
	

	public BasicSalary(long basicSalary) {
		this.basicSalary = basicSalary;
	}
	
	public double bonus() {
		if(basicSalary>20000)
			return (0.17*basicSalary)+1500;
		else if(basicSalary>15000)
			return (0.15*basicSalary)+1200;
		else if(basicSalary>10000)
			return (0.12*basicSalary)+1000;
		else
			return (0.08*basicSalary)+500;
	}
	public static void main(String args[]) {
		long n;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter salary :");
		n=sc.nextLong();
		BasicSalary sal=new BasicSalary(n);
		if(n>32767)
			System.out.println("Number is too large");
		else if(n<0)
			System.out.println("Number is too small");
		else
			System.out.println("Bonus  :"+sal.bonus());
		
	}
	
	
	
}
