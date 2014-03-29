/**
 * Questo test ha il compito di verificare il corretto funzionamento della classe 
 * {@link CaricamentoFile}

import utils.file.CaricamentoFile;
 */
package tests;

import java.util.ArrayList;

import utils.file.CaricamentoFile;

public class Tests01 {

	public static void main(String[] args) {
		CaricamentoFile file = new CaricamentoFile();
		file.setNomeFile("prova.txt");
		mostraRisultato(file.getList());
	}

	private static void mostraRisultato(ArrayList<String> list) {
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
	}
}
