package loops;

public class SumOf1to50EvenNums {
	public static void main(String args[]) {
		int sum=0;
		for(int i=1;i<=50;i++) {
			   sum=(i%2==0)?sum+i:sum;
		}
		System.out.println("Sum of 1 to 50 even number : "+sum);
	}

}
