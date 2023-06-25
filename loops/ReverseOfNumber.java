package loops;

public class ReverseOfNumber {

	public static void main(String[] args) {
		int n=12345,r,sum=0,temp=n;
		while(n>0)
		{
			r=n%10;
			sum=r+sum*10;
			n=n/10;
		}
		System.out.println("Reverse of "+temp+" is "+sum);

	}

}
