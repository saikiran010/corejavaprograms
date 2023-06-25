package Methods;
import java.util.Scanner;
public class Best {
	String custName,phoneNo;
	int noOfCalls;
	float bill;
	public void accept() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter customer name , phone number and no. of calls : ");
		custName=sc.nextLine();
		phoneNo=sc.nextLine();
		noOfCalls=sc.nextInt();
		
	}
	public void billing() {
	  if(noOfCalls<=100)
			bill=0;
	   else if(noOfCalls<=300)
			bill=noOfCalls*0.8f;
	   else if(noOfCalls<=500)
			bill=noOfCalls*1.25f;
	   else
			bill=noOfCalls*2.5f;
	 System.out.println("The final bill amount is : "+(bill+(0.12*bill)));
	  
	}
 public static void main(String args[]) {
	 Best calc=new Best();
	 calc.accept();
	 calc.billing();
 }

}
