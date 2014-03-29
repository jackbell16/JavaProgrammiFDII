/**
 * Questa classe ha la responsabilità di leggere un file e convertirlo in una
 * {@link ArrayList} di stringhe
 * @author Giacomo
 */
package utils;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class CaricamentoFile {
	
	private ArrayList<String> list = new ArrayList<>();
	private BufferedReader reader;
	
	/**
	 * Questo metodo permette di passare il percorso e il nome di file da leggere
	 * @param string
	 */
	public void setNomeFile(String string){
		try {
			reader = new BufferedReader(new FileReader(new File(string)));
			String line=reader.readLine();
			list.clear();
			while(line!=null){
				//System.out.println(line);
				list.add(line);
				line=reader.readLine();
			}
			reader.close();
			//System.out.println("File aperto correttamente");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public ArrayList<String> getList() {
		return list;
	}

	public void setList(ArrayList<String> list) {
		this.list = list;
	}
	
	
}
