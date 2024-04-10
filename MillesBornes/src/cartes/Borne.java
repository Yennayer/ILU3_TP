package cartes;

public class Borne extends Carte {
	private int km;

	public Borne(int nombre, int km) {
		super(nombre);
		this.km = km;
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
		if(!super.equals(obj))
			return false;
		
		Borne carte = (Borne) obj;
		return carte.km == km;
	}
}
