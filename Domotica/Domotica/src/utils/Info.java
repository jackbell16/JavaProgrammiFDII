/**
 * Quesya classe ha la responsabilità di capire se il tema
 * è di tipo Info
 */
package utils;

import java.util.ArrayList;

public class Info implements Filtro {
	private static String info = "Info";
	public static ArrayList<String> risultato = new ArrayList<>();
	/**
	 * Questo metodo resistuisce una lista di soli messaggi Info
	 */
	@Override
	public ArrayList<String> filtro(ArrayList<String> list) {
		PulisciRisultato.pulisciRisultato(risultato);
		for (int i = 0; i < list.size(); i++) {
			if(isEvento(list.get(i))){
				risultato.add(list.get(i));
			}
		}
		return risultato;
	}
	private static boolean isEvento(String string){
		if(string.contains(info)){
			return true;
		}else{
			return false;
		}
	}
}
