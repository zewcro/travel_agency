package fr.lernejo.travelsite;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import fr.lernejo.utils.InvalidEmailException;
import fr.lernejo.utils.InvalidTemperatureException;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

@RestController
public class Controller {
	public ArrayList<User> inscriptions = new ArrayList<User>();
	
	@PostMapping("/api/inscription")
	public void Inscription(@RequestBody User Inscription ) throws InvalidEmailException, InvalidTemperatureException {	
		if(!Pattern.matches(User.emailFormat, Inscription.userEmail)) throw new InvalidEmailException();

		if (Inscription.minimumTemperatureDistance < 0 || Inscription.minimumTemperatureDistance > 40) throw new InvalidTemperatureException();
		this.inscriptions.add(Inscription);	
	}
	
	@GetMapping("/api/travels")
	public ResponseEntity<ArrayList <Travel>> Travel(@RequestParam("userName") String Inscription ) {
		ArrayList<Travel> travelList = new ArrayList<>();	
		for (User user : inscriptions) {
			if(user.userName.equals(Inscription)) {
				travelList.add(new Travel("Caribbean", 32.4));
			    travelList.add(new Travel("Australia", 35.1));
				return new ResponseEntity<ArrayList<Travel>>(travelList, HttpStatus.OK);
			}
		}
		// Pour éviter les doublons si un utilisateur essaye d'afficher plusieurs fois la liste des destinations 
			return new ResponseEntity<ArrayList<Travel>>(travelList, HttpStatus.OK);
	}
}
