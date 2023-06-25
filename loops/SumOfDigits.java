package loops;
public class SumOfDigits {
	public static void main(String[] args) {
		int n=124,r,sum=0,temp=n;
		while(n>0)
		{
			r=n%10;
			sum=sum+r;
			n=n/10;
		}
		System.out.println("Sum of digits of "+temp+" is "+sum);
	}
}
