package basic;
import java.util.Scanner;
public class SimpleInterest {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		//float s;
		System.out.print("enter principle amount :");
		int p=sc.nextInt();
		System.out.print("enter time period :");
		int t=sc.nextInt();
		System.out.print("enter rate of interest :");
		int r=sc.nextInt();
		System.out.print("the simple interest is :"+((p*t*r)/100.0));
	}

}
