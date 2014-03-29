package utils;

import java.util.ArrayList;

public class Ristorante {
	
	ArrayList<Prodotto> prodotti = new ArrayList<>();

	public ArrayList<Prodotto> getProdotti() {
		return prodotti;
	}

	public void setProdotti(ArrayList<Prodotto> prodotti) {
		this.prodotti = prodotti;
	}
	
	public void aggiungiProdotto(Prodotto prodotto){
		prodotti.add(prodotto);
	}
}
