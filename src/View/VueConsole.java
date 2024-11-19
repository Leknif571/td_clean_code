package View;

import java.util.ArrayList;

public class VueConsole {
	public void afficherRegle() {
		System.out.println("Bonjour, bienvenue au jeux des allumettes");
		System.out.println("Le but étant que le joueur adverse perde en ne laissant qu'une seule allumettes");
		System.out.println("Bonne chance");
	}
	
	public void afficherVictoire(String mot) {
		System.out.println("Vous avez gagner");
	}
	
	public void afficherDefaite(Integer tentativeRestante) {
		System.out.println("Vous avez perdu");

	}
	
	public void afficherTourAdversaire() {
		System.out.println("tour de l'adversaire");

	}
	
	public void afficherVotreTour() {
		System.out.println("Votre tour");

	}
	
	
}
