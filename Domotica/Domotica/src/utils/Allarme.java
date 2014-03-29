/**
 * Questa classe ha responsabilità di stabilire se il tema del file è di topo Allarme
 * @author Giacomo
 */
package utils;

import java.util.ArrayList;

public class Allarme implements Filtro {
	private static String allarme = "Allarme";
	public static ArrayList<String> risultato = new ArrayList<>();
	@Override
	public ArrayList<String> filtro(ArrayList<String> list) {
		PulisciRisultato.pulisciRisultato(risultato);
		 for (int i = 0; i < list.size(); i++) {
			if(isAllarme(list.get(i))){
				risultato.add(list.get(i));
			}
		}
	return risultato;
	}
	private static boolean isAllarme(String string){
		if(string.contains(allarme)){
			return true;
		}else{
			return false;
		}
	}
}
