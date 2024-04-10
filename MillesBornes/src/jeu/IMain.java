package jeu;

import java.util.Iterator;

import cartes.Carte;

public interface IMain {
	public void prendre(Carte carte);
	public void jouer(Carte carte);
	Iterator<Carte> iterator();
}
