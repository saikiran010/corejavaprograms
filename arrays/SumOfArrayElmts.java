package arrays;
import java.util.Arrays;
import java.util.Scanner;
public class SumOfArrayElmts {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n,sum=0,i;
		System.out.println("Enter size of the Array : ");
		n=sc.nextInt();
		int a[]=new int[n];
		System.out.println("Enter "+n+" elements");
		for(i=0;i<n;i++)
		    a[i]=sc.nextInt();
		//sum of array elements
		for(i=0;i<n;i++)
			sum=sum+a[i];
		System.out.println("The Sum of array elements is "+sum);
		}
	
}
