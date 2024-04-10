package testsFonctionnels;

import java.util.ArrayList;
import java.util.List;

import cartes.Borne;
import jeu.Joueur;
import jeu.ZoneDeJeu;

public class TestJoueur {
	public static void main(String[] args) {
		Joueur joueur = new Joueur("joueur1");
		
		Borne borne1 = new Borne(10, 25);
		Borne borne2 = new Borne(1, 50);
		List<Borne> listesBorne = new ArrayList<>();
		for(int i=0; i < 5; i++) {
			listesBorne.add(borne2);
		}
		
		
		
	}
	


}
