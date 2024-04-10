package cartes;

public abstract class Probleme extends Carte {
	public enum Type {
		FEU,
		ESSENCE,
		CREVAISON,
		ACCIDENT
	};
	
	protected Type type;
	
	protected Probleme(int nombre, Type type) {
		super(nombre);
		this.type= type;
	}
	
	public Type getType() {
		return type;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (!super.equals(obj))
			return false;
		Probleme carte = (Probleme) obj;
		return carte.type == type;
	}
	
}
