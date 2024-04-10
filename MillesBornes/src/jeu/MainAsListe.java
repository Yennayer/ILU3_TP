package jeu;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import cartes.Carte;

public class MainAsListe implements IMain{
	private List<Carte> cartes;
	public MainAsListe() {
		this.cartes = new ArrayList<>();
	}

	@Override
	public void prendre(Carte carte) {
		cartes.add(carte);
	}

	@Override
	public void jouer(Carte carte) {
		assert (cartes.contains(carte)) : "La carte n'est pas dans la main";
		cartes.remove(carte);
	}
	
	@Override
	public String toString() {
		return "Je possède les cartes : " + cartes + " .";
	}

	@Override
	public Iterator<Carte> iterator() {
		return cartes.iterator();
	}

}
