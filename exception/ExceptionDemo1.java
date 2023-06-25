package exception;

public class ExceptionDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       try {
		
    	   int a=10/0;
    	   
	} catch (ArithmeticException e) {
		// TODO: handle exception
		e.printStackTrace();       //e is an object.It can be any type
		//System.out.println(e)
		//System.err.println(e)
	}
       
       System.out.println("Rest of code.......");
	}

}
