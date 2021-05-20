package com.acte.time;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public class DateTimeParsing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input = "Jun 03 2003";
		
		try {
		    DateTimeFormatter formatter =
		                      DateTimeFormatter.ofPattern("MMM d yyyy");
		    LocalDate date = LocalDate.parse(input, formatter);
		    System.out.printf("%s%n", date);
		}
		catch (DateTimeParseException exc) {
		    System.out.printf("%s is not parsable!%n", input);
		    throw exc;      // Rethrow the exception.
		}
		// 'date' has been successfully parsed
	}

}
