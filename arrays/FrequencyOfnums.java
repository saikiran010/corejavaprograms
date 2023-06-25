package arrays;
import java.util.Scanner;
public class FrequencyOfnums {
     static void frequency(int a[]) {
    	 int countPositive,countNegative,countZero;
    	 countPositive=countNegative=countZero=0;
    	 for(int i=0;i<a.length;i++) {
    		 if(a[i]>0)
    			 countPositive++;
    		 else if(a[i]<0)
    		     countNegative++;
    		 else
    			 countZero++;	 
    	 }
    	 System.out.println("no. of +ve nums :"+countPositive);
    	 System.out.println("no. of -ve nums :"+countNegative);
    	 System.out.println("no. of +ve nums :"+countZero);
     }
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter array size :");
		int n=sc.nextInt();
		int a[]=new int[n];
		System.out.println("Enter "+n+"  elements :");
		for(int i=0;i<n;i++)
           a[i]=sc.nextInt();
		frequency(a);
	}

}
