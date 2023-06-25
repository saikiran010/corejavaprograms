package arrays;

import java.util.*;

public class PrintEvenOfArray {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n,i;
		System.out.println("Enter size of the Array : ");
		n=sc.nextInt();
		int a[]=new int[n];
		System.out.println("Enter "+n+" elements");
		for(i=0;i<n;i++)
		    a[i]=sc.nextInt();
		//print even elements
		System.out.println("The even elements of array are : ");
		for(i=0;i<n;i++) {
			if(a[i]%2==0)
				System.out.println(a[i]);
		}
		}
}
