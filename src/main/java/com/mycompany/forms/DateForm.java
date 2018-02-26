package com.mycompany.forms;

import java.time.LocalDate;

import javax.validation.constraints.NotNull;

public class DateForm {

	@NotNull
	public LocalDate dateOfBirth;
	
}
