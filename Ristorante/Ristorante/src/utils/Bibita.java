/**
 * Questa classe ha la reponsabilità di contenere le proprietà dell'oggetto bibita
 * @author Giacomo
 */
package utils;

public class Bibita implements ProdottoPaninoteca  {
	private String nomeBibita;
	private double prezzo;
	public Bibita(String nomeBibita, double prezzo) {
		super();
		this.nomeBibita = nomeBibita;
		this.prezzo = prezzo;
	}
	@Override
	public String getNome() {
		return nomeBibita;
	}
	@Override
	public double getPrezzo() {
		return prezzo;
	}
	@Override
	public void setNome(String nomeProdotto) {
		this.nomeBibita = nomeProdotto;
	}
	@Override
	public void setPrezzo(double prezzo) {
		this.prezzo = prezzo;
	}
	@Override
	public String toString(){
		return getNome()+" "+getPrezzo()+" Euro"; 
	}
}
