/**
 * Questa interfaccia astrae i metodi per l'impostazione dei dati relativi ai vari locali,
 * da file
 */
package utils;

import java.util.ArrayList;

public interface InterpreteReport {
	/**
	 * Questo metodo permette di settare i dati del locale, data una lista di Stringhe
	 * @param strings
	 * @return
	 */
	public ArrayList<Locale> creaLocaliDaFile(ArrayList<String> strings);
	/**
	 * Questo metodo converte una stringa in un oggetto di tipo Locale
	 * @param string
	 * @return
	 */
	public abstract Locale creaLocaleDaFile(String string);
}
