/**
 * Questa classe astrae sul concetto di Dipendente, che compie attivita
 */
package utils.log;

import java.util.ArrayList;

public class Dipendente {
	
	private String nome;
	private String cognome;
	private ArrayList<Attivita> attivita = new ArrayList<>();
	
	public Dipendente(String nome, String cognome, Attivita attivita) {
		super();
		this.nome = nome;
		this.cognome = cognome;
		this.attivita.add(attivita);
	}
	
	public Dipendente(String nome, String cognome) {
		super();
		this.nome = nome;
		this.cognome = cognome;
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCognome() {
		return cognome;
	}

	public void setCognome(String cognome) {
		this.cognome = cognome;
	}

	public ArrayList<Attivita> getAttivita() {
		return attivita;
	}

	public void setAttivita(ArrayList<Attivita> attivita) {
		this.attivita = attivita;
	}
	public void aggiungiAttivita(Attivita attivita){
		this.attivita.add(attivita);
	}
	public boolean stessoDipendente(Dipendente dipendente2){
		boolean risultato = false;
		if(getNome().equalsIgnoreCase(dipendente2.getNome())&&
				getCognome().equalsIgnoreCase(dipendente2.getCognome())){
			risultato = true;
		}
		return risultato;
	}
	@Override
	public String toString(){
		return getNome()+" "+getCognome();
	}
	public boolean isPresente(ArrayList<Dipendente> dipendenti){
		boolean risultato = false;
		for (int i = 0; i < dipendenti.size(); i++) {
			if(stessoDipendente(dipendenti.get(i))){
				risultato = true;
			}
		}
		return risultato;
	}
}
