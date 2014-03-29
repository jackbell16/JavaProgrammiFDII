/**
 * Questa classe ha il compito di verificare il corretto funzionamento di una paninoteca
 */
package tests;

import utils.Bibita;
import utils.CassaPaninoteca;
import utils.Panino;

public class Tests04 {
	public static void main(String[] args) {
		Panino panino = new Panino("Prosciutto", 3);
		Bibita bibita = new Bibita("Coca", 2);
		CassaPaninoteca cassaPaninoteca = new CassaPaninoteca();
		cassaPaninoteca.aggiungiBibite(bibita, 1);
		cassaPaninoteca.aggiungiPanini(panino, 3);
		System.out.println(cassaPaninoteca.calcolaConto());
		cassaPaninoteca.aggiungiBibite(bibita, 1);
		cassaPaninoteca.aggiungiPanini(panino, 1);
		System.out.println(cassaPaninoteca.calcolaConto());
	}
}
