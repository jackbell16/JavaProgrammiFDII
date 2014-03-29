package utils;


public class CassaCinese extends Cassa implements ICassa {
	
	public double calcolaConto() {
		double totale = 0;
		for (int i = 0; i < getConto().size(); i++) {
			totale+=getConto().get(i).getPrezzo();
		}
		getConto().clear();
		return totale;
	}
}