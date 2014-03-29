/**
 * Questa classe contiene i metodi per impostare i dati realtivi alle varie attività
 */
package utils;

import java.util.ArrayList;

public class Attività  {

	protected String nome;
	protected double costifissi;
	protected double incassoTotale;
	protected ArrayList<Locale> locaList = new ArrayList<Locale>();
	

	public Attività(){
		super();
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	

	public double getCostifissi() {
		return costifissi;
	}

	public void setCostifissi(double costifissi) {
		this.costifissi = costifissi;
	}
	
	
	public double getIncassoTotale() {
		return incassoTotale;
	}

	public void setIncassoTotale(double incassoTotale) {
		this.incassoTotale = incassoTotale;
	}

	public ArrayList<Locale> getLocaList() {
		return locaList;
	}

	public void setLocaList(ArrayList<Locale> locaList) {
		this.locaList = locaList;
	}
	
	/**
	 * Questo metodo permete di calcolare il guadagno dell'attività
	 * @return
	 */

	public double calcoloGuadagno() {
		double guadagno = 0;
		guadagno = incassoTotale - incassoTotale*0.6 -calcolaCostiFissi();
		setIncassoTotale(0);
		locaList.clear();
		return guadagno;
	}

	private double calcolaCostiFissi() {
		for (int i = 0; i < locaList.size(); i++) {
			Locale locale = locaList.get(i);
			if(locale.verificaScontoMetratatura()){
				costifissi+=locale.getMetriQuadrati()*locale.getPrezzoMetroQuadroScontato();
			}else{
				costifissi+=locale.getMetriQuadrati()*locale.getPrezzoMetroQuadroStandard();
			}
		}	
		setCostifissi(costifissi);
		return costifissi;
	}
}