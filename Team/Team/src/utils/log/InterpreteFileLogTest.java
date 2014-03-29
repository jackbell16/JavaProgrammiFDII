package utils.log;

import java.util.ArrayList;
import java.util.StringTokenizer;

public class InterpreteFileLogTest implements InterpreteFileLog {
	
	private ArrayList<Log> logs;
	
	@Override
	public void fileToLog(ArrayList<String> list) {
		logs = new  ArrayList<>();
		for (int i = 0; i < list.size(); i++) {
			StringTokenizer stringTokenizer = new StringTokenizer(list.get(i));
			String nome = stringTokenizer.nextToken();
			String cognome = stringTokenizer.nextToken();
			int ore = Integer.valueOf(stringTokenizer.nextToken());
			String attivita = stringTokenizer.nextToken();
			String giorno = stringTokenizer.nextToken("-");
			String mese = stringTokenizer.nextToken("-");
			String anno = stringTokenizer.nextToken("-");
			Attivita attivitaSvolta = new Attivita(ore, attivita);
			Dipendente dipendente = new Dipendente(nome, cognome);
			Data data = new Data(giorno, mese, anno);
			Log log = new Log(dipendente, attivitaSvolta, data);
			logs.add(log);
		}
	}
	@Override
	public ArrayList<Log> getLogs() {
		return logs;
	}
}
