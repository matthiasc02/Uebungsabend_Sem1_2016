package org.campus02.LV10a;

public class SparKonto extends Konto{

	public SparKonto(String inhaber) {
		super(inhaber);
		// TODO Auto-generated constructor stub
	}

	
	public void auszahlen (double wert){
		if (kontostand-wert < 0){
			System.out.println("Betrag zu hoch!");
		}
		else super.auszahlen(wert); 
	}

	@Override
	public String toString() {
		return "SparKonto []";
	}
	
	
}
