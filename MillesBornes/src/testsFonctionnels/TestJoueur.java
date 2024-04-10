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
    	
    	joueur.deposer(borne1);
    	joueur.deposer(borne2);
    	
    	

    	System.out.println(joueur.donnerKmParcourus());
		
	}
	


}
