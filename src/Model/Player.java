package Model;

public class Player {
	private String pseudo;
	private Integer nbPartieGagner;
	private Integer nbPartieTotal;
	
	public Player(String pseudo, Integer nbPartieGagner, Integer nbPartieTotal) {
		super();
		this.pseudo = pseudo;
		this.nbPartieGagner = nbPartieGagner;
		this.nbPartieTotal = nbPartieTotal;
	}
	
	public String getPseudo() {
		return pseudo;
	}
	public void setPseudo(String pseudo) {
		this.pseudo = pseudo;
	}
	public Integer getNbPartieGagner() {
		return nbPartieGagner;
	}
	public void setNbPartieGagner(Integer nbPartieGagner) {
		this.nbPartieGagner = nbPartieGagner;
	}
	public Integer getNbPartieTotal() {
		return nbPartieTotal;
	}
	public void setNbPartieTotal(Integer nbPartieTotal) {
		this.nbPartieTotal = nbPartieTotal;
	}
	
	
}

