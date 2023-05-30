import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class CalculatorTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}
	
	@Test
	public void testAdd() {
		//fail("Not yet implemented");
		int a = 1234;
		int b = 8765;
		
		CalculatorTest cal = new CalculatorTest();
		int actual = cal.add(a,b);
		
		int expected = 9999;
		assertEquals(expected,actual);
	}

	public int add(int a, int b) {
		return a + b;
	}
	
	@Test
	public void testSubtract() {
		//fail("Not yet implemented");
		int b = 1234;
		int a = 8765;
		
		CalculatorTest cal = new CalculatorTest();
		int actual = cal.sub(a,b);
		
		int expected = 7531;
		assertEquals(expected,actual);
	}

	public int sub(int a, int b) {
		return a - b;
	}
	
	@Test
	public void testMultiple() {
		//fail("Not yet implemented");
		int a = 12;
		int b = 12;
		
		CalculatorTest cal = new CalculatorTest();
		int actual = cal.mul(a,b);
		
		int expected = 144;
		assertEquals(expected,actual);
	}
	
	public int mul(int a, int b) {
		return a * b;
	}
	
	@Test
	public void testdivide() {
		//fail("Not yet implemented");
		int a = 121;
		int b = 11;
		
		CalculatorTest cal = new CalculatorTest();
		int actual = cal.div(a,b);
		
		int expected = 11;
		assertEquals(expected,actual);
	}
	
	public int div(int a, int b) {
		return a/b;
	}
}
