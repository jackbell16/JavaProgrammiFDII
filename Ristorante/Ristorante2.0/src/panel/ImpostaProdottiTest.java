package panel;

import utils.Pizza;
import utils.RistorantePizzeria;

public class ImpostaProdottiTest {
	final static RistorantePizzeria pizzeria = new RistorantePizzeria("Bella Napoli");
	static Pizza pizza = new Pizza("Margherita",4);
	static Pizza pizza2 = new Pizza("Napoli", 5);
	static Pizza pizza3 = new Pizza("Americana", 6.50);
	public static void main(String[] args) {
	pizzeria.aggiungiProdotto(pizza);
	pizzeria.aggiungiProdotto(pizza2);
	pizzeria.aggiungiProdotto(pizza3);
	}
}
