/**
 * Questo test verifica il corretto funzionamento dell'individuazioni dei log di tipo "Info"
 * @author Giacomo
 */
package tests;

import utils.CaricamentoFile;
import utils.InterpreteFileLog;
import utils.InterpreteFileLogTest;

public class Tests02 {
	public static void main(String[] args) {
		CaricamentoFile caricamentoFile = new CaricamentoFile();
		caricamentoFile.setNomeFile("/Users/Giacomo/Desktop/Tool/Tool/prova.txt");
		InterpreteFileLog fileLog = new InterpreteFileLogTest();
		fileLog.fileTolog(caricamentoFile.getList());
		for (int i = 0; i < fileLog.getLogs().size(); i++) {
			if(fileLog.getLogs().get(i).getTipo().contains("Info")){
			System.out.println(fileLog.getLogs().get(i));
			}
		}
	}
}