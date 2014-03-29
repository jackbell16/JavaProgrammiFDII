/**
 * Questa classe ha la responsabilità di contenere gli attributi relativi agli oggetti di tipo Locale.
 * @author Giacomo
 */
package utils;

import java.util.ArrayList;

public class Locale {
	private PrezziMetriQuadrati data = new PrezziMetriQuadrati(140, 8, 7);

	public Locale(int identificativo, double metriQuadrati, boolean operativo,
			int incasso) {
		super();
		this.data.identificativo = identificativo;
		this.data.metriQuadrati = metriQuadrati;
		this.data.operativo = operativo;
		this.data.incasso = incasso;
	}
	
	public Locale(int identificativo) {
		super();
		this.data.identificativo = identificativo;
	}

	public int getIdentificativo() {
		return data.identificativo;
	}
	public void setIdentificativo(int identificativo) {
		this.data.identificativo = identificativo;
	}
	public double getMetriQuadrati() {
		return data.metriQuadrati;
	}
	public void setMetriQuadrati(double metriQuadrati) {
		this.data.metriQuadrati = metriQuadrati;
	}
	public boolean isOperativo() {
		return data.operativo;
	}
	public void setOperativo(boolean operativo) {
		this.data.operativo = operativo;
	}
	public int getIncasso() {
		return data.incasso;
	}
	public void setIncasso(int incasso) {
		this.data.incasso = incasso;
	}
	
	public double getNumeroMetraturaDiSoglia() {
		return data.numeroMetraturaDiSoglia;
	}
	public void setNumeroMetraturaDiSoglia(double numeroMetraturaDiSoglia) {
		this.data.numeroMetraturaDiSoglia = numeroMetraturaDiSoglia;
	}
	public double getPrezzoMetroQuadroStandard() {
		return data.prezzoMetroQuadroStandard;
	}
	public void setPrezzoMetroQuadroStandard(double prezzoMetroQuadroStandard) {
		this.data.prezzoMetroQuadroStandard = prezzoMetroQuadroStandard;
	}
	public double getPrezzoMetroQuadroScontato() {
		return data.prezzoMetroQuadroScontato;
	}
	public void setPrezzoMetroQuadroScontato(double prezzoMetroQuadroScontato) {
		this.data.prezzoMetroQuadroScontato = prezzoMetroQuadroScontato;
	}
	/**
	 * Questo metodo verifica l'eventuale sconto sul prezzo dell'affitto
	 * @return
	 */
	public boolean verificaScontoMetratatura() {
		if(getMetriQuadrati()>=data.numeroMetraturaDiSoglia){
			return true;
		}else{
			return false;
		}
	}
	@Override
	public String toString(){
		return getIdentificativo()+" "+getMetriQuadrati()+" "+isOperativo()+" "+getIncasso();
	}

	public boolean stessoIdentificativo(Locale locale10) {
		return getIdentificativo()==locale10.getIdentificativo();
	}
	
	/**
	 * Questo metodo permette di visualizzare i locali vuoti, oppure in vendita
	 * @param locali
	 */
	public static void mostraLocaliNonUsati(ArrayList<Locale> locali){
		System.out.println("Report locali vuoti oppure in vendità:");	
		for (int i = 0; i < locali.size(); i++) {
			Locale locale = locali.get(i);
				if(!locale.isOperativo()){
				System.out.println("ID: "+locale.getIdentificativo()+" MetriQuadrati: "+locale.getMetriQuadrati());
			}	
		}	
	}
	
}
