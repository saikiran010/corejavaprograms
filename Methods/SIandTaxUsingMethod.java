package Methods;
import java.util.Scanner;
public class SIandTaxUsingMethod {
   public double simpleInterest(int p,int t,int r) {
	   return ((p*t*r)/100.0);
   }
   public double tax(int s){
	   return (0.12*s);
   }
   public static void main(String args[]) {
	   Scanner sc=new Scanner(System.in);
	   SIandTaxUsingMethod cal=new SIandTaxUsingMethod();
	   System.out.println("Enter principle amount,timeperiod and rate of interest : ");
	   int p=sc.nextInt();
	   int t=sc.nextInt();
	   int r=sc.nextInt();
	   System.out.println("the simple interest is : "+cal.simpleInterest(p,t,r));
	   System.out.println("Enter employee salary :");
	   int s=sc.nextInt();
	   System.out.println("the tax amount to the salary is : "+cal.tax(s));
   }
}
