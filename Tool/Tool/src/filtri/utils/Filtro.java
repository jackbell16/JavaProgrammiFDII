/**
 * Questa Interfaccia estrae sui metodi che permettono di filtrate i log e di recupderarli
 */
package filtri.utils;

import java.util.ArrayList;

public interface Filtro {
	
	/**
	 * Questo metodo permette di applicare un filtra ad una determinata lista di Stringhe
	 * @param list
	 */
	public void filtra (ArrayList<String> list);
	
	/**
	 * Questo metodo permette di recuperare i risultati ottenuti, applicando precedentemente 
	 * il filtro
	 * @return
	 */
	public ArrayList<Log> getRisultato();

}
