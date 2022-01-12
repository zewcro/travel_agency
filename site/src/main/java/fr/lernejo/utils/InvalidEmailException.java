package fr.lernejo.utils;

public class InvalidEmailException extends Exception{
	public InvalidEmailException() {
		super("L'adresse e-mail saisie ne répond pas aux éxigences !");
	}

}
