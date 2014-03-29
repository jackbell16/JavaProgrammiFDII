package utils.elezioni;

import java.util.ArrayList;
import java.util.StringTokenizer;

public class InterpreteInfoCittadinoDiTest implements InterpetreInfoCittadino {

	@Override
	public Cittadino stringToCittadino(String string) {
		StringTokenizer stringTokenizer = new StringTokenizer(string);
		String codiceFiscale = stringTokenizer.nextToken();
		String cognome = stringTokenizer.nextToken();
		String nome = stringTokenizer.nextToken();
		String eta = stringTokenizer.nextToken();
		Cittadino cittadino = new Cittadino(nome, cognome, codiceFiscale, Integer.valueOf(eta));
		return cittadino;
	}
	
	@Override
	public ArrayList<Cittadino> listaCittadini(ArrayList<String> list) {
		ArrayList<Cittadino> cittadini = new ArrayList<>();
		for (int i = 0; i < list.size(); i++) {
			Cittadino cittadino = stringToCittadino(list.get(i));
			cittadini.add(cittadino);
		}
		return cittadini;
	}
}
