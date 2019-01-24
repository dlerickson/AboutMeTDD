package model;

import java.time.LocalDate;
import java.time.Period;

public class FigureMyAge {
	// set my bday variable
	LocalDate birthDate = LocalDate.of(1983, 03, 13);
	
	//today
	LocalDate currentDate = LocalDate.now();

	public static int calculateAge(LocalDate birthDate, LocalDate currentDate) {
		return Period.between(birthDate, currentDate).getYears();
	}

	
	
}
