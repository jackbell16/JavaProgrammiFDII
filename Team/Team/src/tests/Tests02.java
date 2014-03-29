/**
 * Questo test ha il compito di verificare il corretto funzionamento della 
 * classe {@link InterpreteFileLogTest}
 */
package tests;

import utils.file.CaricamentoFile;
import utils.log.InterpreteFileLogTest;

public class Tests02 {
	public static void main(String[] args) {
		CaricamentoFile file = new CaricamentoFile();
		file.setNomeFile("prova.txt");
		InterpreteFileLogTest logTest = new InterpreteFileLogTest();
		logTest.fileToLog(file.getList());
		for (int i = 0; i < logTest.getLogs().size(); i++) {
			System.out.println(logTest.getLogs().get(i));
		}
	}
}
