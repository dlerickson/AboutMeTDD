package testing;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import model.ThisIsDon;

public class TestBio {

	ThisIsDon testingBio = new ThisIsDon();
	
	@Before
	public void setUp() throws Exception {
		
	}

	@Test
	public void testingMyBio() {
		System.out.println("This is inside testingMyBio()");
		String bio = "I enjoy the challenge I get from programming. I also hate losing, so the program won't beat me. Despite schooling full time"
				+ " while running my own business and only learning Java in the last 6 months, I think I'm doing pretty darn well.";
		assertNotNull(bio);
	}

}
