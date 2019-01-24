package testing;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class Fixture {
	//make vars global
	protected int value1, value2;

	//assign var values
	@Before
	public void setUp() throws Exception {
		value1 = 5;
		value2 = 4;
	}
	
	//simple math to confirm a fixed environment
	@Test
	public void test() {
		double result = value1 + value2;
		assertTrue(result == 9);
	}

}
