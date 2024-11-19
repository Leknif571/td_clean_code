package Model;

public class Allumette {
	Player player;
	Integer nbAllumettes;
	public Allumette(Player player, Integer nbAllumettes) {
		super();
		this.player = player;
		this.nbAllumettes = nbAllumettes;
	}
	public Player getPlayer() {
		return player;
	}
	public void setPlayer(Player player) {
		this.player = player;
	}
	public Integer getNbAllumettes() {
		return nbAllumettes;
	}
	public void setNbAllumettes(Integer nbAllumettes) {
		this.nbAllumettes = nbAllumettes;
	}
	
	
}
