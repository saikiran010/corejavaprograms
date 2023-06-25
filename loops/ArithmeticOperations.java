package loops;
import java.util.Scanner;
public class ArithmeticOperations {
		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter two numbers : ");
			int a=sc.nextInt();
			int b=sc.nextInt();
			char ch;
			do {
			System.out.println("Enter + or - or * or /");
			char c=sc.next().charAt(0);
			switch(c) {
			case '+':
				System.out.println(a+" + "+b+" = "+(a+b));
				break;
			case '-':
				System.out.println(a+" - "+b+" = "+(a-b));
				break;
			case '*':
				System.out.println(a+" * "+b+" = "+(a*b));
				break;
			case '/':
				System.out.println(a+" / "+b+" = "+(a/b));
				break;
			default:
				System.out.println("no calculation");
			}
			System.out.println("Do you want to continue(y/n)");
			ch=sc.next().charAt(0);
			}while(ch=='y' || ch=='Y');
	}
}
