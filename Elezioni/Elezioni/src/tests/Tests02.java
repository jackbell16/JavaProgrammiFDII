/**
 * Questo test mostra le persone che vengono chiamate per diventare dei
 * scrutatori
 * @author Giacomo
 */
package tests;

import java.util.ArrayList;

import utils.elezioni.Cittadino;
import utils.elezioni.InterpreteInfoCittadinoDiTest;
import utils.elezioni.Quartiere;
import utils.elezioni.Seggio;
import utils.file.CaricamentoFile;

public class Tests02 {
	public static void mostraRisultato (ArrayList<Cittadino> cittadini){
		for (int i = 0; i < cittadini.size(); i++) {
			System.out.println(cittadini.get(i));
		}
	}
	public static void main(String[] args) {
		CaricamentoFile caricamentoFile = new CaricamentoFile();
		caricamentoFile.setFileName("prova.txt");
//		for (int i = 0; i < caricamentoFile.getList().size(); i++) {
//			System.out.println(caricamentoFile.getList().get(i));
//		}
		InterpreteInfoCittadinoDiTest test = new InterpreteInfoCittadinoDiTest();
		ArrayList<Cittadino> cittadini = test.listaCittadini(caricamentoFile.getList());
		Quartiere quartiere = new Quartiere("01", cittadini);
		Seggio seggio = new Seggio(quartiere, caricamentoFile.getList());
		seggio.estrazioneCittadini();
		System.out.println("Possibili scrutinatori");
		for (int i = 0; i < seggio.getScrutinatori().size(); i++) {
			System.out.println(seggio.getScrutinatori().get(i));
		}
		seggio.votanti();
		seggio.impostaSchede();
		System.out.println("Lista votanti con voto=1");
		System.out.println("Numero votanti con voto=1 sono "+seggio.quartiere.getCittadino1(seggio).size());
		mostraRisultato(seggio.quartiere.getCittadino1(seggio));
		System.out.println("Lista votanti con voto=2");
		System.out.println("Numero vontati con voto=2 sono "+seggio.quartiere.getCittadino2(seggio).size());
		mostraRisultato(seggio.quartiere.getCittadino2(seggio));
		}	
}