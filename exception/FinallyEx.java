package exception;

public class FinallyEx {
    public static void main(String[] args)
    {
    	System.out.println("Case 1: where exception doesn't occur");
    	try {
    		String s1="123";
    		System.out.println(Integer.parseInt(s1));
    	}catch(NumberFormatException e) {
    		e.printStackTrace();
    	}
    	finally {
    		System.out.println("Finally executed in case 1");
    	}
    	System.out.println("------------------------");
    	System.out.println("Case 2: Where exception occurs and handled");
    	try {
    		String s2=null;
    		System.out.println(s2.length());
    	}catch(NullPointerException e) {
    		e.printStackTrace();
    	}
    	finally {
    		System.out.println("finally executed in case 2");
    	}
    	System.out.println("rest of lines..............");
    	System.out.println("-------------");
    	System.out.println("Case 3: Exception occurs but not handled :");
    	try {
    		int a=10/0;
    		System.out.println(a);
    	}catch(NullPointerException e) {
    		e.printStackTrace();
    	}
    	finally {
    		System.out.println("finally executed in case 3 ");
    	}
    	
    }
}
