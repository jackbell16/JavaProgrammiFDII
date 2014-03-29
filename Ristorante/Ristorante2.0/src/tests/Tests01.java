/**
 * Questo test ha lo scopo di verificare il corretto funzionamento della cassa su 
 * System.out.println
 * @author Giacomo
 */
package tests;

import utils.Cassa;
import utils.Pizza;
import utils.ProxyCassa;

public class Tests01 {
	public static void main(String[] args) {
		ProxyCassa proxyCassa = new ProxyCassa(1);
		Pizza pizza = new Pizza("Margherita",4);
		Pizza pizza2 = new Pizza("Napoli", 5);
		Pizza pizza3 = new Pizza("Americana", 6.50);
		Cassa cassa = new Cassa();
		cassa.aggiungiProdotti(pizza, 3);
		cassa.aggiungiProdotti(pizza2, 1);
		cassa.aggiungiProdotti(pizza3, 2);
		proxyCassa.setConto(cassa.getConto());
		System.out.println(proxyCassa.calcolaConto());
		cassa.aggiungiProdotti(pizza3, 2);
		System.out.println(proxyCassa.calcolaConto());
	}
}
