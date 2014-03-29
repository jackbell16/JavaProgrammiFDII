/**
 * Questo test ha lo scopo di verificare il corretto funzionamento che prevede
 * di calcolare il conto di una Pizzeria
 */
package tests;

import utils.CassaPizzeria;
import utils.Pizza;
import utils.RistorantePizzeria;

public class Tests02 {
	private static void scontrino(CassaPizzeria cassaPizzeria) {
		for (int i = 0; i < cassaPizzeria.getConto().size(); i++) {
			System.out.println(cassaPizzeria.getConto().get(i));
		}
		System.out.println(cassaPizzeria.calcolaConto());
	}
	public static void main(String[] args) {
		RistorantePizzeria pizzeria = new RistorantePizzeria();
		Pizza pizza = new Pizza("Margherita", 4);
		Pizza pizza2 = new Pizza("Napoli", 5.50);
		pizzeria.aggiungiPizza(pizza);
		pizzeria.aggiungiPizza(pizza2);
		CassaPizzeria cassaPizzeria = new CassaPizzeria();
		cassaPizzeria.aggiungiProdotti(pizza, 2);
		cassaPizzeria.aggiungiProdotti(pizza2, 3);
		scontrino(cassaPizzeria);
	}
}
