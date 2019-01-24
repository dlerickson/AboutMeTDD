package testing;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import model.ThisIsDon;

public class TestName {
	
	String name = "Don Erickson";
	ThisIsDon testingName = new ThisIsDon();

	@Before
	public void setUp() throws Exception {
		
	}

	@Test
	public void test() {
		System.out.println("This is inside the TestName()");
		assertEquals("Don Erickson", name);
	}

}
