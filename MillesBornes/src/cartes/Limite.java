package cartes;

public abstract class Limite extends Carte {

	public Limite(int nombre) {
		super(nombre);
	}
	
	@Override
	public int getNombre() {
		return super.getNombre();
	}
	
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Limite limite) {
			return limite.getClass().equals(getClass());
		}
		return false;
	}
}
