package arrays;

import java.util.Arrays;
import java.util.Scanner;
public class AscendingAndDescending {
	static void ascOrder(int a[]) {
		int temp;
		for(int i=0;i<5;i++) {
			for(int j=i+1;j<5;j++) {
				if(a[i]>a[j]) {
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		for(int i=5;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]<a[j]) {
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		System.out.println("Ascending 1st 5 elements& Descending remaining :"+Arrays.toString(a));
	}
  public static void main(String args[]) {
	  Scanner sc=new Scanner(System.in);
	  System.out.println("Enter size of array : ");
	  int n=sc.nextInt();
	  int a[]=new int[n];
	  System.out.println("Enter "+n+" elements : ");
	  for(int i=0;i<n;i++)
	      a[i]=sc.nextInt();
	  ascOrder(a);
  }
}

