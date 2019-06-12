package ch.bbw.spring.springFormular;

import java.awt.Color;
import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

public class Sportler {
	
	private String firstName;
	private String lastName;
	private String details;
	private String success;
	private String state;
	private Color color = Color.BLACK;
	
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date date;
	
	
	public Sportler() {
		this.firstName = "";
		this.lastName = "";
		this.details = "";
		this.success = "";
		this.state = "";
		
	}
	
	public Sportler(String firstName, String lastName, String details, String success, String state, Color color, Date date) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.details = details;
		this.success = success;
		this.state = state;
		this.color = color;
		this.date = date;
		
	}
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public String getFullName() {
		return this.firstName + this.lastName;
	}

	public String getDetails() {
		return details;
	}

	public void setDetails(String details) {
		this.details = details;
	}

	public String getSuccess() {
		return success;
	}

	public void setSuccess(String success) {
		this.success = success;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}
	
	public String getColorAsString() {
		return "test";
	}

	public void setColorAsString(String color) {
		
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		
		this.date = date;
	}
	

}
