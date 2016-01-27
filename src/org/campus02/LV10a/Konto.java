package org.campus02.LV10a;

public class Konto {
	
	protected String inhaber;
	protected double kontostand;
	
	public Konto(String inhaber) {
		super();
		this.inhaber = inhaber;
		kontostand=0.0;
	}
	
	public void einzahlen(double wert){
		kontostand+=wert;
	}
	
	public void auszahlen(double wert){
		kontostand-=wert;
	}

	@Override
	public String toString() {
		return "Konto [inhaber=" + inhaber + ", kontostand=" + kontostand + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((inhaber == null) ? 0 : inhaber.hashCode());
		long temp;
		temp = Double.doubleToLongBits(kontostand);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Konto other = (Konto) obj;
		if (inhaber == null) {
			if (other.inhaber != null)
				return false;
		} else if (!inhaber.equals(other.inhaber))
			return false;
		if (Double.doubleToLongBits(kontostand) != Double.doubleToLongBits(other.kontostand))
			return false;
		return true;
	}
	
	
}
