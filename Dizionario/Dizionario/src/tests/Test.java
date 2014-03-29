/**
 * Questa classe verifica il corretto funzionamento del caricamento del dizionario e della traduzione
 * @author Giacomo
 */
package tests;

import utils.CaricaDizionario;
import utils.Dizionario;

public class Test {
	public static void main(String[] args) {
		Dizionario.getInstance().setCorrispondenza(Dizionario.corrispondenzaParola, "prova.txt");
		System.out.println("Traduzione "+Dizionario.getInstance().corrispondenzaParola.get("Giallo")+" Frase "+Dizionario.corrispondenzaFrase.get(Dizionario.corrispondenzaParola.get("Giallo")));
		CaricaDizionario.setFileName("prova.txt");
	}
}