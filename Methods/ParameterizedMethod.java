package Methods;

import java.util.Scanner;

public class ParameterizedMethod {
   public void add(int a,int b)
   {
	   System.out.println("Add : "+(a+b));
   }
   public double sub(double x,double y) {
	   return x-y;
   }
   public static void main(String args[]) {
	   ParameterizedMethod method=new ParameterizedMethod();
	   Scanner sc=new Scanner(System.in);
	   System.out.println("Enter 2 numbers:");
	   int a=sc.nextInt();
	   int b=sc.nextInt();
	   method.add(a,b);
	   double p,q,result;
	   System.out.println("Enter 2 decimal numbers:");
	   p=sc.nextDouble();
	   q=sc.nextDouble();
	   result=method.sub(p,q);
	   System.out.println("sub : "+result);
   }
}

