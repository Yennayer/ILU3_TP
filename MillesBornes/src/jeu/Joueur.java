package jeu;

public class Joueur {
	private String nom;
	private ZoneDeJeu zone;
	public Joueur(String nom, ZoneDeJeu zone) {
		this.nom = nom;
		this.zone = zone;
	}
	
	// Accesseur
	public String getNom() {
		return nom;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Joueur joueur)
			return nom.equals(joueur.nom);
		return false;
	}
	
	@Override
	public String toString() {
		return nom;
	}
	
	
}
