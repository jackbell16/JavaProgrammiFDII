package utils.log;

import java.util.ArrayList;

public interface InterpreteFileLog {
	/**
	 * Questo metodo trasforma un {@link ArrayList} si stringhe,
	 * in un {@link ArrayList} di {@link Log}
	 * @param list
	 */
	public void fileToLog(ArrayList<String> list);
	/**
	 * Questo metodo recupera l' {@link ArrayList} di {@link Log} che è stato
	 * creato precedentemente
	 * @return
	 */
	public ArrayList<Log> getLogs();
}
