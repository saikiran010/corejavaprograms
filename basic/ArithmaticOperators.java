package basic;
import java.util.Scanner;
public class ArithmaticOperators {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter two numbers");
		int a=sc.nextInt();
		int b=sc.nextInt();
		System.out.println("addition of two numbers is "+(a+b));
		System.out.println("substraction of two numbers is "+(a-b));
		System.out.println("division of two numbers is "+(a/b));
		System.out.println("multiplication of two numbers is "+(a*b));
		System.out.println("modulo of two numbers is "+(a%b));
		sc.close();
	}

}
