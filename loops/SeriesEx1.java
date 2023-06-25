package loops;

import java.util.Scanner;

public class SeriesEx1 {
	
		public static void main(String args[]) {
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter nth value");
			int n=sc.nextInt();
			int sum=0;
			for(int i=1;i<=n;i++) {
			       sum=sum+(i*(i+1));
			       System.out.print(i+"*"+(i+1));
			       if(i==n) {
			    	 System.out.println("="+sum);
			    	 break;
			       }
			       System.out.print("+");
			}
       }
}
