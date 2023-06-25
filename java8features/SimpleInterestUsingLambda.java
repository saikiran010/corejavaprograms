package java8features;
import java.util.Scanner;
@FunctionalInterface
interface SI{
	public float simpleInterest(float p,float n,float r);
}
public class SimpleInterestUsingLambda {

	public static void main(String[] args) {
		  
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter principle amount :");
		float p=sc.nextFloat();
		System.out.println("Enter time period :");
		float n=sc.nextFloat();
		System.out.println("Enter rate of interest :");
		float r=sc.nextInt();
		
		SI a1=(x,y,z)->(x*y*z)/100;
		
		System.out.println("Simple interest is :"+a1.simpleInterest(p, n, r));
	}

}
