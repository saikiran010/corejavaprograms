package Methods;
import java.util.Scanner;
public class DefaultMethod {
	int a,b;

   public void accept() {
	   Scanner sc=new Scanner(System.in);
	   System.out.println("Enter 2 numbers: ");
	   a=sc.nextInt();
	   b=sc.nextInt();
   }
   public void add() {
	   System.out.println("Add : "+(a+b));
   }
   public int sub() {
	   return a-b;
   }
    
   public static void main(String args[]) {
	   DefaultMethod method=new DefaultMethod();
	   method.accept();
	   method.add();
	   int result=method.sub();
	   System.out.println("sub : "+result);
   }
}
