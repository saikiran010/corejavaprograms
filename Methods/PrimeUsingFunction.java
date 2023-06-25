package Methods;
import java.util.Scanner;
public class PrimeUsingFunction {
    static void prime() {
    	Scanner sc=new Scanner(System.in);
    	System.out.println("Enter a positive number : ");
    	int n=sc.nextInt();
    	int count=0;
    	for(int i=1;i<=n;i++) {
    		if(n%i==0)
    			count++;
    	}
    	if(count==2)
    		System.out.println(n+" is Prime Number");
    	else
    		System.out.println(n+" is not a Prime Number");
    	
    }
	public static void main(String[] args) {
		//PrimeUsingFunction calc=new PrimeUsingFunction();
		//calc.prime();
		prime();
		}

}
