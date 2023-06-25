package loops;
import java.util.Scanner;
public class CubeNumSeries {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter nth value");
		int n=sc.nextInt();
		for(int i=1;i<=n;i++) {
				System.out.print((i*i*i)+" ");
		}
	}
}
