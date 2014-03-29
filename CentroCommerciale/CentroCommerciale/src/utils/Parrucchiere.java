package utils;

import java.util.ArrayList;

public class Parrucchiere extends Attività {
	public  Parrucchiere(String nome, ArrayList<Locale> locales , double costifissi,
		 double incasso) {
		super();
		this.nome = nome;
		this.costifissi = costifissi;
		this.incassoTotale = incasso;
		this.locaList = locales;
	}
	@Override
	public String toString(){
		return nome+costifissi+incassoTotale;
	}
}
