package tests;

import utils.Bibita;
import utils.CassaPaninoteca;
import utils.MenuTuristico;
import utils.Panino;

public class Tests02 {
	public static void main(String[] args) {
		MenuTuristico menuTuristico = new MenuTuristico();
		CassaPaninoteca cassaPaninoteca = new CassaPaninoteca();
		cassaPaninoteca.setMenuPrezzoFisso(menuTuristico);
		Panino panino = new Panino("Prosciutto",3);
		Bibita bibita = new Bibita("Coca Cola", 2.50);
		cassaPaninoteca.aggiungiProdotti(bibita, 1);
		cassaPaninoteca.aggiungiProdotti(panino, 1);
		System.out.println(cassaPaninoteca.calcolaConto());
		cassaPaninoteca.aggiungiProdotti(panino, 3);
		System.out.println(cassaPaninoteca.calcolaConto());
		}
}
