package junit;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CountATest {

	@Test
	public void test() {
		CountChar countChar=new CountChar();
		int count=countChar.countA("Priyanka");
		
		assertEquals(2,count);
	}

}

