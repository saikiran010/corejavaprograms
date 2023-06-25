package loops;

import java.util.Scanner;

public class OddNumSquare {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter nth value");
		int n=sc.nextInt();
		System.out.println("The Odd number Series is :");
		for(int i=1;i<=n;i++) {
			if(i%2==1)
				System.out.print((i*i)+" ");
		}
	}
}
