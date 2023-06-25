package exception;

public class ThrowDemo {
	public static void checkAge(int age) {
		if(age<18)
			throw new ArithmeticException("age is not valid");
		else
			System.out.println("Eligible");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
		checkAge(2);
		}
		catch(ArithmeticException e) {
			e.printStackTrace();
		}
      System.out.println("rest of code...");
	}


}
