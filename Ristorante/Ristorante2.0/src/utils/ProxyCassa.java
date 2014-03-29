package utils;

import java.util.ArrayList;

public class ProxyCassa implements ICassa  {
	private ArrayList<Prodotto> conto = new ArrayList<>();
	private int IDCassa;
	Cassa cassa = new Cassa();
	CassaPizzeria cassaPizzeria = new CassaPizzeria();
	CassaCinese cassaCinese = new CassaCinese();
	CassaPaninoteca cassaPaninoteca = new CassaPaninoteca();
	
	public ProxyCassa(int iDCassa) {
		super();
		IDCassa = iDCassa;
	}

	public int getIDCassa() {
		return IDCassa;
	}
	
	

	public ArrayList<Prodotto> getConto() {
		return conto;
	}

	public void setConto(ArrayList<Prodotto> conto) {
		this.conto = conto;
	}

	public void setIDCassa(int iDCassa) {
		IDCassa = iDCassa;
	}

	@Override
	public double calcolaConto() {
		double totale = 0;
		if(IDCassa == 1){
			cassaPizzeria.setConto(getConto());
			totale = cassaPizzeria.calcolaConto();
			cassaPizzeria.getConto().clear();
			return totale;
		}else if(IDCassa == 2){
			cassaCinese.setConto(getConto());
			totale = cassaCinese.calcolaConto();
			cassaCinese.getConto().clear();
			return totale;
		}else if(IDCassa == 3){
			cassaPaninoteca.setConto(getConto());
			totale = cassaPaninoteca.calcolaConto();
			cassaPaninoteca.getConto().clear();
			return totale;
		}
		return IDCassa;
		
	}
}
