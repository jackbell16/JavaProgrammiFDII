/**
 * Questa classe ha la responsabilit di caricare il file di Log, per essere disponibile 
 * all'utente, attraverso l'interfaccia grafica.
 * @author Giacomo
 */
package utils;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class CaricamentoFileReport {
	private static BufferedReader reader;
	private static ArrayList<String> list;
	public static ArrayList<String> setFileName(String string){
		try {
			reader = new BufferedReader(new FileReader(new File(string)));
			String line=reader.readLine();
			list = new ArrayList<String>();
			while(line!=null){
				getList().add(line);
				line=reader.readLine();
			}
			reader.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return list;
	}
	public static ArrayList<String> getList() {
		return list;
	}
}	
