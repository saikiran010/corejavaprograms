package junit;

import org.junit.After;
import org.junit.Before;

public class Age {
     
	int age;

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	boolean checkAge() {
		if(age>=18)
			return true;
		else
			return false;
	}	
	
}
