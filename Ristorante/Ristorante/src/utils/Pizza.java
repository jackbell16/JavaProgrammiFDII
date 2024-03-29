/**
 * Questa classe ha la reponsabilità di contenere le proprietà dell'oggetto pizza
 * @author Giacomo
 */
package utils;

public class Pizza implements ProdottoPizzeria {
	
	private String nomePizza;
	private double prezzo;
	
	public Pizza(String nomePizza, double prezzo) {
		super();
		this.nomePizza = nomePizza;
		this.prezzo = prezzo;
	}
	
	public String getNome() {
		return nomePizza;
	}
	
	public void setNome(String nomePizza) {
		this.nomePizza = nomePizza;
	}
	
	public double getPrezzo() {
		return prezzo;
	}
	
	public void setPrezzo(double prezzo) {
		this.prezzo = prezzo;
	}
	@Override
	public String toString(){
		return getNome()+" "+getPrezzo()+" Euro";
	}
}
