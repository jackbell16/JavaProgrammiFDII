package utils;


public class RistorantePizzeria extends Ristorante {
	private String nomePizzeria;

	public RistorantePizzeria(String nomePizzeria) {
		super();
		this.nomePizzeria = nomePizzeria;
	}

	public String getNomePizzeria() {
		return nomePizzeria;
	}

	public void setNomePizzeria(String nomePizzeria) {
		this.nomePizzeria = nomePizzeria;
	}
}
