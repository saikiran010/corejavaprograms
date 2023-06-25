package conditions;
import java.util.Scanner;
public class SwitchQue3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter : 1 for finding even or odd\n\t2 for finding +ve or -ve number :");
		int x=sc.nextInt();
		switch(x) {
		case 1:
			System.out.println("Enter a Positive number : ");
			int a=sc.nextInt();
			if(a%2==0)
				System.out.println("Even number");
			else
				System.out.println("Odd number");
		case 2:
			 System.out.println("enter a number :");
	    	 int n=sc.nextInt();
	    	 if(n>0)
	    		 System.out.println("Positive Number");
	    	 else if(n<0)
	    		 System.out.println("Negative Number");
	    	 else
	    		 System.out.println("Entered Number is Zero");
		}

	}

}
