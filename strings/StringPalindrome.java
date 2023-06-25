package strings;
import java.util.Scanner;
public class StringPalindrome {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter any word :");
		String s=sc.nextLine();
		int count=0;
		int i=0;
	    for(int j=s.length()-1;j>s.length()/2;j--) {
				if(s.charAt(i)!=s.charAt(j))
					count=0;
			    else
			    	count=1;
				i++;
		     }
		if(count==0)
			System.out.println("Not palindrome");
		else
			System.out.println("palindrome");
	}
}
