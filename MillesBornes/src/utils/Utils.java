package utils;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;
import java.util.Random;

import cartes.Carte;

public class Utils {

	public static Carte extraire(List<Carte> liste) {
		Random random = new Random();
		int index = random.nextInt(liste.size());
		Carte carte = liste.get(index);
		liste.remove(index);
		return carte;
	}
	
	// En utilisant un itérateur
	public static Carte extraireV2 (List<Carte> liste) {
		Random random = new Random();
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
		List<Carte> resultat = new ArrayList<Carte>();
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
	
	// pas trop sur
    public static boolean verifierRassemblement(List<Carte> liste) {
        if (liste.isEmpty()) {
            return true;
        }
        
        ListIterator<Carte> it1 = liste.listIterator();
        while (it1.hasNext()) {
            Carte carteCourante = it1.next();
            ListIterator<Carte> it2 = liste.listIterator(it1.nextIndex());
            while (it2.hasNext()) {
                Carte carteNext = it2.next();
                if (!carteCourante.equals(carteNext)) {
                    break; // Si une différence est trouvée, interrompre la vérification
                }
                if (!it1.hasNext()) {
                    return true; // Si tous les éléments sont identiques et consécutifs, retourner vrai
                }
                carteCourante = it1.next(); // Avancer à l'élément suivant dans le premier itérateur
            }
        }
        return false; // Si aucun groupe d'éléments identiques consécutifs n'est trouvé, retourner faux
    }

}
