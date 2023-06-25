package abstraction;
import java.util.Scanner;
public class TestBank {
   public static void main(String args[]) {
	   Scanner sc=new Scanner(System.in);
	   float pAmount,years,rateSbi,rateHdfc;
	   System.out.println("Enter PAmount and No. of years :");
	   pAmount=sc.nextFloat();
	   years=sc.nextFloat();
	   Bank b=new Sbi();
	   rateSbi=b.getRateOfInterest();
	   float siOfSbi=(pAmount*years*rateSbi)/100;
	   System.out.println("the simple interest of sbi bank :"+siOfSbi);
	   Bank b1=new Hdfc();
	   rateHdfc=b1.getRateOfInterest();
	   float siOfHdfc=(pAmount*years*rateHdfc)/100;
	   System.out.println("the simple interest of sbi bank :"+siOfHdfc);
   }
}
