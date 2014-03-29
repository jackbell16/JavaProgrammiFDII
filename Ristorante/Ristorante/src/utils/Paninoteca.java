/**
 * Questa classe ha la responsabilità di contenere tutte le bibite e i paini disponibile in una 
 * paninoteca
 * @author Giacomo
 */
package utils;

import java.util.ArrayList;

public class Paninoteca {

	private ArrayList<ProdottoPaninoteca> paini = new ArrayList<>();
	private ArrayList<ProdottoPaninoteca> bibite = new ArrayList<>();
	
	
	public ArrayList<ProdottoPaninoteca> getPaini() {
		return paini;
	}
	public void setPaini(ArrayList<ProdottoPaninoteca> paini) {
		this.paini = paini;
	}
	public ArrayList<ProdottoPaninoteca> getBibite() {
		return bibite;
	}
	public void setBibite(ArrayList<ProdottoPaninoteca> bibite) {
		this.bibite = bibite;
	}
	public void aggiungiPanino(ProdottoPaninoteca panino){
		paini.add(panino);
	}
	public void aggiungiBibia(ProdottoPaninoteca bibita){
		bibite.add(bibita);
	}
	
}
