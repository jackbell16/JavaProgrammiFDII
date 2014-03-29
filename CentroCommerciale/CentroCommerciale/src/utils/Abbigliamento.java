package utils;

import java.util.ArrayList;

public class Abbigliamento extends Attività  {

	public Abbigliamento(String nome, ArrayList<Locale> locales , double costifissi,double incasso) {
		super();
		this.nome = nome;
		this.costifissi = costifissi;
		this.incassoTotale = incasso;
		this.locaList = locales;
	}
}
