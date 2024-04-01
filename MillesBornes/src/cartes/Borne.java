package cartes;

public class Borne extends Carte {
	private int km;

	public Borne(int nombre, int km) {
		super(nombre);
		this.km = km;
	}

	@Override
	public int getNombre() {
		return super.getNombre();
	}

	public int getKm() {
		return km;
	}

	@Override
	public String toString() {
		return km + "km";
	}
	
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Borne borne) {
			return km == borne.getKm() && borne.getClass().equals(getClass());
			}
		return false;
	}

}
