package conditions;
import java.util.Scanner;
public class BillAmount {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int noOfCalls,bill;
		System.out.println("enter no of calls :");
		noOfCalls=sc.nextInt();
		if (noOfCalls<200)
			bill=noOfCalls*1;
		else
			bill=noOfCalls*3;
		System.out.println("Bill amount :"+bill);

	}

}
