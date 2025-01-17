package cartes;

public abstract class Carte {
	private int nombre;
	
	protected Carte(int nombre) {
		this.nombre = nombre;
	}
	
	public int getNombre() {
		return nombre;
	}
	
	public void setNombre(int nombre) {
		this.nombre = nombre;
	}
	
	@Override
	public boolean equals(Object obj) {
		return obj!= null && obj.getClass().equals(getClass());
	}
	
}
