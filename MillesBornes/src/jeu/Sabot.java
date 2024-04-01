package jeu;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

import cartes.Carte;

public class Sabot implements Iterable<Carte> {
	private Carte[] cartes;
	private int nbCartes = 0;
	// ITERATOR
	private int nombreOperations = 0;

	public Sabot(int capacite) {
		cartes = new Carte[capacite];
	}

	public boolean estVide() {
		return nbCartes < 1;
	}

	public int getNbCartes() {
		return nbCartes;
	}

	private void ajouterCarte(Carte carte) {
		try {
			cartes[nbCartes] = carte;
			nbCartes++;
			nombreOperations++;
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Dépassement de capacité du tableau de cartes");
		}
	}

	private void ajouterFamilleCarte(Carte carte) {
		for (int i = 0; i < carte.getNombre(); i++) {
			ajouterCarte(carte);
		}
	}

	public void ajouterFamilleCarte(Carte... cartes) {
		for (int i = 0; i < cartes.length; i++) {
			ajouterFamilleCarte(cartes[i]);
		}
	}

	public Carte piocher() {
		Iterator<Carte> it = iterator();
		Carte carte = it.next();
		it.remove();
		return carte;
	}

	public Iterator<Carte> iterator() {
		return new Iterateur();
	}

	private class Iterateur implements Iterator<Carte> {

		private int indiceIterateur = 0;
		private int nombreOperationsReference = nombreOperations;
		private boolean nextEffectue = false;

		@Override
		public boolean hasNext() {
			verificationConcurrence();
			return indiceIterateur < nbCartes;
		}

		@Override
		public Carte next() {
			if (hasNext()) {
				Carte carte = cartes[indiceIterateur];
				indiceIterateur++;
				nextEffectue = true;
				return carte;
			}
			throw new NoSuchElementException();
		}

		private void verificationConcurrence() {
			if (nombreOperations != nombreOperationsReference) {
				throw new ConcurrentModificationException();
			}

		}

		@Override
		public void remove() {
			verificationConcurrence();
			if (nbCartes < 1 || !nextEffectue) {
				throw new IllegalStateException();
			}
			for (int i = indiceIterateur - 1; i < nbCartes - 1; i++) {
				cartes[i] = cartes[i + 1];
			}
			nextEffectue = false;
			indiceIterateur--;
			nbCartes--;
			nombreOperations++;
			nombreOperationsReference++;
		}

	}

}
