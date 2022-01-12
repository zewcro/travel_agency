package fr.lernejo.utils;

public class InvalidTemperatureException extends Exception{
	public InvalidTemperatureException() {
		super("La temperature saisie est incorrect ou ne correspond pas aux exigences.");
	}

}
