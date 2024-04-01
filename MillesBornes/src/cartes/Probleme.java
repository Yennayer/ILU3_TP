package cartes;

public abstract class Probleme extends Carte {
	public enum Type {
		FEU,
		ESSENCE,
		CREVAISON,
		ACCIDENT
	};
	
	public Type type;
	
	protected Probleme(int nombre, Type type) {
		super(nombre);
		this.type= type;
	}
	
	@Override
	public int getNombre() {
		return super.getNombre();
	}
	
	public Type getType() {
		return type;
	}
	
	public boolean equals(Object obj) {
		if (obj instanceof Probleme probleme) {
			return type.equals(probleme.getType()) && probleme.getClass().equals(getClass());
		}
		return false;
	}
	
}
