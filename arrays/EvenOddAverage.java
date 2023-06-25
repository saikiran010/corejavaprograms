package arrays;

import java.util.Scanner;

public class EvenOddAverage {
	static void calculate(int a[]) {
		int evenCount,evenSum,oddCount,oddSum;
		evenCount=evenSum=oddCount=oddSum=0;
		for(int i=0;i<a.length;i++) {
			if(a[i]%2==0) {
				evenCount++;
				evenSum=evenSum+a[i];
			}
			else {
				oddCount++;
				oddSum=oddSum+a[i];
			}
		}
		System.out.println("Even average :"+(evenSum/evenCount)+"\nOdd Average :"+(oddSum/oddCount));
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
