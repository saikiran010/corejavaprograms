package conditions;
import java.util.Scanner;
public class LicenseEligible {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter age :");
        int age=sc.nextInt();
        if(age>18)
        	System.out.println("Eligible");
        else
        	System.out.println("not eligible");
	}

}
