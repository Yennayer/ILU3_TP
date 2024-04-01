package cartes;

public class Attaque extends Bataille {

	public Attaque(int nombre, Type type) {
		super(nombre, type);
	}
	
	public String toString() {
		switch (type) {
		case FEU:
			return "Feu Rouge";
		case ESSENCE:
			return "Panne d'essence";	
		case CREVAISON:
			return "Crevaison";
		case ACCIDENT:
			return "Accident";
		}
		return null;
	}

}
