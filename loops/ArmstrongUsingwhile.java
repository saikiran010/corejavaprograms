package loops;
import java.lang.Math;
public class ArmstrongUsingwhile {

	public static void main(String[] args) {
		int n=12,r,temp=n,x=0;
		double sum=0;
		while(temp>0) {
			x++;
			temp=temp/10;
		}
		temp=n;
		while(n>0) {
			r=n%10;
			sum= sum + Math.pow(r, x);
			n=n/10;
		}
		if(sum==temp)
			System.out.println("Given no. is armstrong");
		else
			System.out.println("Given no. is not Armstrong");

	}

}
