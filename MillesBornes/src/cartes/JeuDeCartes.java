package cartes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import cartes.Probleme.Type;
import utils.Utils;

public class JeuDeCartes {	
	private Carte[] typesDeCartes = {
			new Botte(1, Type.FEU),new Botte(1, Type.CREVAISON), new Botte(1, Type.ESSENCE), new Botte(1, Type.ACCIDENT),
			new Attaque(5, Type.FEU), new Attaque(3, Type.ESSENCE), new Attaque(3, Type.CREVAISON), new Attaque(3, Type.ACCIDENT),
			new Parade(14, Type.FEU), new Parade(6, Type.ESSENCE), new Parade(6, Type.CREVAISON), new Parade(6, Type.ACCIDENT),
			new DebutLimite(4), new FinLimite(6),
			new Borne(10, 25), new Borne(10, 50), new Borne(10, 75), new Borne(12, 100), new Borne(4, 200)};
		
	private List<Carte> listeCartes = new ArrayList<Carte>();
	

	public JeuDeCartes() {
		for (Carte carte : typesDeCartes) {
			for (int i = 0; i < carte.getNombre(); i++) {
				listeCartes.add(carte);
			}
		}
		listeCartes = Utils.melanger(listeCartes);
	}
	
	public List<Carte> getListeCartes() {
		return listeCartes;
	}

	public boolean checkCount() {
		for (Carte carte: listeCartes) {
			//System.out.println("la carte est : "+ carte);
			// Collections.frequecy renvoie le nombre d'occurences de la carte dans la liste
			if (carte.getNombre() != Collections.frequency(listeCartes, carte)) {
				//System.out.println((carte.getNombre() != Collections.frequency(listeCartes, carte))+ "pout la carte"+ carte);
				return false;
			}
		}
		return true;
	}
}