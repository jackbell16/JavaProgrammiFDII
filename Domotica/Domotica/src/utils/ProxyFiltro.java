package utils;

import java.util.ArrayList;

public class ProxyFiltro implements Filtro {
	private int filtroID = 0;
	private Allarme allarme = new Allarme();
	private static int allarmeID = 1;
	private Info info= new Info();
	private static int infoID = 2;
	public int getFiltroID() {
		return filtroID;
	}
	public void setFiltroID(int filtroID) {
		this.filtroID = filtroID;
	}
	@Override
	public ArrayList<String> filtro(ArrayList<String> list) {
		if(filtroID==allarmeID){
			allarme.filtro(list);
			return Allarme.risultato;
		}else if(filtroID==infoID){
			info.filtro(list);
			return Info.risultato;
		}else{
		return null;
		}
	}
}
