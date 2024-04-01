package cartes;

public class Parade extends Bataille {

	public Parade(int nombre, Type type) {
		super(nombre, type);
	}
	
	@Override
	public String toString() {
		switch (type) {
		case FEU:
			return "Feu Vert";
		case ESSENCE:
			return "Essence";	
		case CREVAISON:
			return "Roue De Secours";
		case ACCIDENT:
			return "Réparations";
		}
		return null;
	}

}
