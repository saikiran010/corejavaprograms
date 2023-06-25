package java8features;
import java.util.Scanner;
@FunctionalInterface
interface Circle{
	//float PI=3.14f;
	public float area(float r);
}
public class AreaOfCircleUsingLambda {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter radius of Circle :");
		
		float n=sc.nextFloat();
		
		Circle a1=r->3.14f*r*r;
		System.out.println("Area of Circle is :" +a1.area(n));

	}

}
