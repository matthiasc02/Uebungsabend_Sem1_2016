
public class Event {
	
	private String title;
	private String ort;
	private double eintrittspreis;
	
	public Event(String title, String ort, double eintrittspreis) {
		this.title = title;
		this.ort = ort;
		this.eintrittspreis = eintrittspreis;
	}


	public String getTitle() {
		return title;
	}

	
	public String getOrt() {
		return ort;
	}


	public double getEintrittspreis() {
		return eintrittspreis;
	}


	public void setTitle(String title) {
		this.title = title;
	}


	public void setOrt(String ort) {
		this.ort = ort;
	}


	public void setEintrittspreis(double eintrittspreis) {
		this.eintrittspreis = eintrittspreis;
	}


	@Override
	public String toString() {
		return "Event [title=" + title + ", ort=" + ort + ", eintrittspreis=" + eintrittspreis + "]";
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(eintrittspreis);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((ort == null) ? 0 : ort.hashCode());
		result = prime * result + ((title == null) ? 0 : title.hashCode());
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
		Event other = (Event) obj;
		if (Double.doubleToLongBits(eintrittspreis) != Double.doubleToLongBits(other.eintrittspreis))
			return false;
		if (ort == null) {
			if (other.ort != null)
				return false;
		} else if (!ort.equals(other.ort))
			return false;
		if (title == null) {
			if (other.title != null)
				return false;
		} else if (!title.equals(other.title))
			return false;
		return true;
	}
	
	
	
}
