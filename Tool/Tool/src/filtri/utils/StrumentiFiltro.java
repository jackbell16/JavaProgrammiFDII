/**
 * Questa classe contiene alcuni metodi che vengono riciclati nei varie classi figlie
 * @author Giacomo
 */
package filtri.utils;

import java.util.ArrayList;

import utils.InterpreteFileLog;
import utils.InterpreteFileLogTest;

public class StrumentiFiltro {
	
	public ArrayList<Log> cercaLogTipo(ArrayList<String> list, String tipoLog) {
		InterpreteFileLog fileLog = new InterpreteFileLogTest();
		fileLog.fileTolog(list);
		ArrayList<Log> risultato = new ArrayList<>();
		for (int i = 0; i < fileLog.getLogs().size(); i++) {
			Log log = fileLog.getLogs().get(i);
			if(log.isTypeOf(tipoLog)){
				risultato.add(log);
			}
		}
		return risultato;
	}
}
