package loops;
import java.util.Scanner;
public class DoWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner sc=new Scanner(System.in);
       int a,b;
       char ch;
       do {
    	   System.out.println("Enter two number for addition : ");
    	   a=sc.nextInt();
    	   b=sc.nextInt();
    	   System.out.println(a+" + "+b+" = "+(a+b));
    	   System.out.println("Do you want to continue enter(y/n)");
    	   ch=sc.next().charAt(0);
    	   if(ch!='y')
    		   System.out.println("Close....!");
       }while(ch=='y' || ch=='Y');
	}

}
