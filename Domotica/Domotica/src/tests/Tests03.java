package tests;

import utils.Allarme;
import utils.CaricamentoFile;

public class Tests03 {
	public static void main(String[] args) {
		CaricamentoFile file = new CaricamentoFile();
		file.setFileName("prova.txt");
		Allarme allarme = new Allarme();
		allarme.filtro(file.getList());
		for (int i = 0; i < Allarme.risultato.size(); i++) {
			System.out.println(Allarme.risultato.get(i));
		}
	}
}
