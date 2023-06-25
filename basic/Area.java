package basic;
import java.util.Scanner;
public class Area {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		//Area of the Circle
		System.out.println("enter radius of the circle:");
		int r=sc.nextInt();
		double cir=(22.0/7.0)*r*r;
		System.out.println("Area of the circle is : "+cir);
		//Area of the Rectangle
		System.out.println("enter length of the Rectangle :");
		int l=sc.nextInt();
		System.out.println("enter breadth of the Rectangle :");
		int w=sc.nextInt();
		System.out.println("Area of the Rectangle is : "+(l*w));
		//Area of the triangle
		System.out.println("enter height of the triangle :");
		int h=sc.nextInt();
		System.out.println("enter base of the triangle :");
		int b=sc.nextInt();
		System.out.println("Area of the triangle :"+(0.5*h*b));
	}

}
