package ch.bbw.spring.springFormular;

import java.awt.Color;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class SportlerService {
		
	private List<Sportler> sportler = new ArrayList<>(
			Arrays.asList(new Sportler("Roger", "Federer", "Tennis", "Weltmeister", "Profi", new Color(144, 34, 33), this.generateDate(12, 5, 1985)), new Sportler("Manuel", "Akanji", "Fussball", "Schweizermeister", "Profi", new Color(4, 234, 133), this.generateDate(5, 12, 1997))));

	public List<Sportler> getAllSportler() {
		return this.sportler;
	}

	public Sportler getSportler(String firstName, String lastName) {
	
		for (Sportler sportler : sportler) {
			if ((firstName + lastName).equals(sportler.getFullName())) {
				return sportler;
			}

		}
		return null;

	}

	public void addSportler(Sportler value) {
		this.sportler.add(value);
	}
	
	public Date generateDate(int day, int month, int year) {
		
		Calendar cal = Calendar.getInstance();
		cal.set(Calendar.YEAR, year);
		cal.set(Calendar.MONTH, month-1);
		cal.set(Calendar.DAY_OF_MONTH, day);
		Date dateRepresentation = cal.getTime();
		
		return dateRepresentation;
	}

}
