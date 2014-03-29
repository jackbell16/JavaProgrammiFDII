package utils.elezioni;

import java.util.ArrayList;

public class Quartiere {
	private String ID;
	private ArrayList<Cittadino> cittadini;
	public Quartiere(String iD, ArrayList<Cittadino> cittadini) {
		super();
		ID = iD;
		this.cittadini = cittadini;
	}
	public String getID() {
		return ID;
	}
	public void setID(String iD) {
		ID = iD;
	}
	public ArrayList<Cittadino> getCittadini() {
		return cittadini;
	}
	public void setCittadini(ArrayList<Cittadino> cittadini) {
		this.cittadini = cittadini;
	}
	public ArrayList<Cittadino> getCittadino2(Seggio seggio) {
		return seggio.cittadino2;
	}
	public ArrayList<Cittadino> getCittadino1(Seggio seggio) {
		return seggio.cittadino1;
	}
	public void setCittadino2(Seggio seggio, ArrayList<Cittadino> cittadino2) {
		seggio.cittadino2 = cittadino2;
	}
	public void setCittadino1(Seggio seggio, ArrayList<Cittadino> cittadino1) {
		seggio.cittadino1 = cittadino1;
	}
}
