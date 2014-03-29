/**
 * Questo test deve verificare il corretto funzionamento della classe
 * @see CaricamentoFile
 * @author Giacomo
 */
package tests;

import utils.CaricamentoFile;

public class Tests01 {
	public static void main(String[] args) {
		CaricamentoFile file = new CaricamentoFile();
		file.setFileName("prova.txt");
		for (int i = 0; i < file.getList().size(); i++) {
			System.out.println(file.getList().get(i));
		}
	}
}
