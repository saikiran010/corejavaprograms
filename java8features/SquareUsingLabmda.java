package java8features;

import java.util.Scanner;
@FunctionalInterface
interface SquareInterface {

	public int square(int n);
}

public class SquareUsingLabmda {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int n = sc.nextInt();
		SquareInterface a1 = x -> x * x;
		System.out.println("Square : " + a1.square(n));

	}

}
