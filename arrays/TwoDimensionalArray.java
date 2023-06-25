package arrays;
import java.util.Scanner;
import java.util.Arrays;
public class TwoDimensionalArray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter row size and column size : ");
		int m=sc.nextInt();
		int n=sc.nextInt();
		int [][]a=new int[m][n];
		System.out.println("Enter array Elements :");
		for(int i=0;i<m;i++) {
			for(int j=0;j<n;j++)
				a[i][j]=sc.nextInt();
		}
		System.out.println("The array is :");
		for(int i=0;i<m;i++) {
			for(int j=0;j<n;j++)
		        System.out.print(a[i][j]+" ");
			System.out.println();
		}
	}

}
