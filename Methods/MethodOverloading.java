package Methods;
import java.util.Scanner;
public class MethodOverloading {
      public void area(int r) {
    	  System.out.println("the area of circle is :"+(3.14f*r*r));
      }
      public double area(double h,double b) {
    	  return 0.5*h*b;
      }
	public static void main(String[] args) {
		MethodOverloading find=new MethodOverloading();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter radius of the circle :");
		int radius=sc.nextInt();
		find.area(radius);
		System.out.println("Enter height and base of the triangle :");
		double height=sc.nextDouble();
		double base=sc.nextDouble();
		System.out.println("The area of the Triangle is :"+find.area(height, base));

	}

}
