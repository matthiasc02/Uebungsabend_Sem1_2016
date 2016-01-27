package org.campus02.LV10a;

public class SparKonto extends Konto{

	public SparKonto(String inhaber) {
		super(inhaber);
		// TODO Auto-generated constructor stub
	}

	
	public void auszahlen (double wert){
		if (wert > kontostand){
			System.out.println("Betrag zu hoch!");
		}
		else kontostand-=wert;
	}

	@Override
	public String toString() {
		return "SparKonto []";
	}
	
	
}
