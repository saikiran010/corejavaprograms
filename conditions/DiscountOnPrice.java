package conditions;
import java.util.Scanner;
public class DiscountOnPrice {
   public static void main(String args[]) {
	   Scanner sc=new Scanner(System.in);
	   System.out.println("Enter purchase Amount :");
	   int amount=sc.nextInt();
	   float discount;
	   if(amount>=10000)
		   discount=0.1f*amount;
	   else
		   discount=0.02f*amount;
	   System.out.println("The Discount is :"+discount);
	   
   }
}
