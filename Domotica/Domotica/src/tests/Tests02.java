/**
 * Questo test verifica il corretto funzionamento della classe Info
 */
package tests;

import utils.CaricamentoFile;
import utils.Info;

public class Tests02 {
	public static void main(String[] args) {
		CaricamentoFile file = new CaricamentoFile();
		file.setFileName("prova.txt");
		Info info = new Info();
		info.filtro(file.getList());
		for (int i = 0; i < Info.risultato.size(); i++) {
			System.out.println(Info.risultato.get(i));
		}
	}
}
