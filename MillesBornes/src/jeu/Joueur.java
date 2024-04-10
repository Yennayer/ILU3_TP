package jeu;

import java.util.List;

import cartes.Carte;

public class Joueur {
	private String nom;
	private ZoneDeJeu zone;
	private MainAsListe main;
	
	public Joueur(String nom) {
		this.nom = nom;
		this.zone = new ZoneDeJeu();
		this.main = new MainAsListe();
	}
	
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
	
	public void donner(Carte carte){
		main.prendre(carte);
	}
	
	public Carte prendreCarte(List<Carte> sabot) {
		Carte carte = null;
		if (sabot.isEmpty()) {
			return carte;
		}
		carte = sabot.get(0);
		donner(carte);
		return carte;
	}

}
