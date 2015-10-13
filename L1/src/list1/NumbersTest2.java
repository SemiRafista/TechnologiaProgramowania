package list1;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class NumbersTest2 {
	private Numbers numbers;
	
	@Before
	public void setUp() throws Exception {
		numbers = new Numbers();
	}

	@After
	public void tearDown() throws Exception {
		numbers = null;
	}
	
	@After
	public void checkIfNull() throws Exception{
		assertNull(numbers);
	}

	@Test(expected = IllegalArgumentException.class)
	public void failTestGetNumberInSpecificSystem(){
		numbers.setNumber(50);
		numbers.getNumberInSpecificSystem(17);
	}
	
	@Test(timeout=100)
	public void testTimeOfConvertingNumber(){
		numbers.setNumber(1281235251);
		numbers.getNumberInSpecificSystem(2);
	}
	public void kwadrat633Test(){
		numbers = null;
		assertNull(numbers);
		numbers = new Numbers();
		numbers.setNumber(256);
		assertEquals("10000000",numbers.getNumberInSpecificSystem(2));
	}

}
