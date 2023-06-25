package arrays;

import java.util.Scanner;

public class FrequencyOfEvenOdd {
	static void frequency(int a[]) {
		int countEven=0,countOdd=0;
		for(int i=0;i<a.length;i++) {
			if(a[i]%2==0)
				countEven++;
			else
				countOdd++;
		}
		System.out.println("Even count :"+countEven+"\nOdd count :"+countOdd);
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter array size :");
		int n=sc.nextInt();
		int a[]=new int[n];
		System.out.println("Enter "+n+"  elements :");
		for(int i=0;i<n;i++)
           a[i]=sc.nextInt();
		frequency(a);
	}

}
