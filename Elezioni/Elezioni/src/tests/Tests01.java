/**
 * Questo test ha lo scopo di verificare la correttare lettura del file e
 * crazione dei relativi Cittadini
 * @author Giacomo
 */
package tests;

import java.util.ArrayList;

import utils.elezioni.Cittadino;
import utils.elezioni.InterpreteInfoCittadinoDiTest;
import utils.elezioni.Quartiere;
import utils.file.CaricamentoFile;

public class Tests01 {
	public static void main(String[] args) {
		CaricamentoFile caricamentoFile = new CaricamentoFile();
		caricamentoFile.setFileName("prova.txt");
		for (int i = 0; i < caricamentoFile.getList().size(); i++) {
			System.out.println(caricamentoFile.getList().get(i));
		}
		InterpreteInfoCittadinoDiTest test = new InterpreteInfoCittadinoDiTest();
		ArrayList<Cittadino> cittadini = test.listaCittadini(caricamentoFile.getList());
		for (int i = 0; i < cittadini.size(); i++) {
			System.out.println(cittadini.get(i));
		}
	}
}
