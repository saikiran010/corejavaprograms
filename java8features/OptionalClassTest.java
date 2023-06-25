package java8features;

import java.util.Optional;

public class OptionalClassTest {

	public static void main(String[] args) {
		   
		String str[]=new String[10];
		//str[10]="this is Optional class";
		
	    Optional<String> optional=Optional.ofNullable(str[5]);
	    if(optional.isPresent())
	    {
	    	String upperCase=str[5].toUpperCase();
	    	System.out.println(upperCase);
	    }
	    else
	    	System.out.println("String is not present at 5th position");

	}

}
