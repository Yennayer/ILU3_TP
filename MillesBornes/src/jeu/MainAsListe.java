package jeu;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import cartes.Carte;

public class MainAsListe implements IMain{
	private List<Carte> liste;
	public MainAsListe() {
		this.liste = new ArrayList<Carte>();
	}

	@Override
	public void prendre(Carte carte) {
		liste.add(carte);
	}

	@Override
	public void jouer(Carte carte) {
		assert(liste.contains(carte));
		liste.remove(carte);
	}
	
	@Override
	public String toString() {
		return "Je possède les cartes : " + liste + " .";
	}

	@Override
	public Iterator<Carte> iterator() {
		// TODO Auto-generated method stub
		return null;
	}

}
