/**
 * Questa classe ha il compito di verificare il corretto funzionamento
 * della cassa del ristarante Cinese
 */
package tests;

import utils.CassaCinese;
import utils.Portata;

public class Tests03 {
	public static void main(String[] args) {
		Portata portata = new Portata("Riso", 3);
		Portata portata2 = new Portata("Patatine", 5, true);
		CassaCinese cassaCinese = new CassaCinese();
		cassaCinese.aggiungiProdotti(portata, 2);
		cassaCinese.aggiungiProdotti(portata2, 4);
		System.out.println(cassaCinese.getConto().size());
		for (int i = 0; i < cassaCinese.getConto().size(); i++) {
			System.out.println(cassaCinese.getConto().get(i));
		}
		System.out.println(cassaCinese.calcolaConto());
	}
}
