package utils;

import java.util.ArrayList;

public interface Cassa {
	
	public ArrayList<Object> getConto() ;
		
	public void setConto(ArrayList<Object> conto) ;
		
	public double calcolaConto() ;
	
	public void aggiungiProdotti(Object object, int quantità);
	
	// chiedere 

}
