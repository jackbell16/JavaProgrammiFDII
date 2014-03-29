package utils;

public class Panino implements Prodotto {
	private String nomePanino;
	private double prezzo;
	
	public Panino(String nomePanino, double prezzo) {
		super();
		this.nomePanino = nomePanino;
		this.prezzo = prezzo;
	}
	@Override
	public String getNome() {
		return nomePanino;
	}
	@Override
	public double getPrezzo() {
		return prezzo;
	}
	@Override
	public void setNome(String nomePanino) {
		this.nomePanino = nomePanino;
		
	}
	@Override
	public void setPrezzo(double prezzo) {
		this.prezzo = prezzo;
	}
}
