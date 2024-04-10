package utils;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Random;

import cartes.Carte;

public class Utils {
	static Random random = new Random();
	public static Carte extraire(List<Carte> liste) {
		
		int index = random.nextInt(liste.size());
		//Carte carte = liste.get(index);
		
		return liste.remove(index);
	}
	
	// En utilisant un itérateur
	public static Carte extraireV2 (List<Carte> liste) {
		int index = random.nextInt(liste.size());
		
		ListIterator<Carte> it = liste.listIterator();
		for (int i = 0; i < index; i++) {
			it.next();
		}
		Carte carte = it.next();
		it.remove();
		return carte;
	}
	
	
	public static List<Carte> melanger(List<Carte> liste) {
		List<Carte> resultat = new ArrayList<>();
		while (!liste.isEmpty()) {
			resultat.add(extraire(liste));
		}
		return resultat;
	}

	public static boolean verifierMelange(List<Carte> liste1, List<Carte> liste2) {
		for (Carte carte: liste1) {
			if (Collections.frequency(liste1, carte) != Collections.frequency(liste2, carte)) {
				return false;
			}
		}
		
		for (Carte carte: liste2) {
			if (Collections.frequency(liste1, carte) != Collections.frequency(liste2, carte)) {
				return false;
			}
		}
		return true;
	}

	
	public static List<Carte> rassembler(List<Carte> liste) {
        List<Carte> listeRassemblee = new ArrayList<>();
        for (Carte carte: liste) {
        	if (!listeRassemblee.contains(carte)) {
                 for (int i = 0; i < Collections.frequency(liste, carte); i++) {
 					listeRassemblee.add(carte);
 				}
			}
        }
        return listeRassemblee;
    }
	
	private static boolean verifierRassemblementAuxiliaire(int indice, Carte carte, List<Carte> liste) {
		for(ListIterator<Carte> it = liste.listIterator(indice); it.hasNext();) {
			Carte carteCourrante = it.next();
			if (carteCourrante.equals(carte)) {
				return true;
			}
		}
		return false;
	}
	
    public static boolean verifierRassemblement(List<Carte> liste) {
        if (liste.isEmpty()) {
            return true;
        }
        Carte cartePrecedente = liste.get(0); 
        for (ListIterator<Carte> it1 = liste.listIterator();it1.hasNext();) {
			Carte carteCourrante = it1.next();
			while (it1.hasNext() && carteCourrante.equals(cartePrecedente)) {
				cartePrecedente = carteCourrante;
				carteCourrante = it1.next();
			}
			if (verifierRassemblementAuxiliaire(it1.previousIndex(), cartePrecedente, liste)) {
				return false;
			}
			
        }
		return true;	
	}

}
