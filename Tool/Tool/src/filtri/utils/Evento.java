/**
 * Questa classe contiene l'astrazione sul concetto di Log di tipo Eventi
 * @author Giacomo
 */
package filtri.utils;

import java.util.ArrayList;

public class Evento extends StrumentiFiltro implements Filtro {
	
	private String tipoLog = "Eventi";
	private ArrayList<Log> risultato = new ArrayList<>(); 
		
	@Override
	public void filtra(ArrayList<String> list) {
		risultato.clear();
		risultato = cercaLogTipo(list,tipoLog);
		
	}

	
	
	@Override
	public ArrayList<Log> getRisultato() {
		return risultato;
	}
}
