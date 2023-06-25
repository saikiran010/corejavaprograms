package loops;
import java.util.Scanner;
import java.math.*;
public class DoWhileForDiffProblems {
	int n;
	public DoWhileForDiffProblems(int num) {
		n=num;
	}
	public void evenOrOdd() {
			if(n%2==0)
			System.out.println(n+" is Even Number");
		else
			System.out.println(n+" is Odd Number");
	}
	public void positiveOrNegative() {
		if(n>0)
			System.out.println(n+" is Positive number");
		else if(n<0)
			System.out.println(n+" is Positive number");
		else
			System.out.println("the entered number is "+n);
	}
    public void palindrome() {
    	int temp=n,sum=0;
		while(temp>0) {
			int r=temp%10;
			sum=r+sum*10;
			temp=temp/10;
		}
		if(sum==n)
			System.out.println(n+" is Polindrome");
		else
			System.out.println(n+" is Not Polindrome");
    }
    public void armstrong() {
        double sum=0;
        int x=0,temp=n;
        while(n>0) {
            x++;
        	n=n/10;
        }
        n=temp;
    	while(n>0) {
    		int r=n%10;
    		sum=sum+Math.pow(r,x);
            n=n/10;
    	}
    	if(sum==temp) {
    		System.out.println(temp+" is a Armstrong number");
    	}
    	else
    		System.out.println(temp+" is not a ArmStrong number");
    	
    }
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int n=sc.nextInt();
		char ch;
		DoWhileForDiffProblems is=new DoWhileForDiffProblems(n);
		do {
	    is.positiveOrNegative();
		if(n>0) {
		is.evenOrOdd();
		is.palindrome();
		is.armstrong();
		}
		System.out.println("Do you want to continue enter (y/s)");
		ch=sc.next().charAt(0);
		}while(ch=='y' || ch=='Y');
	}

}
