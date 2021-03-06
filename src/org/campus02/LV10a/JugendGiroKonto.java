package org.campus02.LV10a;

public class JugendGiroKonto extends GiroKonto {
	protected double buchungslimit;

	public JugendGiroKonto(String inhaber, double limit, double buchungslimit) {
		super(inhaber, limit);
		this.buchungslimit = buchungslimit;
	}
	
	@Override
	public void auszahlen(double wert){
		if(wert > buchungslimit){ //(kontostand-wert < limit*-1 || wert > buchungslimit)
			System.out.println("Betrag zu hoch");
		}
		else super.auszahlen(wert); 
	}

	@Override
	public String toString() {
		return "JugendGiroKonto [buchungslimit=" + buchungslimit + "]";
	}

	

	

}
