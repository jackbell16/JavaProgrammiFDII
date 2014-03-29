package filtri.utils;

import java.util.ArrayList;
import java.util.Observable;

public class ProxyFiltro extends Observable implements Filtro {
	
	private Filtro filtro;

	public Filtro getFiltro() {
		return filtro;
	}

	public void setFiltro(Filtro filtro) {
		this.filtro = filtro;
	}

	@Override
	public void filtra(ArrayList<String> list) {
		filtro.filtra(list);	
	}
	
	@Override
	public ArrayList<Log> getRisultato() {
		return filtro.getRisultato();
	}
	
	public void update(){
		setChanged();
		notifyObservers();
	}
	
	@Override
	public String toString(){
		return filtro.toString();
	}
}
