package cartes;

public class Botte extends Probleme {

	public Botte(int nombre, Type type) {
		super(nombre, type);
	}

	public String toString() {
		switch (type) {
		case FEU:
			return "Vehicule prioritaire";
		case ESSENCE:
			return "Citerne d'essence";	
		case CREVAISON:
			return "INCREVABLE";
		case ACCIDENT:
			return "As du volant";
		}
		return null; 
		
	}
}
