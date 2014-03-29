package utils;

import java.util.ArrayList;

import filtri.utils.Log;

public interface InterpreteFileLog {

	/**
	 * Questo metodo permette di converitre una lista di stringhe in Logs
	 * @param list
	 */
	public abstract void fileTolog(ArrayList<String> list);

	public abstract ArrayList<Log> getLogs();

}