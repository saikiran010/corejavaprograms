package loops;

public class PalindromeUsingWhile {

	public static void main(String[] args) {
		int n=152,r,sum=0,temp=n;
		while(n>0) {
			r=n%10;
			sum=r+sum*10;
			n=n/10;
		}
		if(sum==temp)
			System.out.println("Given no. is palindrome");
		else
			System.out.println("Given no. is not palindrome");

	}

}
