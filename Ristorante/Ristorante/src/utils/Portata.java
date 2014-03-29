/**
 * Questa classe ha la reponsabilità di contenere le proprietà dell'oggetto portata
 * @author Giacomo
 */
package utils;

public class Portata implements ProdottoCinese {
	private String nomePortata;
	private double prezzo;
	private boolean abbondante;
	
	public Portata(String nomePortata, double prezzo, boolean abbondante) {
		super();
		this.nomePortata = nomePortata;
		this.prezzo = prezzo;
		this.abbondante = abbondante;
	}
	
	public Portata(String nomePortata, double prezzo) {
		super();
		//abbondante=false;
		this.nomePortata = nomePortata;
		this.prezzo = prezzo;
		setPrezzo(prezzo);
	}

	public String getNome() {
		return nomePortata;
	}

	public void setNome(String nomePortata) {
		this.nomePortata = nomePortata;
	}

	public double getPrezzo() {
		return prezzo;
	}

	public void setPrezzo(double prezzo) {
		this.prezzo = prezzo;
	}

	public boolean isAbbondante() {
		return abbondante;
	}

	public void setAbbondante(boolean abbondante) {
		this.abbondante = abbondante;
		setPrezzo(prezzo);
	}
	
	@Override
	public String toString(){
		return getNome()+" "+getPrezzo()+" Euro ";
	}	
}
