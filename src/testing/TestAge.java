package testing;

import static org.junit.Assert.*;

import java.time.LocalDate;
import java.time.Period;

import org.junit.Before;
import org.junit.Test;

import model.FigureMyAge;
import model.ThisIsDon;

public class TestAge {

	ThisIsDon testingAge = new ThisIsDon();
	int imOldish = 35;

	public int calculateAge(LocalDate birthDate, LocalDate currentDate) {
		// validate inputs ...
		return Period.between(birthDate, currentDate).getYears();
	}

	@Before
	public void setUp() throws Exception {

	}

	@Test
	public void testFiguringMyAge() {
		System.out.println("This is inside testFiguringMyAge()");
		assertTrue(imOldish <= FigureMyAge.calculateAge(null, null));
	}

}
