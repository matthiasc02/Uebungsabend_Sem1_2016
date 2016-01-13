import java.util.ArrayList;
import java.util.HashMap;

public class EventKalender {
	
	private ArrayList<Event> events = new ArrayList<Event>();
	
	public void add(Event evt){
		events.add(evt);
	}
	
	public Event getByTitle(String title){
		for (Event evt : events){
			if(evt.getTitle().equals(title)){
				return evt;
			}
	
		}
		return null;
	}
	
	public ArrayList<Event> getByOrt(String ort){
		ArrayList<Event> eventsbyort = new ArrayList<Event>();
		for (Event evt : events){
			if(evt.getOrt().equals(ort)){
				eventsbyort.add(evt);
			}
		}
		
		return eventsbyort;
		
	}
	
	public ArrayList<Event> getByEintrittsPreis(double min, double max){
		ArrayList<Event> eventsbypreis = new ArrayList<Event>();
		for(Event evt : events){
			if (evt.getEintrittspreis()>=min && evt.getEintrittspreis()<=max){
				eventsbypreis.add(evt);
			}			
		}
		return eventsbypreis;
	}
	
	public Event getMostExpensiveByOrt(String ort){
		Event ev = null;
		double preis = 0.0;
		for (Event evt : events){
			if (evt.getEintrittspreis() > preis && evt.getOrt().equals(ort)){
				preis=evt.getEintrittspreis();
				ev = evt;
			}
		}
		return ev;
	}
	
	public double getAvgPreisByOrt(String ort){
		double preis=0.0;
		double AvgPreis=0.0;
		double ortanzahl=0.0;
		
		for (Event evt : events){
			if(evt.getOrt().equals(ort)){
				preis+=evt.getEintrittspreis();
				ortanzahl++;
			}
			AvgPreis=preis/ortanzahl;
		}
		return AvgPreis;
	}
	
	public HashMap<String, Integer> getCountByOrt(){
		 
		
		return null;
		
	}

		
}
