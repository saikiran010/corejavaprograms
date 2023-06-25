package junit;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestAge {
 
	@Test
	public void testCorrectAge() {
		Age obj=new Age();
		obj.setAge(19);
		
		assertTrue(obj.checkAge());
		//System.out.println(obj.getAge());
		
	}
	@Test
	public void testWrongAge() {
		Age obj=new Age();
		obj.setAge(17);
		
		assertFalse(obj.checkAge());
		obj.getAge();
	
  }

}
