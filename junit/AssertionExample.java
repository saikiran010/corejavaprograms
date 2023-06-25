package junit;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNotSame;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class AssertionExample {
    
	@Test
	public void testAssertion() {
		String s1=new String("Raj");
		String s2=new String("Raj");
		String s3="Welcome";
		String s4="Welcome";
		String s5=null;
		
		int a=10;
		int b=10;
		
		assertEquals(s1,s2);
		
		assertTrue(a==b);
		
		assertFalse(a>b);
		
		assertSame(s3,s4);
		
		assertSame(s3,s4);
		
		assertNotSame(s4,s5);
		
		assertNull(s5);
		
		assertNotNull(s4);
		
		String str1[]= {"one","two","three"};
		String str2[]= {"one","two","three"};
		
		assertArrayEquals(str1,str2);
	}
}
