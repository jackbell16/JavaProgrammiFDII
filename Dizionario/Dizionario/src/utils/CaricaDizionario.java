/**
 * Questa classe permette di caricare un file, contenente un dizionario
 */
package utils;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class CaricaDizionario {
	private static BufferedReader reader;
	public static ArrayList<String> list = new ArrayList<>();

	public static void setFileName(String string){
		try {
			reader = new BufferedReader(new FileReader(new File(string)));
			String line=reader.readLine();
			while(line!=null){
				//System.out.println(line);
				list.add(line);
				line=reader.readLine();
			}
			System.out.println("File aperto correttamente");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}