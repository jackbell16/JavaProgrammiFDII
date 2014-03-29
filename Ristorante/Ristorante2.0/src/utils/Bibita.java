package utils;

public class Bibita implements Prodotto {
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
	public void setNome(String nomePanino) {
		this.nomeBibita = nomePanino;
		
	}
	@Override
	public void setPrezzo(double prezzo) {
		this.prezzo = prezzo;
	}
}