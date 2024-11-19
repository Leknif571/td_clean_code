package Controller;

import java.util.Scanner;

import Model.Allumette;
import Model.Player;
import View.VueConsole;

public class GameControlleur {
	
	private Player player;
	private VueConsole vueConsole;
	private Allumette jeuAllumette;
	
	
	public GameControlleur() {
		super();
		this.player = new Player("RamoneFireStrike", 10, 15);
		this.jeuAllumette = new Allumette(player, 10);
		this.vueConsole = new VueConsole();
	}

	public void startGame() {
		vueConsole.afficherRegle();
		jeuBoucle();
	}
	
	public Boolean isNotFinish() {
		if(jeuAllumette.getNbAllumettes()==0) 
			return false;	
		return true;
	}
	
	public void jeuBoucle() {
		while(isNotFinish()) {	
			
		}
	}
	
	
	
	public Boolean isVictory(Boolean whoPlay) {
		if(!whoPlay) {
			return false;
		}
		return true;
	}
	

}
