package basic;
import java.util.Scanner;
public class AreaUsingMethod {
	int n;
	
	public void accept() {
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
	}
   public void circle() {
	 System.out.println("the area of the circle is : "+((22.0/7.0)*n*n));  
   }
   public int square() {
	  return n*n; 
   }
   public void triangle(int h,int b) {
	 System.out.println("the area of the triangle : "+(0.5*h*b)); 
   }
   public int rectangle(int l,int b) {
	   return l*b; 
   }
   public static void main(String args[]) {
	   Scanner sc=new Scanner(System.in);
	   AreaUsingMethod area=new AreaUsingMethod();
	   System.out.println("enter radius of circle : ");
	   area.accept();
	   area.circle();
	   System.out.println("enter length of square : ");
	   area.accept();
	   int result=area.square();
	   System.out.println("the area of the square : "+result);
	   System.out.println("enter height and base of a triangle : ");
	   int h=sc.nextInt();
	   int b=sc.nextInt();
	   area.triangle(h,b);
	   System.out.println("enter length and width of a triangle : ");
	   int l=sc.nextInt();
	   int w=sc.nextInt();
	   System.out.println("the area of the rectangle is : "+area.rectangle(l, b));
   }
}
