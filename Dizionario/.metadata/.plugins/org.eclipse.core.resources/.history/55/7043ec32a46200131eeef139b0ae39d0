/**
 * Questa classe permette di creare un formato "facile" da utilizzare del file dizionario
 * letto. L'utilizzo delle HashMap, permette di facilitare la creazione di esso.
 * Da notare l'utilizzo del design pattern Singleton, per creare una sola istanza di dizionario alla volta
 * @author Giacomo
 */
package utils;

import java.util.HashMap;

public class Dizionario implements LayOutDizionario {
	private static String separatoreParole = "\\-";
	private static String sepratoreFrase = "\\-/";
	private final static Dizionario dizionario = new Dizionario();
	private Dizionario() {}
	public static Dizionario getInstance(){
		return dizionario;
	}
	public static HashMap<String , String > corrispondenzaParola = new HashMap<>();
	public static HashMap<String, String> corrispondenzaFrase = new HashMap<>();
	public static HashMap<String, String> getCorrispondenza() {
		return corrispondenzaParola;
	}
	public void setCorrispondenza(HashMap<String, String> corrispondenza,String string) {
		CaricaDizionario.setFileName(string);
		for (int i = 0; i < CaricaDizionario.list.size(); i++) {
			String[] arr = CaricaDizionario.list.get(i).split(separatoreParole);
			String parolaOriginale = arr[0]; 
			String parolaTradotta = arr[1];
			String[] strings = CaricaDizionario.list.get(i).split(sepratoreFrase);
			String frase = strings[1];
			corrispondenzaParola.put(parolaOriginale, parolaTradotta);
			corrispondenzaFrase.put(parolaTradotta, frase);
		}
	}
}
