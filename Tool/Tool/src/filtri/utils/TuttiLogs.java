/**
 * Questo filtro, mostra tutti log presenti nel file, che viene caricato dall'utente
 * @author Giacomo
 */
package filtri.utils;

import java.util.ArrayList;

import utils.InterpreteFileLog;
import utils.InterpreteFileLogTest;

public class TuttiLogs implements Filtro {
	
	private ArrayList<Log> risultato = new ArrayList<>(); 
	
	@Override
	public void filtra(ArrayList<String> list) {
		InterpreteFileLog fileLog = new InterpreteFileLogTest();
		fileLog.fileTolog(list);
		risultato = fileLog.getLogs();
		
	}
	
	@Override
	public ArrayList<Log> getRisultato() {
		return risultato;
	}

}
