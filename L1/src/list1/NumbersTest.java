package list1;

import junit.framework.TestCase;

public class NumbersTest extends TestCase {
	
	Numbers numbers;
	
	protected void setUp() throws Exception {
		super.setUp();
		numbers = new Numbers();
		assertNotNull(numbers);
	}
	
	public void testGetNumber(){
		assertEquals(12, numbers.getNumber());
	}
	
	public void testSetNumber(){
		numbers.setNumber(25);
		assertEquals(25,numbers.getNumber());
	}
	
	public void testGetNumberInSpecificSystem(){
		numbers.setNumber(15);
		assertEquals("1111", numbers.getNumberInSpecificSystem(2));
		assertEquals("f", numbers.getNumberInSpecificSystem(16));
		assertEquals("17",numbers.getNumberInSpecificSystem(8));
	}
}
