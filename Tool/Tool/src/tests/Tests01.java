/**
 * Questo test ha lo scopo di verificare la corretta apertura di un file testuale
 */
package tests;

import utils.CaricamentoFile;

public class Tests01 {
	public static void main(String[] args) {
		CaricamentoFile caricamentoFile = new CaricamentoFile();
		caricamentoFile.setNomeFile("/Users/Giacomo/Desktop/Tool/Tool/prova.txt");
		for (int i = 0; i < caricamentoFile.getList().size(); i++) {
			System.out.println(caricamentoFile.getList().get(i));
		}
	}
}
