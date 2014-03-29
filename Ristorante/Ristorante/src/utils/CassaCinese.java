/**
 * Questa classe contiene i metodi per aggiungere un determinato prodotto al conto, ed effettuarne 
 * il relativo conto
 * @author Giacomo
 */
package utils;

import java.util.ArrayList;

public class CassaCinese {
	
	private ArrayList<ProdottoCinese> conto = new ArrayList<>();
	public static double aggiungaAbbondante = 1;
	
	public ArrayList<ProdottoCinese> getConto() {
		return conto;
	}
	public void setConto(ArrayList<ProdottoCinese> conto) {
		this.conto = conto;
	}
	/**
	 * Questo metodo permette di calcolare il conto
	 * @return
	 */
	public double calcolaConto(){
		double totale = 0;
		for (int i = 0; i < conto.size(); i++) {
			totale+=conto.get(i).getPrezzo();
			if(conto.get(i).isAbbondante()){
				totale+=aggiungaAbbondante;
			}
		}
		conto.clear();
		return totale;
	}
	/**
	 * Permette di aggiungere dei prodottiCinesi, al conto
	 * @param portata
	 * @param quantità
	 */
	public void aggiungiProdotti(ProdottoCinese portata, int quantità){
		for (int i = 0; i < quantità; i++) {
			conto.add(portata);
		}
	}	
}
