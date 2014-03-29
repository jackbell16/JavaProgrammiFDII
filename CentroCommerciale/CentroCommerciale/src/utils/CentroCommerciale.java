/**
 * Questa classe contiene gli attributi dell'oggetto Centro Commerciale e permette di aggiungere le varie attività
 * presenti
 * @author Giacomo
 */
package utils;

import java.util.ArrayList;

public class CentroCommerciale {
	
	private String nome;
	private ArrayList<Attività> attivitàs = new ArrayList<Attività>();
	
	
	public CentroCommerciale(String nome) {
		super();
		this.nome = nome;
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public ArrayList<Attività> getAttivitàs() {
		return attivitàs;
	}
	
	public void setAttivitàs(ArrayList<Attività> attivitàs) {
		this.attivitàs = attivitàs;
	}
	/**
	 * Questo metodo permette di aggiungere un'attività al centro commerciale
	 * @param attività
	 */
	public void AggiungiAttività(Attività attività){
		attivitàs.add(attività);
	}

	
}
