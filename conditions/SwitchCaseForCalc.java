package conditions;
import java.util.Scanner;
public class SwitchCaseForCalc {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter two numbers : ");
		int a=sc.nextInt();
		int b=sc.nextInt();
		System.out.println("Enter + or - or * or /");
		char c=sc.next().charAt(0);
		switch(c) {
		case '+':
			System.out.println("Addition : "+(a+b));
			break;
		case '-':
			System.out.println("Substraction : "+(a-b));
			break;
		case '*':
			System.out.println("Multiplication : "+(a*b));
			break;
		case '/':
			System.out.println("divison : "+(a/b));
			break;
		default:
			System.out.println("Enter omly + or - or * or /");
			
		}

	}

}
