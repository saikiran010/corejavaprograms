package junit;

import static org.junit.Assert.*;

import org.junit.Test;

public class testLogin {

	@Test
	public void testCorrect() {
		LoginCheck obj=new LoginCheck();
		obj.setCredentials("admin","admin123");
		
		assertTrue(obj.check());
		//System.out.println(obj);
	}
	@Test
	public void testWrong() {
		LoginCheck obj=new LoginCheck();
		obj.setCredentials("saikiran","saikiran1245");
		
		assertFalse(obj.check());
	}

}
