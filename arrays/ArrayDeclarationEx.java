package arrays;
import java.util.Arrays;
import java.util.Scanner;
public class ArrayDeclarationEx {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size of the Array : ");
		int n=sc.nextInt();
		int a[]=new int[n];
		System.out.println("Enter "+n+" elements");
		for(int i=0;i<n;i++)
		    a[i]=sc.nextInt();
		System.out.println("the array is :"+Arrays.toString(a));
		}

}
