/**
 * Questa classe è un tipo di Interprete di Report, che viene fatto per testare il corretto funzionamento
 * del mostra Risultato
 * @author Giacomo
 */
package utils;

import java.util.ArrayList;
import java.util.StringTokenizer;

public class InterpreteReportTest implements InterpreteReport {
	@Override
	public ArrayList<Locale> creaLocaliDaFile(ArrayList<String> strings){
		ArrayList<Locale> locali = new ArrayList<Locale>();
		for (int i = 0; i < strings.size(); i++) {
			Locale locale = creaLocaleDaFile(strings.get(i));
			locali.add(locale);
		}
		return locali;
	}
	@Override
	public Locale creaLocaleDaFile(String string) {
			StringTokenizer tokenizer = new StringTokenizer(string);
			int identificativo = Integer.valueOf(tokenizer.nextToken());
			int metriQuadrati = Integer.valueOf(tokenizer.nextToken());
			boolean operativo = Boolean.valueOf(tokenizer.nextToken());
			int incasso = Integer.valueOf(tokenizer.nextToken());
			
		Locale locale = new Locale(identificativo, metriQuadrati, operativo, incasso);
		return locale;
	}
}
