package jeu;

import java.util.List;

import cartes.Borne;
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
	public int hashCode() {
		return 31*nom.hashCode();
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

	public boolean deposer(Borne borne) {
		zone.ajouter(borne);
		return true;
	}
	
	public int donnerKmParcourus() {
		int distanceParcourue = 0;
		for (Borne borne : zone.getBorne()) {
			distanceParcourue += borne.getKm();
		}
		return distanceParcourue;
	}
	
}
