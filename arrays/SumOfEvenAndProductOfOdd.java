package arrays;
import java.util.*;
public class SumOfEvenAndProductOfOdd {
	static void calculate(int a[]) {
		int evenSum=0,oddProduct=1;
		for(int i=0;i<a.length;i++) {
			if(a[i]%2==0)
				evenSum=evenSum+a[i];
			else
				oddProduct=oddProduct*a[i];
		}

		System.out.println("sum of even numbers in array : "+evenSum);
		System.out.println("product of odd numbers in array : "+oddProduct);
	}
	public static void main(String args[]) {
		int n;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size of the array : ");
		n=sc.nextInt();
		int a[]=new int[n];
		System.out.println("Enter "+n+" Elements : ");
		for(int i=0;i<n;i++)
			a[i]=sc.nextInt();
		calculate(a);
	}
}
