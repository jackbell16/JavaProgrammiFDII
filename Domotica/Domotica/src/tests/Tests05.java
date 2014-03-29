/**
 * Questo test ha come scopo quello di verificare il corretto fuzionamento
 * della classe ProxyFiltro
 * @author Giacomo
 */
package tests;

import java.util.ArrayList;

import utils.CaricamentoFile;
import utils.ProxyFiltro;

public class Tests05 {
	/**
	 * Questo metodo permette di stampare facilmente il risultato del
	 * filtro
	 * @param list
	 */
	public static void stampaRisultato(ArrayList<String> list){
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
	}
	public static void main(String[] args) {
		CaricamentoFile file = new CaricamentoFile();
		file.setFileName("prova.txt");
		ProxyFiltro filtro = new ProxyFiltro();
		filtro.setFiltroID(1);
		stampaRisultato(filtro.filtro(file.getList()));
		filtro.setFiltroID(2);
		stampaRisultato(filtro.filtro(file.getList()));
	}
}
