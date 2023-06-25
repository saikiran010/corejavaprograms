package exception;

public class MultiCatchEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      //java 7 update
		try {
			int a[]=new int[5];
			a[7]=10/0;
			
		} catch (ArithmeticException | ArrayIndexOutOfBoundsException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

}
