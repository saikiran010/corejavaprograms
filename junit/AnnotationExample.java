package junit;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

public class AnnotationExample {

		
		@BeforeClass
		public static void beforeClass() {
			System.out.println("beforeClass : Will execute before all methods");
			
		}
		@AfterClass
		public static void afterClass() {
			System.out.println("afterClass : Will execute after all methods");
		}
		@Before
		public void before() {
			System.out.println("before : execute before a methods");
		}
		@After
		public void after() {
			System.out.println("after : execute after a methods");
		}
		@Test
		public void test() {
			System.out.println("Inside test");
		}
		@Ignore
		public void ignore() {
			System.out.println("Inside ignore");
		}

	}


