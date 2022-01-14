package fr.lernejo.travelsite;
import java.util.regex.Pattern;

import com.fasterxml.jackson.annotation.JsonProperty;

import fr.lernejo.utils.InvalidEmailException;
import fr.lernejo.utils.InvalidTemperatureException;

public class User{	
	// Merci "e-mail Regex.com "
	public static final String emailFormat = "(?:[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*|\"(?:[\\x01-\\x08\\x0b\\x0c\\x0e-\\x1f\\x21\\x23-\\x5b\\x5d-\\x7f]|\\\\[\\x01-\\x09\\x0b\\x0c\\x0e-\\x7f])*\")@(?:(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?|\\[(?:(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.){3}(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?|[a-z0-9-]*[a-z0-9]:(?:[\\x01-\\x08\\x0b\\x0c\\x0e-\\x1f\\x21-\\x5a\\x53-\\x7f]|\\\\[\\x01-\\x09\\x0b\\x0c\\x0e-\\x7f])+)\\])";
	
	public final String userEmail;
	public final String userName;
	public final String userCountry;
	public final Weather weatherExpectation;
	public final double minimumTemperatureDistance = 0;
	
public User() {
	this.userEmail = "";
	this.userName = "";
	this.userCountry = "";
	this.weatherExpectation = Weather.WARMER;
}
	
	
public User(String userEmail, String userName, String userCountry, Weather weatherExpectation, double minimumTemperatureDistance) throws InvalidEmailException, InvalidTemperatureException {
	this.userEmail = "";
	this.userName = userName;
	this.userCountry = userCountry;
	this.weatherExpectation = weatherExpectation;
}

public enum Weather {

	@JsonProperty("WARMER")
	WARMER,
	@JsonProperty("COLDER")
	COLDER
	}
}