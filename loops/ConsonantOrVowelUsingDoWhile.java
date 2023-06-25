package loops;
import java.util.Scanner;
public class ConsonantOrVowelUsingDoWhile {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		char ch;
		do {
		System.out.println("Enter a alphabet :");
		char c=sc.next().charAt(0);
		switch(c) {
		case 'a':
			System.out.println("Vowel");
			break;
		case 'e':
			System.out.println("Vowel");
			break;
		case 'i':
			System.out.println("Vowel");
			break;
		case 'o':
			System.out.println("Vowel");
			break;
		case 'u':
			System.out.println("Vowel");
			break;
		default:
			System.out.println("Consonant");
		}
		System.out.println("Do you want to continue(y/n)");
		ch=sc.next().charAt(0);
		}while(ch=='y' || ch=='Y');
	}

}

