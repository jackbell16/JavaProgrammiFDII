package utils;

public class Portata implements Prodotto {
	private String nomePortata;
	private double prezzo;
	@Override
	public String getNome() {
		return nomePortata;
	}
	@Override
	public double getPrezzo() {
		return prezzo;
	}
	@Override
	public void setNome(String nomePortata) {
		this.nomePortata = nomePortata;
		
	}
	@Override
	public void setPrezzo(double prezzo) {
		this.prezzo = prezzo;
	}
}