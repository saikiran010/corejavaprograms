package arrays;

import java.util.Scanner;

public class MaxAndMin {
	static void calculate(int a[]) {
		int max=0,min=0;
		for(int i=0;i<a.length;i++) {
			if(a[i]>max)
				max=a[i];
			if(a[i]<min)
				min=a[i];
		}
		System.out.println("Highest value :"+max+"\nlowest value :"+min);
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter array size :");
		int n=sc.nextInt();
		int a[]=new int[n];
		System.out.println("Enter "+n+"  elements :");
		for(int i=0;i<n;i++)
           a[i]=sc.nextInt();
		calculate(a);
	}

}
