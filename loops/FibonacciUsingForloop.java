package loops;

public class FibonacciUsingForloop {

	public static void main(String[] args) {
		int fno=0,sno=1,third;
		System.out.print("The fibonacci series is :\n"+fno+" "+sno);
		for(int i=1;i<=10;i++) {
			third=fno+sno;
			System.out.print(" "+third);
			fno=sno;
			sno=third;
		}

	}

}
