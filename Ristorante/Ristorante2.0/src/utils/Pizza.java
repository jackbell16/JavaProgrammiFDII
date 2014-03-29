package utils;

public class Pizza implements Prodotto {
	private String nomePizza;
	private double prezzo;
	
	public Pizza(String nomePizza, double prezzo) {
		super();
		this.nomePizza = nomePizza;
		this.prezzo = prezzo;
	}
	@Override
	public String getNome() {
		return nomePizza;
	}
	@Override
	public void setNome(String nomePizza) {
		this.nomePizza = nomePizza;
		
	}
	@Override
	public double getPrezzo() {
		return prezzo;
	}
	@Override
	public void setPrezzo(double prezzo) {
		this.prezzo = prezzo;
		}
	@Override
	public String toString(){
		return getNome()+" "+getPrezzo()+" Euro ";
	}
}
