package loops;
import java.util.Scanner;
public class AreaUsingDoWhile {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		char ch;
		do {
		System.out.println("Enter 1 for circle area\n\t2 for triangle area\n\t3 for recatangle area");
		int n=sc.nextInt();
		switch(n) {
		case 1:
			System.out.println("Enter radius of the cicle : ");
			int r=sc.nextInt();
			System.out.println("The area of the circle is :"+(3.14*r*r));
			break;
		case 2:
			System.out.println("Enter height and base of the triangle : ");
			double h=sc.nextDouble();
			double b=sc.nextDouble();
			System.out.println("The area of the triangle is :"+(0.5*h*b));
			break;
		case 3:
			System.out.println("Enter length and breadth of the rectangle : ");
			int l=sc.nextInt();
			int w=sc.nextInt();
			System.out.println("The area of the triangle is :"+(l*w));
			break;
		default:
			System.out.println("Enter only 1 2 and 3 ");
		}
		System.out.println("Do you want to continue(y/n)");
		ch=sc.next().charAt(0);
	}while(ch=='y' || ch=='Y');
	}

}