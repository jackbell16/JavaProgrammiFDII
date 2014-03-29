package utils;

import java.util.ArrayList;

public class Cassa {
	
	private ArrayList<Prodotto> conto = new ArrayList<>();

	public void aggiungiProdotti(Prodotto prodotto, int quantità) {
		for (int i = 0; i < quantità; i++) {
			conto.add(prodotto);
		}
	}
	public ArrayList<Prodotto> getConto() {
		return conto;
	}
	public void setConto(ArrayList<Prodotto> conto) {
		this.conto = conto;
	}
}
