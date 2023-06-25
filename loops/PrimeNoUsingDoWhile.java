package loops;
import java.util.Scanner;
public class PrimeNoUsingDoWhile {
	    static int prime(int n,int count) {
	    	for(int i=1;i<=n;i++) {
	    		if(n%i==0)
	    			count++;
	    	}
	    	return count;
	    }
	public static void main(String[] args) {
	  Scanner sc=new Scanner(System.in);
	  char ch;
	  do {
		  System.out.println("Enter a number : ");
		  int n=sc.nextInt();
		  int count=0;
        int result=prime(n,count);
        if(result==2)
        	System.out.println(n+" is a prime number ");
        else
        	System.out.println(n+" is a not prime number ");
        System.out.println("Do you want to continue(y/n)");
		ch=sc.next().charAt(0);
		}while(ch=='y' || ch=='Y');
	}

}
