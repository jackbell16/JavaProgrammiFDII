/**
 * Questa classe ha il compito di caricare il file e trasformarlo in
 * ArrayList.
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
	private static BufferedReader reader;
	private static ArrayList<String> list = new ArrayList<String>();
	public static ArrayList<String> setFileName(String string){
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
		return CaricamentoFile.list;
	}
	public static ArrayList<String> getList() {
		return list;
	}
	public static void setList(ArrayList<String> list) {
		CaricamentoFile.list = list;
	}
}
