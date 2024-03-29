/**
 * Questa classe contiene i metodi per aggiungere un determinato prodotto al conto, ed effettuarne 
 * il relativo conto
 * @author Giacomo
 */
package utils;

import java.util.ArrayList;

public class CassaPizzeria  {
	private ArrayList<ProdottoPizzeria> conto = new ArrayList<>();
	
	public ArrayList<ProdottoPizzeria> getConto() {
		return conto;
	}
	public void setConto(ArrayList<ProdottoPizzeria> conto) {
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
		}
		conto.clear();
		return totale;
	}
	/**
	 * Questo metodo permette di aggiungere dei prodotti della pizzera al conto
	 * @param prodottoPizzeria
	 * @param quantità
	 */
	public void aggiungiProdotti(ProdottoPizzeria prodottoPizzeria, int quantità){
		for (int i = 0; i < quantità; i++) {
			conto.add(prodottoPizzeria);
		}
	}	
}
