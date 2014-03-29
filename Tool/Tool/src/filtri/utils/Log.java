package filtri.utils;

import time.Orario;

public class Log {
	
	private String tipo;
	private Orario orario;
	private String testo;
	
	public Log(String tipo, Orario orario, String testo) {
		super();
		this.tipo = tipo;
		this.orario = orario;
		this.testo = testo;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public Orario getOrario() {
		return orario;
	}

	public void setOrario(Orario orario) {
		this.orario = orario;
	}

	public String getTesto() {
		return testo;
	}

	public void setTesto(String testo) {
		this.testo = testo;
	}
	
	@Override
	public String toString(){
		return getTipo()+" "+getOrario()+" "+getTesto();
	}
	
	/**
	 * Questo metodo permette di capire che tipo di Log è stato generato
	 * @param tipoLog
	 * @return
	 */
	public boolean isTypeOf(String tipoLog){
		if(getTipo().equalsIgnoreCase(tipoLog)){
			return true;
		}else{
			return false;
		}
	}
}