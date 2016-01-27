package org.campus02.LV10a;

public class GiroKonto extends Konto{
	protected double limit;

	public GiroKonto(String inhaber, double limit) {
		super(inhaber);
		this.limit = limit;
	}

	
	public void auszahlen(double wert){
		if(kontostand-wert < limit*-1){
			System.out.println("Betrag zu hoch");
		}
		else kontostand-=wert;
	}

	@Override
	public String toString() {
		return "GiroKonto [limit=" + limit + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		long temp;
		temp = Double.doubleToLongBits(limit);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		GiroKonto other = (GiroKonto) obj;
		if (Double.doubleToLongBits(limit) != Double.doubleToLongBits(other.limit))
			return false;
		return true;
	}

}
