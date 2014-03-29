/**
 * Questo test ha lo scopo di verificare la corretta aggiunte di Pizza
 */
package tests;

import utils.Pizza;
import utils.RistorantePizzeria;

public class Tests01 {
	public static void main(String[] args) {
		RistorantePizzeria pizzeria = new RistorantePizzeria();
		Pizza pizza = new Pizza("Margherita", 4);
		Pizza pizza2 = new Pizza("Napoli", 5.50);
		pizzeria.aggiungiPizza(pizza);
		pizzeria.aggiungiPizza(pizza2);
		for (int i = 0; i < pizzeria.getListaPizze().size(); i++) {
			System.out.println(pizzeria.getListaPizze().get(i));
		}
	}
}
