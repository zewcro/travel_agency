package fr.lernejo.travelsite;
import java.util.regex.Pattern;

import com.fasterxml.jackson.annotation.JsonProperty;

import fr.lernejo.utils.InvalidEmailException;
import fr.lernejo.utils.InvalidTemperatureException;

public class User{	
	// Merci "e-mail Regex.com "
	public static String emailFormat = "(?:[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*|\"(?:[\\x01-\\x08\\x0b\\x0c\\x0e-\\x1f\\x21\\x23-\\x5b\\x5d-\\x7f]|\\\\[\\x01-\\x09\\x0b\\x0c\\x0e-\\x7f])*\")@(?:(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?|\\[(?:(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.){3}(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?|[a-z0-9-]*[a-z0-9]:(?:[\\x01-\\x08\\x0b\\x0c\\x0e-\\x1f\\x21-\\x5a\\x53-\\x7f]|\\\\[\\x01-\\x09\\x0b\\x0c\\x0e-\\x7f])+)\\])";
	
	public String userEmail = "";
	public String userName = "";
	public String userCountry = "";
	public Weather weatherExpectation = Weather.WARMER;
	public double minimumTemperatureDistance = 0;
	
public User() {
	
}
	
	
public User(String userEmail, String userName, String userCountry, Weather weatherExpectation, double minimumTemperatureDistance) throws InvalidEmailException, InvalidTemperatureException {
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