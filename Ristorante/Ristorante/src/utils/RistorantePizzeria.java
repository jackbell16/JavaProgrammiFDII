/**
 * Questa classe ha la responsabilità di contenere le pizze disponibili 
 * in una pizzeria
 * @author Giacomo
 */
package utils;

import java.util.ArrayList;

public class RistorantePizzeria {
	
	private ArrayList<ProdottoPizzeria> listaPizze = new ArrayList<ProdottoPizzeria>();
	
	public ArrayList<ProdottoPizzeria> getListaPizze() {
		return listaPizze;
	}
	
	public void aggiungiPizza(Pizza pizza){
		listaPizze.add(pizza);
	}
}
