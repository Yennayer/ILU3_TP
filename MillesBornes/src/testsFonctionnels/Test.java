package testsFonctionnels;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import cartes.Attaque;
import cartes.Borne;
import cartes.Botte;
import cartes.Carte;
import cartes.JeuDeCartes;
import cartes.Limite;
import cartes.Parade;
import cartes.Probleme.Type;
import jeu.Sabot;
import utils.Utils;

public class Test {
	public static void main(String[] args) {
		/*
		// Test TP 01
		System.out.println("Test 01 :\n");
		Sabot sabot = new Sabot(110);
		sabot.ajouterFamilleCarte(new Attaque(3, Type.ACCIDENT), new Parade(3, Type.ACCIDENT), new Botte(1, Type.ACCIDENT));  
		while (!sabot.estVide()) {
			System.out.println("Je pioche "+sabot.piocher());
		}
		
		System.out.println("\nTest 02 :\n");
		sabot.ajouterFamilleCarte(new Attaque(3, Type.ACCIDENT), new Parade(3, Type.ACCIDENT), new Botte(1, Type.ACCIDENT)); 
		
		for(Iterator<Carte> iter = sabot.iterator(); iter.hasNext();) {
			Carte carte = iter.next();
			iter.remove();
			System.out.println("Je pioche "+carte);
			// sabot.ajouterFamilleCarte(new Botte(1, Type.ACCIDENT));
			
		}
		// sabot.piocher(); ça génère une exception
		*/
		///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		// Test TP 02
		/*
		System.out.println("Test 01 :");
		
		Carte[] cartes = new Carte[4]; // Création du tableau de 3 cartes
        cartes[0] = new Borne(10, 3);
        cartes[1] = new Parade(3, Type.ACCIDENT);
        cartes[2] = new Borne(10, 3);
        cartes[3] = new Attaque(2, Type.ACCIDENT);
		System.out.println("Test Equals 01 : "+cartes[0].equals(cartes[1]));
		System.out.println("Test Equals 02 : "+cartes[2].equals(cartes[1]));
		System.out.println("Test Equals 03 : "+cartes[0].equals(cartes[2]));
		System.out.println("Test Equals 04 : "+cartes[0].equals(cartes[3]));
		*/
		
		/*
		System.out.println("\nTest 02 :\n");
		 
		JeuDeCartes jeu = new JeuDeCartes();
		List<Carte> listeCartes = jeu.getListeCartes();
		System.out.println("Affichage de la liste : " + listeCartes);
		
		System.out.println("Verification avec CheckCount : " + jeu.checkCount());
		*/
		
		
		System.out.println("Test 03 :");
		
		JeuDeCartes jeu = new JeuDeCartes();
		List<Carte> listeCarteNonMelangee = jeu.getListeCartes();
		List<Carte> listeCartes = new ArrayList<>(listeCarteNonMelangee);
		System.out.println(listeCartes);
		System.out.println("Verification avec CheckCount : " + jeu.checkCount());

		listeCartes = Utils.melanger(listeCartes);
		System.out.println(listeCartes);
		System.out.println("liste mélangée sans erreur ? "+ Utils.verifierMelange(listeCarteNonMelangee, listeCartes));
		
		listeCartes = Utils.rassembler(listeCartes);
		System.out.println(listeCartes);
		
		System.out.println("liste rassemblée sans erreur ? " + Utils.verifierRassemblement(listeCartes));
		
		
		System.out.println("Test Constructeur :");
		JeuDeCartes jeu2 = new JeuDeCartes();
		List<Carte> listeCarteMelangee = jeu2.getListeCartes();
		System.out.println(listeCarteMelangee);
		System.out.println("Verification avec CheckCount : " + jeu2.checkCount());
		
	}
}

